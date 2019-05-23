package com.td.pattern.proxy.dynamicproxy.myownproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MyProxy {

    static String nl = "\r\n";

    public static Object newProxyInstance(MyClassLoader myClassLoader, Class<?>[] interfaces, MyInvocationHandler myInvocationHandler) {
        try {
            //生成代码
            String sourceCode = generateSrc(interfaces);

            //保存到磁盘中
            String filePath = MyProxy.class.getResource("").getPath();


            FileWriter fw = null;
            File file = new File(filePath + "$Proxy0.java");

            fw = new FileWriter(file);
            fw.write(sourceCode);
            fw.flush();
            fw.close();


            //动态编译()

            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manage.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manage, null, null, null, iterable);
            task.call();
            manage.close();

            //加载运行

            Class proxyClass = myClassLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(MyInvocationHandler.class);
            file.delete();
//5、 返回字节码重组以后的新的代理对象
            return c.newInstance(myInvocationHandler);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {

        StringBuffer sb = new StringBuffer();

        //生成包路径
        sb.append("package com.td.pattern.proxy.dynamicproxy.myownproxy;" + nl);

        //生成引用包
        sb.append("import java.lang.reflect.*;" + nl);
        //引入被代理对象的实现接口
        for (Class inter : interfaces) {
            sb.append("import " + inter.getName() + ";" + nl);
        }

        String proxyClassName = "$Proxy0";

        //生成主类
        sb.append("public class " + proxyClassName + " implements " + interfaces[0].getSimpleName() + "{" + nl);

        //构造函数
        sb.append("MyInvocationHandler h;" + nl);
        sb.append("public " + proxyClassName + "(MyInvocationHandler h) { " + nl);
        sb.append("this.h = h;" + nl);
        sb.append("}" + nl);
        //接口函数
        for (Method method : interfaces[0].getMethods()) {


            //生成函数体
            sb.append("public " + method.getReturnType().getSimpleName() + " " + method.getName() + "(");

            Class<?>[] params = method.getParameterTypes();
            //保存参数
            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();
            //生成参数
            for (int i = 0; i < params.length; i++) {
                Class clazz = params[i];
                String type = clazz.getName();
                String paramName = toLowerFirstCase(clazz.getSimpleName())+i;
                paramNames.append(type + " " + paramName);
                paramValues.append(paramName);
                paramClasses.append(clazz.getName() + ".class");
                if (i != params.length - 1) {
                    paramNames.append(",");

                    paramClasses.append(",");
                    paramValues.append(",");
                }
            }

            sb.append(paramNames.toString());


            sb.append("){" + nl);
            //方法体
            //捕获异常
            sb.append("try{" + nl);

            sb.append("Method m=" + interfaces[0].getSimpleName() + ".class.getMethod(\"" + method.getName() + "\",new Class[]{" + paramClasses.toString() + "});" + nl);

            //调用实际对象的方法
            //sb.append("this.h.invoke(this,m,new Object[]{"+paramValues+"});"+nl);

            sb.append((hasReturnValue(method.getReturnType()) ? "return " : "") +
                    getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})", method.getReturnType()) + ";" + nl);

            sb.append("}catch(Error _ex) { }" + nl);
            sb.append("catch(Throwable e){" + nl);
            sb.append("throw new UndeclaredThrowableException(e);" + nl);
            sb.append("}");
            sb.append(getReturnEmptyCode(method.getReturnType()));

            sb.append("}");

        }
        sb.append("}");
        return sb.toString();
    }

    private static String toLowerFirstCase(String simpleName) {

        char[] chars = simpleName.toCharArray();
        if (chars[0] > 'A' && chars[0] < 'Z') {
            chars[0] += 32;
        }

        return String.valueOf(chars);
    }

    private static Map<Class, Class> mappings = new HashMap<Class, Class>();

    static {
        mappings.put(int.class, Integer.class);
    }

    private static String getReturnEmptyCode(Class<?> returnClass) {
        if (mappings.containsKey(returnClass)) {
            return "return 0;";
        } else if (returnClass == void.class) {
            return "";
        } else {
            return "return null;";
        }
    }


    private static String getCaseCode(String code, Class<?> returnClass) {
        if (mappings.containsKey(returnClass)) {
            return "((" + mappings.get(returnClass).getName() + ")" + code + ")." +
                    returnClass.getSimpleName() + "Value()";
        }
        return code;
    }

    private static boolean hasReturnValue(Class<?> clazz) {
        return clazz != void.class;
    }

}
