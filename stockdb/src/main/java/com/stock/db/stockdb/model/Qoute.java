package com.stock.db.stockdb.model;

import javax.persistence.*;

@Entity
@Table(name = "qoute", catalog = "node")
public class Qoute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long id;

    @Column(name = "user_name")
    public String userName;

    public Qoute() {
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQoute() {
        return qoute;
    }

    public void setQoute(String qoute) {
        this.qoute = qoute;
    }

    @Column(name = "qoute")
    public String qoute;

}
