/*
 * Copyright 2018 jianzh5. All rights reserved.
 */

package com.github.jianzh5.pool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * <code>ThreadPoolManager</code>
 * </p>
 * Description:
 * 全局单例线程池管理类
 * @author jianzh5
 * @date 2019/3/25 16:23
 */
public class ThreadPoolManager {

    private static class ThreadPoolManagerHolder{
        private static ThreadPoolManager instance = new ThreadPoolManager();
    }

    private ThreadPoolManager(){}

    public static ThreadPoolManager getInstance(){
        return ThreadPoolManagerHolder.instance;
    }


    /**
     * 线程池维护线程的最少数量
     */
    private static final int SIZE_CORE_POOL = 4;
    /**
     * 线程池维护线程的最大数量
     */
    private static final int SIZE_MAX_POOL = 10;



    private final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(SIZE_CORE_POOL, SIZE_MAX_POOL, 0L,
            TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(),new CustomThreadFactory("OACustomFactory"));

    /**
     * 初始化线程池
     */
    public void perpare() {
        if (threadPoolExecutor.isShutdown() && !threadPoolExecutor.prestartCoreThread()) {
            @SuppressWarnings("unused")
            int startThread = threadPoolExecutor.prestartAllCoreThreads();
        }
    }

    /**
     * 向线程池中添加任务方法
     */
    public void addExecuteTask(Runnable task) {
        if (task != null) {
            threadPoolExecutor.execute(task);
        }
    }

    /**
     * 判断是否是最后一个任务
     */
    protected boolean isTaskEnd() {
        if (threadPoolExecutor.getActiveCount() == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取缓存大小
     */
    public int getQueue(){
        return threadPoolExecutor.getQueue().size();
    }

    /**
     * 获取线程池中的线程数目
     */
    public int getPoolSize(){
        return threadPoolExecutor.getPoolSize();
    }

    /**
     * 获取已完成的任务数
     */
    public long getCompletedTaskCount(){
        return threadPoolExecutor.getCompletedTaskCount();
    }

    /**
     * 关闭线程池，不在接受新的任务，会把已接受的任务执行玩
     */
    public void shutdown() {
        threadPoolExecutor.shutdown();
    }


}
