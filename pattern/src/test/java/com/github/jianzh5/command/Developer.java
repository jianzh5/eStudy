package com.github.jianzh5.command;

/**
 * 任务执行者
 * @author jam
 * @date 2019/4/3下午11:05
 */
public class Developer {
    private String name;
    public Developer(String name){
        this.name = name;
    }

    public void handleTask(){
        System.out.println(name + "埋头撸代码");
    }

    public void cancelTask(){
        System.out.println(name + "删除代码逻辑");
    }
}
