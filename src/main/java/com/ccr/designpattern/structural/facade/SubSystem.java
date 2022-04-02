package com.ccr.designpattern.structural.facade;

public class SubSystem {

    public void turnOnTV() {
        System.out.println("turnOnTV");
    }

    public void setCd(String cd) {
        System.out.println("setCd: " + cd);
    }

    public void startWatching() {
        System.out.println("startWatching");
    }

}
