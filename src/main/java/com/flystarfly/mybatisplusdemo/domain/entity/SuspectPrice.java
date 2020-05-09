package com.flystarfly.mybatisplusdemo.domain.entity;

import lombok.Data;
import java.util.Date;

/**
 * @author zhouzhiqing
 * @deacription 疑似价格字符管理表实体类
 * @createTime 2019-11-18 18:15
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Data
public class SuspectPrice   {

    /*
    id
    */
    private Integer id ;
    /*
    0 禁用 1启用
    */
    private Integer isEnabled ;
    /*
    备注
    */
    private String remark ;
    /*
    特殊字符
    */
    private String specialChar ;
    /*
    创建时间
    */
    private Date createTime ;
    /*
    最后更新时间
    */
    private Date updateTime ;


}
