package com.github.jianzh5.command;

/**
 * 开发主管，具体调用者
 * @author jam
 * @date 2019/4/3下午11:11
 */
public class DeveloperLeader {
    Task task;
    public void setTask(Task task){
        this.task = task;
    }

    //实现需求任务
    public void handlerTask(){
        task.execute();
    }

    public void cacelTask(){
        task.undo();
    }
}
