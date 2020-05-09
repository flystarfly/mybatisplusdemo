package com.flystarfly.mybatisplusdemo.domain.entity;


import lombok.Data;
import java.util.Date;

/**
 * @author zhouzhiqing
 * @deacription 存量店铺和爬虫店铺关联表实体类
 * @createTime 2019-11-18 18:10
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Data
public class StockStoreRelation {


    private Integer id;
    /*
    存量店铺ID
    */
    private Integer stockStoreId;
    /*
    店铺ID
    */
    private Integer storeId;
    /*
    备注
    */
    private String remark;
    /*
    创建时间
    */
    private Date createTime;
    /*
    最后更新时间
    */
    private Date updateTime;

    private Boolean hasRelation;

    public StockStoreRelation() {
    }

}