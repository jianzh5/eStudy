package com.github.jianzh5.command;

/**
 * 客户端，用于模拟项目经理
 * @author jam
 * @date 2019/4/3下午11:14
 */
public class Test {
    public static void main(String[] args) {
        //此处开发主管就是调用者，会传入一个命令对象，可以用来发出请求
        DeveloperLeader developerLeader = new DeveloperLeader();
        Developer developer = new Developer("阿黄");
        //提了一个oa相关任务
        Task oaTask = new OATask(developer);
        //命令传给调用者
        developerLeader.setTask(oaTask);
        developerLeader.handlerTask();
        developerLeader.cacelTask();

        System.out.println("--------");

        Developer developer1 = new Developer("棒棒王");
        //提了一个ps相关任务
        Task psTask = new PSTask(developer1);
        developerLeader.setTask(psTask);
        developerLeader.handlerTask();
        developerLeader.cacelTask();
    }
}
