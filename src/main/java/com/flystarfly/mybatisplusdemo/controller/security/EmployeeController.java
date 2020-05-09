package com.flystarfly.mybatisplusdemo.controller.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouzhiqing
 * @deacription TODO
 * @createTime 2020/5/6 10:13 上午
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @GetMapping("/greeting")
    public String greeting() {
        return "Hello,World!";
    }

    @GetMapping("/login")
    public String login() {

        return "login sucess";
    }
}
