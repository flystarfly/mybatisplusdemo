package com.flystarfly.mybatisplusdemo.domain.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author zhouzhiqing
 * @deacription 存量店铺管理表实体类
 * @createTime 2019-11-18 18:08
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Data
public class StockStoreManager implements Serializable {

    /*
       id
       */
    private Integer id ;
    /*
    省区
    */
    private String area ;
    /*
    部门名称
    */
    private String department ;
    /*
    备注
    */
    private String remark ;
    /*
    存量店铺名（客户名称）
    */
    private String stockStoreName ;
    /*
    上级主管名称
    */
    private String topManageName ;
    /*
    创建时间
    */
    private Date createTime ;
    /*
    最后更新时间
    */
    private Date updateTime ;




}
