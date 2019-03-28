package com.github.jianzh5.pool;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>
 * <code>CustomThreadFactory</code>
 * </p>
 * Description:
 * 自定义线程池构建工厂，给线程赋予自定义名称
 * @author jianzh5
 * @date 2019/3/25 17:35
 */
public class CustomThreadFactory implements ThreadFactory {
    private static final AtomicInteger poolNumber = new AtomicInteger(1);
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String namePrefix;


    public CustomThreadFactory(String name){
        namePrefix = name +"-"+  poolNumber.getAndIncrement() ;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setName(namePrefix +"-"+ threadNumber.getAndIncrement());
        return t;
    }
}
