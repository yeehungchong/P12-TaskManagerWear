package com.yeehungchong.p13_taskmanagerwear;

import java.io.Serializable;

public class Tasks implements Serializable {

    private int id;
    private String name;
    private String desc;

    public Tasks(int id, String name, String desc){
        this.id = id;
        this.desc = desc;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId(){
        return id;
    }

    public String getDesc(){
        return desc;
    }

    public  void setId(int id){
        this.id = id;
    }

    public void  setDesc(String desc){
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + "\n" + desc + "\n" + name;
    }
}
