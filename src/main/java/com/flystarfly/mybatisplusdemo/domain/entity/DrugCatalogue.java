package com.flystarfly.mybatisplusdemo.domain.entity;

import lombok.Data;

import java.util.Date;


/**
 * @author zhouzhiqing
 * @deacription 药品目录表实体类
 * @createTime 2019-11-18 17:48
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Data
public class DrugCatalogue {

    /*id*/
    private Integer id ;
    /*厂商名称*/
    private String factoryName ;
    /*成分规格 */
    private String ingredient ;
    /*商品名*/
    private String medName ;
    /*包装规格*/
    private String packingSpec ;
    /*价格*/
    private String price ;
    /* 备注*/
    private String remark ;
    /*创建时间*/
    private Date createTime ;
    /* 最后更新时间*/
    private Date updateTime ;

    /*网站ID*/
    private Integer webId;


}