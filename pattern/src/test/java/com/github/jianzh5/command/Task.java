package com.github.jianzh5.command;

/**
 * 抽象命令接口
 * @author jam
 * @date 2019/4/3下午11:03
 */
public interface Task {
    //执行命令
    void execute();

    //撤销命令
    void undo();
}
