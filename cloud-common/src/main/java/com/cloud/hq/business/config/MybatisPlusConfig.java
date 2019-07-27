package com.cloud.hq.business.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author huangqi
 * @Package com.cloud.hq.bussniess.config
 * @Description: mybatis-plus
 * @date 2019-07-27 16:37
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.cloud.hq.business.dao")
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
