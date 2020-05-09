package com.flystarfly.mybatisplusdemo.domain.entity;

import lombok.Data;

import java.util.Date;


/**
 * @author zhouzhiqing
 * @deacription 监控数据获取进度表实体类
 * @createTime 2019-12-02 15:30
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Data
public class ReptileLog {

    private Integer id ;
    /**
    总条数
    */
    private Integer allRows ;
    /**
    当前搜索目录ID
    */
    private Integer catalogueId ;
    /**
    搜索条件
    */
    private String searchName ;
    /**
    搜索网站名称
    */
    private String webName ;
    /**
    创建人
    */
    private String createBy ;
    /**
    当前条数
    */
    private Integer currentRows ;
    /**
    更新人
    */
    private String updateBy ;
    /**
    创建时间
    */
    private Date createTime ;
    /**
    监控数据获取结束开始时间
    */
    private Date endTime ;
    /**
    监控数据获取开始时间
    */
    private Date startTime ;
    /**
    最后更新时间
    */
    private Date updateTime ;

    public ReptileLog(Integer id, Integer currentRows, Date endTime, Integer allRows) {
        this.id = id;
        this.currentRows = currentRows;
        this.endTime = endTime;
        this.allRows = allRows;
    }

    public ReptileLog() {
    }
}
