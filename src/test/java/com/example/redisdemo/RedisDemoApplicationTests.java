package com.example.redisdemo;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class RedisDemoApplicationTests {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        // 寫入一條 string 數據
        redisTemplate.opsForValue().set("name", "阿白");
        // 獲取 string 數據
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("name = " + name);

    }

}
