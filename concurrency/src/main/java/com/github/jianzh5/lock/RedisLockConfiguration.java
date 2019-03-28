package com.github.jianzh5.lock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.integration.redis.util.RedisLockRegistry;

/**
 * <p>
 * <code>RedisLockConfiguration</code>
 * </p>
 * Description:
 * 分布式锁
 * @author jam
 * @date 2019/3/28下午11:19
 */
@Configuration
public class RedisLockConfiguration {

    @Bean
    public RedisLockRegistry redisLockRegistry(RedisConnectionFactory redisConnectionFactory){
        return new RedisLockRegistry(redisConnectionFactory,"spring-cloud");
    }
}
