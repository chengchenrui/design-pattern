package com.ccr.designpattern.structural.adapter.powerport;

public class PowerPort220VImpl implements PowerPort220V {

    @Override
    public int output220VPower() {
        int output = 220;
        System.out.println("输出电压：" + output);
        return output;
    }
}
