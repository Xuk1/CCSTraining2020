package com.ilovemengmei.ccstraining2020.dao;


import com.ilovemengmei.ccstraining2020.domain.Renter;
import com.ilovemengmei.ccstraining2020.domain.User;
import com.ilovemengmei.ccstraining2020.domain.vo.Order;

import java.util.List;

public interface UserDao extends BaseDao<User> {

    User findByUsername(String username);

}
