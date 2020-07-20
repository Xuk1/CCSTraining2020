package com.ilovemengmei.ccstraining2020.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// 添加房产的serverlet，接收前端添房产表单的post来的数据
@WebServlet("/addHouse")
public class addHouseServerlet extends BaseServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("receive post msg from addHouse!");
    }
}
