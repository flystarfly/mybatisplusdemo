package com.flystarfly.mybatisplusdemo.domain.entity;


import lombok.Data;

import java.util.Date;

/**
 * @author zhouzhiqing
 * @deacription 爬虫数据扩展表实体类
 * @createTime 2019-11-18 18:05
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Data
public class ReptileDataExtra   {

    /*
    id
    */
    private Integer id ;
    /*
    数据表ID
    */
    private Integer dataId ;
    /*
    是否低价 0低价 1疑似低价 2正常价格
    */
    private Integer isLowed ;
    /*
    套餐-扩展地址URL
    */
    private String extraWebUrl ;
    /*
    套餐类型名称
    */
    private String packageTypeName ;
    /*
    套餐类型价格
    */
    private String packageTypePrice ;

    /* 优惠活动*/
    private String activitieContent;
    /*
    备注
    */
    private String remark ;
    /*
    创建时间
    */
    private Date createTime ;
    /*
    最后更新时间
    */
    private Date updateTime ;



}