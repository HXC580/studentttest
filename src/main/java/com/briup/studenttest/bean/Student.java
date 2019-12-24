package com.briup.studenttest.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel
public class Student implements Serializable {
    @ApiModelProperty(value = "学号",required = true)
    private int id;
    private String name;
    private double sore;

    public double getSore() {
        return sore;
    }

    public void setSore(double sore) {
        this.sore = sore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
