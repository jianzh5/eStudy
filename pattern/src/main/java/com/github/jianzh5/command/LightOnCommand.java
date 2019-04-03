package com.github.jianzh5.command;

/**
 * <p>
 * <code>LightOnCommand</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/2下午7:23
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
