package com.ilovementmei.ccstraining2020.dao;

import com.ilovementmei.ccstraining2020.domain.Player;
import com.ilovementmei.ccstraining2020.domain.vo.Inventory;
import java.util.List;

public interface PlayerDao extends BaseDao<Player> {

    List<Inventory> findAllInventory();

    Player findByUid(String uid);

    int delete(String uid);
}
