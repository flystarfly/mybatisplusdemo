package com.flystarfly.mybatisplusdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouzhiqing
 * @deacription TODO
 * @createTime 2020/5/9 9:43 上午
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@RestController
public class SysUseController {

    @GetMapping("/login")
    public String login() {
        return "login sucess";
    }

    @GetMapping("/loginOut")
    public String loginOut() {
        return "loginOut sucess";
    }

    @GetMapping("/loginFail")
    public String loginFail() {
        return "loginOut fail";
    }

}
