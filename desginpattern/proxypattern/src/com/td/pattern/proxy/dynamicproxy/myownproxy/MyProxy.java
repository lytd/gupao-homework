package com.td.pattern.proxy.dynamicproxy.myownproxy;

import java.lang.reflect.Method;

public class MyProxy {

    static String nl="\r\n";
    public static Object newProxyInstance(MyClassLoader myClassLoader, Class<?>[] interfaces, MyInvocationHandler myInvocationHandler) {

        //生成代码
        String sourceCode=generateSrc(interfaces);
        System.out.println(sourceCode);
        //动态编译

        //加载运行
        //myClassLoader.findClass(null);



        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {

        StringBuffer sb=new StringBuffer();

        //生成包路径
        sb.append("package com.td.pattern.proxy.dynamicproxy.myownproxy;"+nl);

        //生成引用包
        sb.append("import java.lang.reflect.*;"+nl);
            //引入被代理对象的实现接口
        for(Class inter:interfaces){
            sb.append("import "+inter.getName()+";"+nl);
        }

        String proxyClassName="Person"+"$Proxy";

        //生成主类
        sb.append("public class "+proxyClassName+" implements "+interfaces[0].getSimpleName()+"{");

            //构造函数
            sb.append("MyInvocationHandler h;" + nl);
            sb.append("public "+proxyClassName+"(MyInvocationHandler h) { " + nl);
            sb.append("this.h = h;");
            sb.append("}" + nl);
            //接口函数
            for(Method method:interfaces[0].getMethods()){

                System.out.println(method);

                method.getParameterTypes();
                //生成函数体
                sb.append("public "+method.getReturnType()+" "+method.getName()+"(");
                    //生成参数


                sb.append("){");
                //方法体





                sb.append("}");



            }
        sb.append("}");
        return sb.toString();
    }
}
