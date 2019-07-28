package com.cloud.hq.business.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

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

    @Bean
    public MybatisSqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws IOException {
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setGlobalConfig(globalConfig());
        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
        //设置mapper资源路径
        sqlSessionFactoryBean.setMapperLocations(resourceResolver.getResources("classpath*:/mapper/**/*.xml"));
        //设置别名
        sqlSessionFactoryBean.setTypeAliasesPackage("com.cloud.hq.business.model");
        return sqlSessionFactoryBean;
    }

    public GlobalConfig globalConfig() {
        GlobalConfig globalConfig = new GlobalConfig();
        GlobalConfig.DbConfig dbConfig = new GlobalConfig.DbConfig();
        //主键类型
        dbConfig.setIdType(IdType.AUTO);
        //驼峰下划线转换
        dbConfig.setTableUnderline(true);
        globalConfig.setDbConfig(dbConfig);
        return globalConfig;
    }

}
