package com.ccr.designpattern.creational.prototype;


public class Detail implements Cloneable {

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Detail{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
