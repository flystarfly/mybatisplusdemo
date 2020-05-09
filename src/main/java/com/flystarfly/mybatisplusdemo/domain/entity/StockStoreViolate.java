package com.flystarfly.mybatisplusdemo.domain.entity;

import java.util.Date;

/**
 * @author zhouzhiqing
 * @deacription 店铺违规记录表实体类
 * @createTime 2019-11-18 18:12
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
public class  StockStoreViolate   {

    /*
	id
	*/
    private Integer id ;
    /*
    低价次数
    */
    private Integer lowedPriceNums ;
    /*
    存量店铺ID
    */
    private Integer stockStoreId ;
    /*
    店铺ID
    */
    private Integer storeId ;
    /*
    疑似低价次数
    */
    private Integer suspectedLowedPriceNums ;
    /*
    违规次数
    */
    private Integer violateNums ;
    /*
    备注
    */
    private String remark ;
    /*
    违规店铺名称
    */
    private String storeName ;
    /*
    平台名称
    */
    private String webName ;
    /*
    创建时间
    */
    private Date createTime ;
    /*
    最后更新时间
    */
     private Date updateTime ;
    /*
    违规时间
    */
    private Date violateDate ;



}
