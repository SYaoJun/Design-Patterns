package com.bytedance.javabasic.dao.entity;

public class Department {
    private Integer id;

    private String name;

    private Integer phone;

    public Department(Integer id, String name, Integer phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public Department() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}