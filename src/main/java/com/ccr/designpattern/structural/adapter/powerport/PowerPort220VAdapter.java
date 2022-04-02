package com.ccr.designpattern.structural.adapter.powerport;

/**
 * 适配 220V 电压 返回 110V
 */
public class PowerPort220VAdapter extends PowerPort220VImpl implements PowerPort110V {

    @Override
    public int output110VPower() {
        int output220 = super.output220VPower();
        int adapterResult = output220 / 2;
        System.out.printf("将输出电压%s，适配输出为%s \n", output220, adapterResult);
        return adapterResult;
    }
}
