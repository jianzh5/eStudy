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
public class CommandOff implements Command {
    private Tv tv;

    public CommandOff(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
