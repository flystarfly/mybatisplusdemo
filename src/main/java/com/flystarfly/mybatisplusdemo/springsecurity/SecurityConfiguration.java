package com.flystarfly.mybatisplusdemo.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author zhouzhiqing
 * @deacription TODO
 * @createTime 2020/5/6 10:02 上午
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


        @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }



    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        /** SPRING5.0+以上要带加密方式，返回的时候也要带加密，否则为匿名用户*/
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());//passwoldEncoder是对密码的加密处理，如果user中密码没有加密，则可以不加此方法。注意加密请使用security自带的加密方式。
    }

    /**
    * 功能描述: 此处设置了两个角色：admin,employee;admin可以访问"/decision/**",
    * "/govern/**","/employee/*","/admin/**"，* employee可以访问："/decision/**",
    * "/govern/**","/employee/*"；从配置上看admin权限大于employee。
    * @param: [http]
    * @return: void
    * @author: zhouzhiqing
    * @createtime: 2020/5/6 10:03 上午
    */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()//禁用了 csrf 功能
                ///login loginOut 不限定
                .authorizeRequests()
                // 设置静态的资源允许所有访问
                .antMatchers("/static/**").permitAll()
                .antMatchers("/login").permitAll()
                .anyRequest().access("@rbacService.hasPermission(request, authentication)")
                .and().formLogin().loginPage("/login")
                .and().logout().logoutUrl("/loginOut").logoutSuccessUrl("/login").permitAll();
         //开启httpbasic验
//                .antMatchers("/decision/**","/govern/**","/employee/*").hasAnyRole("EMPLOYEE","ADMIN")//对decision和govern 下的接口 需要 USER 或者 ADMIN 权限
//                .antMatchers("/employee/login").permitAll()///employee/login 不限定
//                .antMatchers("/admin/**").hasRole("ADMIN")//对admin下的接口 需要ADMIN权限
//                .antMatchers("/oauth/**").permitAll()//不拦截 oauth 开放的资源
//                .anyRequest().permitAll()//其他没有限定的请求，允许访问
    }

}