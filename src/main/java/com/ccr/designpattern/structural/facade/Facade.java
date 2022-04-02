package com.ccr.designpattern.structural.facade;

public class Facade {
    SubSystem subSystem = new SubSystem();

    public void watchMovie() {
        subSystem.turnOnTV();
        subSystem.setCd("a movie");
        subSystem.startWatching();
    }
}
