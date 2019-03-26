/*
 * Copyright 2018 jianzh5. All rights reserved.
 */

package com.github.jianzh5.command;

/**
 * <p>
 * <code>Tv</code>
 * </p>
 * Description:
 * 具体执行者
 * @author jianzh5
 * @date 2019/3/26 12:06
 */
public class Tv {
    public int currentChannel = 0;
    public void turnOn(){
        System.out.println("打开电视");
    }

    public void turnOff(){
        System.out.println("关闭电视");
    }

    public void changeChannel(int channel){
        this.currentChannel = channel;
        System.out.println("换台："+channel);
    }
}
