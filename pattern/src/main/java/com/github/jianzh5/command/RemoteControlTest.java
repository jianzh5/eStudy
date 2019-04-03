package com.github.jianzh5.command;

/**
 * <p>
 * <code>RemoteControlTest</code>
 * </p>
 * Description:
 * 命令模式的客户
 * @author jam
 * @date 2019/4/2下午7:27
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //此处遥控器就是调用者，会传入一个命令对象，可以用来发出请求
        SimpleRemoteCotrol remoteCotrol = new SimpleRemoteCotrol();
        //Light对象是请求的接收者
        Light light = new Light();
        Door door = new Door();
        //创建具体命令，命令中需要具体的执行者作为参数
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
        //命令传给调用者
        remoteCotrol.setCommand(lightOnCommand);
        remoteCotrol.buttonWasPressed();

        remoteCotrol.setCommand(doorOpenCommand);
        remoteCotrol.buttonWasPressed();
    }
}
