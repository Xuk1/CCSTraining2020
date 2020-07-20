package com.ilovemengmei.ccstraining2020.servlet;

import com.ilovemengmei.ccstraining2020.dao.HouseDao;
import com.ilovemengmei.ccstraining2020.dao.impl.HouseDaoImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@WebServlet("/delHouse")
public class DelHouseServlet extends BaseServlet{


    private HouseDao houseDao = new HouseDaoImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, IOException {
        request.setCharacterEncoding("UTF-8");
        int id = (int)request.getSession().getAttribute("id");
        if(id == 0) return;
        houseDao.delete(Integer.parseInt(request.getParameter("id")));
        response.getWriter().print("{}");
    }

}
