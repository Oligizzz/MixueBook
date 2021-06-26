package com.oligizzz.mixueadmin.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @Author: GNMD
 * @Description: Druid配置
 * @Date: 2021/6/26
 * @Modify By:
 */
public class DruidConfiguration {

    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource getDataSource(){
        return new DruidDataSource();
    }
}
