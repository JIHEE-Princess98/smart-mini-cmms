package com.smartfactory.cmms.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.smartfactory.cmms.**.mapper")
public class MybatisConfig {
}