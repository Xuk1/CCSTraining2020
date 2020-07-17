package com.ilovemengmei.ccstraining2020.servlet;

import com.alibaba.fastjson.JSON;
import com.ilovemengmei.ccstraining2020.dao.RenterDao;
import com.ilovemengmei.ccstraining2020.dao.impl.RenterDaoImpl;
import com.ilovemengmei.ccstraining2020.domain.Renter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/renter")
public class RenterServlet extends BaseServlet {

    private RenterDao renterDao = new RenterDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        String username = (String)request.getSession().getAttribute("username");
        if(username == null) return;
        preprocess(response);
        String keyword = request.getParameter("keyword");
        List<Renter> list = renterDao.findAll(username);
        if(keyword != null){
            list.removeIf(renter -> !renter.getRealName().contains(keyword));
        }
        write(response,JSON.toJSONString(list));
    }

}
