package com.ilovemengmei.ccstraining2020.servlet;
import com.alibaba.fastjson.JSON;
import com.ilovemengmei.ccstraining2020.dao.RenterDao;
import com.ilovemengmei.ccstraining2020.dao.impl.RenterDaoImpl;
import com.ilovemengmei.ccstraining2020.domain.Renter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

// 在个人资料界面查用户的：用户名、邮箱、房产数量
@WebServlet("/basicInfo")
public class BasicInfoServlet  extends BaseServlet{

    private RenterDao renterDao = new RenterDaoImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("receive post msg from basicInfo!");

    }
}
