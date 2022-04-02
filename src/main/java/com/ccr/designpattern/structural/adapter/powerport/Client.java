package com.ccr.designpattern.structural.adapter.powerport;

public class Client {

    public static void main(String[] args) {
        PowerPort110V powerPort110V = new PowerPort220VAdapter();
        int output = powerPort110V.output110VPower();
        System.out.println("输出电压：" + output);
    }
}
