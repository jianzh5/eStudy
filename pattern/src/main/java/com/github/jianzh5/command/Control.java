package com.github.jianzh5.command;

/**
 * <p>
 * <code>Control</code>
 * </p>
 * Description:
 * 发布命令者
 * @author jianzh5
 * @date 2019/3/26 12:11
 */
public class Control {
    private Command onCommand, offCommand,changeCommand;

    public Control(Command onCommand, Command offCommand, Command changeCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.changeCommand = changeCommand;
    }

    public void turnOn(){
        this.onCommand.execute();
    }


    public void turnOff(){
        this.offCommand.execute();
    }

    public void changeChannel(){
        this.changeCommand.execute();
    }
}
