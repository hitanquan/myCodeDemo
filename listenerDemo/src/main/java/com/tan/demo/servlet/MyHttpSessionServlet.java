package com.tan.demo.servlet;

import com.tan.demo.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/myHttpSessionServlet")
public class MyHttpSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 测试MyServletRequestListener、MyHttpSessionListener监听器
        HttpSession session = request.getSession();
        //session.setAttribute("name", "wangwu");
        //session.setAttribute("name", "赵六");
        //session.removeAttribute("name");

        // 测试HttpSessionBindingListener监听器
        User user = new User();
        session.setAttribute("userObject", user);
        session.removeAttribute("userObject");

    }
}
