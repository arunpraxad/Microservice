package com.stock.dbservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Qoute {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    public Qoute() {
    }

    @Column(name = "qoutename")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
