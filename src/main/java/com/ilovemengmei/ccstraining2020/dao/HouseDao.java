package com.ilovemengmei.ccstraining2020.dao;

import com.ilovemengmei.ccstraining2020.domain.House;
import java.util.List;

public interface HouseDao extends BaseDao<House> {

    List<House> findAll(int ownerId);

}
