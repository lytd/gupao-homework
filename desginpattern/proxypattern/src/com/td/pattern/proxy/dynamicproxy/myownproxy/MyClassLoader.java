package com.td.pattern.proxy.dynamicproxy.myownproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyClassLoader extends ClassLoader {

    private final File classPathFile;

    public MyClassLoader(){
        String classPath = MyClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) {

        String className = MyClassLoader.class.getPackage().getName() + "." + name;

        if(classPathFile != null){

            File classFile = new File(classPathFile,name.replaceAll("\\.","/") + ".class");

            if(classFile.exists()){
                try( FileInputStream  in = new FileInputStream(classFile);
                     ByteArrayOutputStream out = new ByteArrayOutputStream();){
                   //将文件中的内容读取，写入内存
                    byte [] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1){
                        out.write(buff,0,len);
                    }
                    //调用ClassLoader的本地方法加载
                    return defineClass(className,out.toByteArray(),0,out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
}
