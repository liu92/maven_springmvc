package com.springmvc.headfrist.command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    public void setCommond(Command commond){
        slot = commond;
    }

    public void  buttonWasPressed(){
        slot.execute();
    }
}
