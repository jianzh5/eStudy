/*
 * Copyright 2018 IFlyTek. All rights reserved.
 */

package com.github.jianzh5.redis;

import org.redisson.api.*;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * <p>
 * <code>RedissonService</code>
 * </p>
 * Description:
 *
 * @author jianzhang11
 * @date 2019/3/25 14:00
 */
@Service("redissonService")
public class RedissonService {
    @Autowired
    private RedissonClient redissonClient;
    
    
    public void getRedissonClient() throws IOException {
        Config config = redissonClient.getConfig();
        System.out.println(config.toJSON().toString());
    }

    /**
     *   RBucket 映射为 redis server 的 string 类型,只能存放最后存储的一个字符串
     *   redis server 命令:
     *      查看所有键---->keys *
     *      查看key的类型--->type key
     *      查看key的值 ---->get key
     * @author jianzhang11
     * @date 2019/3/25 14:03
     * @param key  key
     * @return RBucket
     */
    public <T>RBucket<T> getRBucket(String key){
        RBucket<T> bucket = redissonClient.getBucket(key);
        return bucket;
    }

    /**
     * RMap  映射为  redis server 的 hash 类型
     * @author jianzhang11
     * @date 2019/3/25 14:15
     * @param key key
     * @return RMap
     */
    public <K,V>RMap<K,V> getRMap(String key){
        RMap<K,V> map = redissonClient.getMap(key);
        return map;
    }

    /**
     * RSortedSet 映射为 redis server 的 list 类型
     * @author jianzhang11
     * @date 2019/3/25 14:17
     * @param key key
     * @return
     */
    public <V>RSortedSet<V> getRSortedSet(String key){
        RSortedSet<V> sortedSet = redissonClient.getSortedSet(key);
        return sortedSet;
    }


    /**
     * RSet 映射为 redis server 的set 类型
     * @author jianzhang11
     * @date 2019/3/25 14:45
     * @param key
     * @param <V>
     * @return
     */
    public <V> RSet<V> getRSet(String key){
        RSet<V> rSet = redissonClient.getSet(key);
        return rSet;
    }


    /**
     *  RList 映射为 redis server的list类型
     * @author jianzhang11
     * @date 2019/3/25 14:47
     * @param key
     * @param <V>
     * @return
     */
    public <V> RList<V> getRList(String key) {
        RList<V> rList = redissonClient.getList(key);
        return rList;
    }


    /**
     * RQueue 映射为 redis server的list类型  队列--先入先出
     * @author jianzhang11
     * @date 2019/3/25 14:50
     * @param key
     * @param <V>
     * @return
     */
    public <V> RQueue<V> getRQueue(String key) {
        RQueue<V> rQueue = redissonClient.getQueue(key);
        return rQueue;
    }

    /**
     * RDeque 映射为 redis server 的 list类型
     *  双端队列--对头和队尾都可添加或者移除，也遵循队列的先入先出
     * @author jianzhang11
     * @date 2019/3/25 14:52
     * @param key
     * @return
     */
    public <V> RDeque<V> getRDeque(String key) {
        RDeque<V> rDeque = redissonClient.getDeque(key);
        return rDeque;
    }

    /**
     * RLock 映射为redis server的string 类型
     * @author jianzhang11
     * @date 2019/3/25 14:54
     * @param key
     * @return
     */
    public RLock getRLock(String key) {
        RLock rLock = redissonClient.getLock(key);
        return rLock;
    }


    public RReadWriteLock getRWLock(String objectName) {
        RReadWriteLock rwlock = redissonClient.getReadWriteLock(objectName);
        return rwlock;
    }


    /**
     * RAtomicLong 映射为redis server的string 类型
     * @author jianzhang11
     * @date 2019/3/25 15:00
     * @param key
     * @return
     */
    public RAtomicLong getRAtomicLong(String key) {
        RAtomicLong rAtomicLong = redissonClient.getAtomicLong(key);
        return rAtomicLong;
    }


    public RCountDownLatch getRCountDownLatch(String key) {
        RCountDownLatch rCountDownLatch = redissonClient.getCountDownLatch(key);
        return rCountDownLatch;
    }

    /**
     * 消息订阅发布
     * @author jianzhang11
     * @date 2019/3/25 15:04
     * @param key
     * @return
     */
    public <M> RTopic<M> getRTopic(String key) {
        RTopic<M> rTopic = redissonClient.getTopic(key);
        return rTopic;
    }
}
