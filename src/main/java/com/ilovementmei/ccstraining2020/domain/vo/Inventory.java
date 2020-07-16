package com.ilovementmei.ccstraining2020.domain.vo;

public class Inventory {

    String playerName;
    int inventoryId;
    int size;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "playerName='" + playerName + '\'' +
                ", inventoryId=" + inventoryId +
                ", size=" + size +
                '}';
    }
}
