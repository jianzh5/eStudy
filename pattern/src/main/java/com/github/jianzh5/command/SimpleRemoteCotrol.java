package com.github.jianzh5.command;

/**
 * <p>
 * <code>SimpleRemoteCotrol</code>
 * </p>
 * Description:
 * 具体调用者
 * @author jam
 * @date 2019/4/2下午7:25
 */
public class SimpleRemoteCotrol {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
