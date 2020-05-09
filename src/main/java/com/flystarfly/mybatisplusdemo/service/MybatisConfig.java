package com.flystarfly.mybatisplusdemo.service;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zhouzhiqing
 * @deacription mybatis-plus配置类
 * @createTime 2020/4/24 2:26 下午
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@EnableTransactionManagement
@Configuration
@MapperScan("com.flystarfly.mybatisplusdemo.mapper")
public class MybatisConfig {


    /**
    * 功能描述: 分页插件
    * @param: []
    * @return: com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
    * @author: zhouzhiqing
    * @createtime: 2020/4/24 4:05 下午
    */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
        // paginationInterceptor.setOverflow(false);
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
        // paginationInterceptor.setLimit(500);
        // 开启 count 的 join 优化,只针对部分 left join
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
        return paginationInterceptor;
    }
}