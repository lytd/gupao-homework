package com.td.spring.framework.servlet;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.*;
import java.net.URL;
import java.util.Properties;

public class MyDispatcherServlet extends HttpServlet {

    public MyDispatcherServlet() {
        super();
    }

    private final static String scanPackage = "scanPackage";
    //全局配置
    private final static Properties properties=new Properties();







    @Override
    public void init(ServletConfig config) throws ServletException {

        String propertiesLocation = config.getInitParameter("contextConfigLocation");

        // 获取配置文件

        getProperties(propertiesLocation);

        // 扫描类文件
        doScan();


        // 添加到IOC容器

        // 依赖注入

        // 获取handlermapping

        //controller调用

        //返回结果

    }

    private void doScan() {
        //获取基础包路径

        String base = properties.getProperty(scanPackage);

        String rootPath="/" + base.replaceAll("\\.", "/");
        //获取根路径地址
        URL url = this.getClass().getClassLoader().getResource(rootPath);


        File classRootPath=new File(url.getFile());

        if (classRootPath.isDirectory()){

            for(File file:classRootPath.listFiles()){


            }

        }


        //扫描


    }

    private void getProperties(String propertiesLocation) {

        propertiesLocation = propertiesLocation.split(":")[1];

        InputStream io = this.getClass().getClassLoader().getResourceAsStream(propertiesLocation);

        try{
            properties.load(io);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
