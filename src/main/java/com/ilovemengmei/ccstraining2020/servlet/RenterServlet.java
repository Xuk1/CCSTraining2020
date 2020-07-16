package com.ilovemengmei.ccstraining2020.servlet;

import com.alibaba.fastjson.JSON;
import com.ilovemengmei.ccstraining2020.dao.RenterDao;
import com.ilovemengmei.ccstraining2020.dao.impl.RenterDaoImpl;
import com.ilovemengmei.ccstraining2020.domain.Renter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/renter")
public class RenterServlet extends HttpServlet {

    private RenterDao renterDao = new RenterDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("Test");
        response.setHeader("content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        /* 允许跨域的主机地址 */
        response.setHeader("Access-Control-Allow-Origin", "*");
        /* 允许跨域的请求方法GET, POST, HEAD 等 */
        response.setHeader("Access-Control-Allow-Methods", "*");
        /* 重新预检验跨域的缓存时间 (s) */
        response.setHeader("Access-Control-Max-Age", "3600");
        /* 允许跨域的请求头 */
        response.setHeader("Access-Control-Allow-Headers", "*");
        /* 是否携带cookie */
        response.setHeader("Access-Control-Allow-Credentials", "true");
        try {
            String keyword = request.getParameter("keyword");
            System.out.println(keyword);
            //调用dao获得数据
            List<Renter> list = renterDao.findAll();
            if(keyword != null){
                list.removeIf(renter -> !renter.getRealName().contains(keyword));
            }
            //把JSON数据作为流返回给界面
            String jsonStr = JSON.toJSONString(list);
            PrintWriter out = response.getWriter();//响应对象的输出流:管道
            out.print(jsonStr);//jsonStr通过管道发送出去
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
