package com.ilovemengmei.ccstraining2020.servlet;

import com.alibaba.fastjson.JSONObject;
import com.ilovemengmei.ccstraining2020.dao.UserDao;
import com.ilovemengmei.ccstraining2020.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends BaseServlet{

    private UserDao userDao = new UserDaoImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        preprocess(response);
        String username = request.getParameter("username");
        JSONObject data = new JSONObject();
        if(userDao.findByUsername(username) != null){
            data.put("status",0);
            data.put("msg","用户名已存在！");
            response.getWriter().write(data.toJSONString());
            return;
        }
        String password = request.getParameter("password");
        String passwordVerify = request.getParameter("password_verify");
        if(!password.equals(passwordVerify)){
            data.put("status",0);
            data.put("msg","输入的密码不一致！");
            response.getWriter().write(data.toJSONString());
            return;
        }
        String email = request.getParameter("email");
        System.out.println(username);
    }
}
