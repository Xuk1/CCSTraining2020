package com.ilovemengmei.ccstraining2020.dao.impl;

import com.ilovemengmei.ccstraining2020.dao.HouseDao;
import com.ilovemengmei.ccstraining2020.domain.House;
import com.ilovemengmei.ccstraining2020.domain.Renter;
import com.ilovemengmei.ccstraining2020.util.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class HouseDaoImpl implements HouseDao {

    private QueryRunner qr = new QueryRunner(JDBCUtil.getInstance().getDataSource());

    @Override
    public List<House> findAll() {
        String sql = "SELECT * FROM house";
        try {
            return qr.query(sql, new BeanListHandler<>(House.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<House> findAll(int ownerId) {
        String sql = "SELECT * FROM house WHERE ownerId=" + ownerId;
        try {
            return qr.query(sql, new BeanListHandler<>(House.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public House findById(int id) {
        return null;
    }

    @Override
    public int insert(House obj) {
        return 0;
    }

    @Override
    public int update(House obj) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
