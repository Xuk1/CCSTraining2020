package com.ilovemengmei.ccstraining2020.dao;


import com.ilovemengmei.ccstraining2020.domain.Renter;
import com.ilovemengmei.ccstraining2020.domain.vo.Order;

import java.util.List;

public interface RenterDao extends BaseDao<Renter> {

    List<Order> findAllOrders();

    List<Renter> findAll(int landlordId);

    List<Order> findAllOrders(int landlordId);
}
