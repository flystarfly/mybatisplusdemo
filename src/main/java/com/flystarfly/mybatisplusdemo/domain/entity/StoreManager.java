package com.flystarfly.mybatisplusdemo.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zhouzhiqing
 * @deacription 店铺管理实体类
 * @createTime 2019-11-18 17:44
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Data
public class StoreManager   {

    /*id*/
    private Integer id ;
    /*备注*/
    private String remark ;
    /*店铺名*/
    private String storeName ;
    /*网站URL*/
    private String webUrl ;
    /*网站名称*/
    private String webName;
    /*网站ID*/
    private Integer webId;
    /*创建时间 */
    private Date createTime ;
    /*最后更新时间*/
    private Date updateTime ;
    /*店铺地址*/
    private String storePath;



}
