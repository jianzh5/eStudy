/*
 * Copyright 2018 jianzh5. All rights reserved.
 */

package com.github.jianzh5.pool;

/**
 * <p>
 * <code>TrheadTest</code>
 * </p>
 * Description:
 *
 * @author jianzh5
 * @date 2019/3/25 17:42
 */
public class ThreadTest {
    public static void main(String[] args) {
        ThreadPoolManager threadPoolManager = ThreadPoolManager.getInstance();
        for (int i = 0; i < 100; i++) {
            threadPoolManager.addExecuteTask(new MyTask());
            System.out.println("线程池中线程数目：" + threadPoolManager.getPoolSize() + "，队列中等待执行的任务数目："
                    + threadPoolManager.getQueue() + "，已执行完的任务数目：" + threadPoolManager.getCompletedTaskCount());
        }
//        threadPoolManager.shutdown();
    }


     static class MyTask implements Runnable{
        @Override
        public void run() {
            System.out.println("正在执行task " + Thread.currentThread().getName());
        }
    }

}
