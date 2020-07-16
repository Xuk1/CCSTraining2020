package com.ilovementmei.ccstraining2020.dao.impl;

import com.ilovementmei.ccstraining2020.dao.PlayerDao;
import com.ilovementmei.ccstraining2020.domain.Player;
import com.ilovementmei.ccstraining2020.domain.vo.Inventory;
import com.ilovementmei.ccstraining2020.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class PlayerDaoImpl implements PlayerDao {

    private QueryRunner qr = new QueryRunner(JDBCUtils.getInstance().getDataSource());

    @Override
    public List<Inventory> findAllInventory() {
        String sql = "SELECT player.playerName,player.inventoryId,inventory.size FROM player INNER JOIN inventory ON player.inventoryId=inventory.inventoryId";
        try {
            return qr.query(sql,new BeanListHandler<>(Inventory.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Player> findAll() {
        String sql = "SELECT * FROM player";
        try {
            return qr.query(sql, new BeanListHandler<>(Player.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Player findById(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Player findByUid(String uid) {
        String sql = "SELECT * FROM player WHERE uid='" + uid + "'";
        try {
            return qr.query(sql, new BeanHandler<>(Player.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int insert(Player player) {
        String sql = "INSERT INTO player(uid,playerName,level,exp,maxHealth,attack,inventoryId) values(?,?,?,?,?,?,?)";
        try {
            return qr.update(sql, player.getUid(), player.getPlayerName(), player.getLevel(), player.getExp()
                    , player.getMaxHealth(), player.getAttack(), player.getInventoryId());
        }catch (SQLException e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int update(Player player) {
        String sql = "UPDATE player SET playerName=?,level=?,exp=?,maxHealth=?,attack=?,inventoryId=? WHERE uid=?";
        try {
            return qr.update(sql, player.getPlayerName(), player.getLevel(), player.getExp()
                    , player.getMaxHealth(), player.getAttack(), player.getInventoryId(),player.getUid());
        }catch (SQLException e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int delete(String uid) {
        String sql = "DELETE FROM player WHERE uid = ?";
        try {
            return qr.update(sql,uid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
