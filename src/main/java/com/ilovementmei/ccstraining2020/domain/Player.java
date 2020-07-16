package com.ilovementmei.ccstraining2020.domain;

public class Player {

    private String uid;
    private String playerName;
    private int level;
    private int exp;
    private int maxHealth;
    private int attack;
    private int inventoryId;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }


    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Override
    public String toString() {
        return "Player{" +
                "uid='" + uid + '\'' +
                ", playerName='" + playerName + '\'' +
                ", level=" + level +
                ", exp=" + exp +
                ", maxHealth=" + maxHealth +
                ", attack=" + attack +
                ", inventoryId=" + inventoryId +
                '}';
    }
}
