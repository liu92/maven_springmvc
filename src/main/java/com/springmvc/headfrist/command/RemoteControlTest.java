package com.springmvc.headfrist.command;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remot= new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remot.setCommond(lightOn);
        remot.buttonWasPressed();
    }
}
