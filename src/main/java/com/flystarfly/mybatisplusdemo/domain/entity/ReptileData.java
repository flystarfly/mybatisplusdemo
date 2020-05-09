package com.flystarfly.mybatisplusdemo.domain.entity;

import lombok.Data;

import java.util.Date;


/**
 * @author zhouzhiqing
 * @deacription 爬虫数据表实体类
 * @createTime 2019-11-18 18:02
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Data
public class ReptileData   {


    /*
     id
     */
    private Integer id ;
    /*
    目录ID
    */
    private Integer catalogueId ;
    /*
    是否低价 0低价 1疑似低价 2正常价格
    */
    private Integer isLowed ;
    /*
    店铺ID
    */
    private Integer storeId ;
    /*
    平台ID
    */
    private Integer webId ;
    /*
    发货地
    */
    private String address ;
    /*
    截图存放路径
    */
    private String picStoragePath ;
    /*
    价格
    */
    private String price ;
    /*
    备注
    */
    private String remark ;
    /*
    店铺名称
    */
    private String storeName ;
    /*
    旺旺名
    */
    private String wangName ;
    /*
    平台名称
    */
    private String webName ;
    /*
    网站URL
    */
    private String webUrl ;

    /*
   药品地址
   */
    private String drugPath;

    /* 商品名称 */
    private String medName;

    /* 包装规格*/
    private String packingSpec;

    /* 店铺地址*/
    private String storePath;
    /*
    创建时间
    */
    private Date createTime ;
    /*
    最后更新时间
    */
    private Date updateTime ;

}