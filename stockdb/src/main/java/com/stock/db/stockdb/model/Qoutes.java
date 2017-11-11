package com.stock.db.stockdb.model;

import java.util.List;

public class Qoutes {

    public String username;
    public List<Qoute> qoutes;

    public Qoutes() {
    }

    public Qoutes(String username, List<Qoute> qoutes) {
        this.username = username;
        this.qoutes = qoutes;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public List<Qoute> getQoutes() {
        return qoutes;
    }

    public void setQoutes(List<Qoute> qoutes) {
        this.qoutes = qoutes;
    }
}
