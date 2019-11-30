package com.team.bromall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 *
 * @author team
 * @version v1.0
 * @date 2019/11/30 01:23
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.team.bromall.mapper","com.team.bromall.dao"})
public class MyBatisConfig {
}
