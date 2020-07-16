package com.ilovementmei.ccstraining2020.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtils {

    private static final JDBCUtils INSTANCE = new JDBCUtils();
    private ComboPooledDataSource dataSource;


    private JDBCUtils(){
            dataSource = new ComboPooledDataSource();
            /*dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai&characterEncoding=UTF-8");
            dataSource.setUser("root");
            dataSource.setPassword("root");
            dataSource.setInitialPoolSize(5);
            dataSource.setMinPoolSize(5);
            dataSource.setMaxPoolSize(10);
            dataSource.setAcquireIncrement(3);*/
    }

    public static JDBCUtils getInstance() {
        return INSTANCE;
    }

    public ComboPooledDataSource getDataSource() {
        return dataSource;
    }

    public Connection getConnection(){
        try{
            return dataSource.getConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection(Connection connection){
        try {
            if(connection!=null && connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
