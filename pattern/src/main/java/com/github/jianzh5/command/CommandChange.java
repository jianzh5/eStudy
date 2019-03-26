/*
 * Copyright 2018 jianzh5. All rights reserved.
 */

package com.github.jianzh5.command;

/**
 * <p>
 * <code>CommandOn</code>
 * </p>
 * Description:
 * 具体命令
 * @author jianzh5
 * @date 2019/3/26 12:08
 */
public class CommandChange implements Command {
    private Tv tv;
    private int channel;

    public CommandChange(Tv tv,int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.changeChannel(channel);
    }
}
