package com.example.devicemanagement.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Test  extends  BaseDO{
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
