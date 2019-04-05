package com.github.jianzh5.command;

/**
 * 具体命令角色，需要绑定与执行者之间的关系并调用执行者的具体方法
 * @author jam
 * @date 2019/4/3下午11:04
 */
public class PSTask implements Task {

    Developer developer;

    public PSTask(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void execute() {
        developer.handleTask();
    }


    @Override
    public void undo() {
        developer.cancelTask();
    }
}
