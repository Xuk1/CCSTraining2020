package com.ilovemengmei.ccstraining2020.dao.impl;

import com.ilovemengmei.ccstraining2020.dao.FeedbackDao;
import com.ilovemengmei.ccstraining2020.domain.Feedback;
import com.ilovemengmei.ccstraining2020.util.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;
import java.util.List;

public class FeedbackDaoImpl implements FeedbackDao {

    private QueryRunner qr = new QueryRunner(JDBCUtil.getInstance().getDataSource());

    @Override
    public List<Feedback> findAll() {
        return null;
    }

    @Override
    public Feedback findById(int id) {
        return null;
    }

    @Override
    public int insert(Feedback feedback) {
        String sql = "INSERT INTO feedback(addressType, address, sex, content,submitDate) values(?,?,?,?,?)";
        try {
            return qr.update(sql, feedback.getAddressType(),
                    feedback.getAddress(),feedback.getSex(),feedback.getContent(),feedback.getSubmitDate());
        }catch (SQLException e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int update(Feedback obj) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
