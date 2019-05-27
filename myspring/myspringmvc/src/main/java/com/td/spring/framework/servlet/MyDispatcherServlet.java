package com.td.spring.framework.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyDispatcherServlet extends HttpServlet {

    public MyDispatcherServlet() {
        super();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
       super.init(config);

       String propertiesLocation = config.getInitParameter("contextConfigLocation");

        // 获取配置文件

        // 扫描类文件

        // 添加到IOC容器

        // 依赖注入

        // 获取handlermapping

        //controller调用

        //返回结果

    }


}
