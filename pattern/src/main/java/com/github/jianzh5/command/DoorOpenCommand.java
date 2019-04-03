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
public class DoorOpenCommand implements Command {
    Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.on();
    }
}
