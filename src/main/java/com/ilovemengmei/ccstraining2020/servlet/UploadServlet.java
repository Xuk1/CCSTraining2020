package com.ilovemengmei.ccstraining2020.servlet;

import com.ilovemengmei.ccstraining2020.dao.UserDao;
import com.ilovemengmei.ccstraining2020.dao.impl.UserDaoImpl;
import com.ilovemengmei.ccstraining2020.domain.User;
import com.ilovemengmei.ccstraining2020.util.FileUploadUtils;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/upload")
public class UploadServlet extends BaseServlet {

    UserDao userDao = new UserDaoImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = (int)request.getSession().getAttribute("id");
        if(id == 0) return;
        String fileName = FileUploadUtils.writeFileContentFromRequest(request);
        if(fileName == null){
            response.setStatus(500);
            return;
        }
        User user = userDao.findById(id);
        user.setProfilePhoto("profilePhoto/" + fileName);
        userDao.update(user);
        response.getWriter().write("{}");
    }
}
