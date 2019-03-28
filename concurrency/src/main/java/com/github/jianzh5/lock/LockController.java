package com.github.jianzh5.lock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.redis.util.RedisLockRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * <p>
 * <code>LockController</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/28下午11:22
 */
@RestController
public class LockController {
    @Autowired
    private RedisLockRegistry lockRegistry;
    @GetMapping("test")
    public void test() throws InterruptedException {
        Lock lock = lockRegistry.obtain("lock");
        boolean b1 = lock.tryLock(3, TimeUnit.SECONDS);
        System.out.println("b1 is:"+b1);
        TimeUnit.SECONDS.sleep(5);

        boolean b2 = lock.tryLock(3,TimeUnit.SECONDS);
        System.out.println("b1 is:"+b1);
        System.out.println("b2 is:"+b2);

        lock.unlock();
        lock.unlock();
        System.out.println("test");
    }
}
