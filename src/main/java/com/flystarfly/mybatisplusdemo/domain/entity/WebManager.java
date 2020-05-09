package com.flystarfly.mybatisplusdemo.domain.entity;

import lombok.Data;
import java.util.Date;

/**
 * @author zhouzhiqing
 * @deacription 平台管理表实体类
 * @createTime 2019-11-18 17:15
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Data
public class WebManager   {

    /*
    id
    */
    private Integer id ;
    /*
    登录账号
    */
    private String loginAccount ;
    /*
    密码
    */
    private String password ;
    /*
    备注
    */
    private String remark ;
    /*
    网上名称
    */
    private String siteName ;
    /*
    地址
    */
    private String webUrl ;
    /*
    创建时间
    */
    private Date createTime ;
    /*
    最后更新时间
    */
    private Date updateTime ;

}