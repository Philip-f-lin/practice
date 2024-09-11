package com.example.redisdemo;

import com.example.redis.pojo.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisDemoApplicationTests {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    void contextLoads() {
        // 寫入一條 string 數據
        redisTemplate.opsForValue().set("name", "阿貓");
        // 獲取 string 數據
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("name = " + name);

    }

    @Test
    void testSaveUser() {
        redisTemplate.opsForValue().set("user:100", new User("阿虎", 21));
        User o = (User)redisTemplate.opsForValue().get("user:100");
        System.out.println("o = " + o);
    }
}
