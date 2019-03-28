package com.github.jianzh5.command;

/**
 * <p>
 * <code>Client</code>
 * </p>
 * Description:
 *
 * @author jianzh5
 * @date 2019/3/26 12:13
 */
public class Client {
    public static void main(String[] args) {
        Tv myTv = new Tv();
        CommandOn on = new CommandOn(myTv);
        CommandOff off = new CommandOff(myTv);
        CommandChange change = new CommandChange(myTv,2);

        Control control = new Control(on,off,change);

        control.turnOn();
        control.changeChannel();
        control.turnOff();

    }
}
