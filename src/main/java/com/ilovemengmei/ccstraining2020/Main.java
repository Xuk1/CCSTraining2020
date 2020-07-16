package com.ilovemengmei.ccstraining2020;

import com.ilovemengmei.ccstraining2020.dao.RenterDao;
import com.ilovemengmei.ccstraining2020.dao.impl.RenterDaoImpl;

public class Main {

    public static void main(String[] args) {
        RenterDao dao = new RenterDaoImpl();
        System.out.println(dao.findAll());
    }

}
