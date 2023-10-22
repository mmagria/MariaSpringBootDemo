//package com.maria.demo.config;
//
//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.data.redis.connection.RedisServer;
//
//@TestConfiguration
//public class TestRedisConfiguration {
//    private RedisServer redisServer;
//
//    public TestRedisConfiguration(RedisProperties redisProperties) {
//        this.redisServer = new RedisServer(redisProperties.getRedisHost(),
//                redisProperties.getRedisPort());
//    }
//
//    @PostConstruct
//    public void postConstruct() {
//        redisServer.start();
//    }
//
//    @PreDestroy
//    public void preDestroy() {
//        redisServer.stop();
//    }
//}
