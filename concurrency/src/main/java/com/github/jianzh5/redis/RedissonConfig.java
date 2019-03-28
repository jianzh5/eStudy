package com.github.jianzh5.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * <code>RedissonConfig</code>
 * </p>
 * Description:
 *
 * @author jianzh5
 * @date 2019/3/25 12:17
 */
@Configuration
public class RedissonConfig {

    @Value("${spring.redis.host}")
  private String host;

   @Value("${spring.redis.port}")
  private String port;

  @Value("${spring.redis.password}")
  private String password;


    @Bean
    public RedissonClient getRedisson(){
        Config config = new Config();
        config.useSingleServer().setAddress("redis://" + host + ":" + port);
        return Redisson.create(config);
    }




}
