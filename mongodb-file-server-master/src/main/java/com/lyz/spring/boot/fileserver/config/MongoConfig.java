package com.lyz.spring.boot.fileserver.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @Author: liuyuze
 * @Date: 2019.11.5 10:23
 */
@Configuration
@ConfigurationProperties(prefix = "spring.data.mongodb")
public class MongoConfig extends AbstractMongoConfig{

    public static final String MONGO_TEMPLATE = "mongoTemplate";

    @Override
    @Bean(name = MONGO_TEMPLATE)
    public MongoTemplate getMongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }
}
