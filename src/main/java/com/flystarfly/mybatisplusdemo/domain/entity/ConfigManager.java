package com.flystarfly.mybatisplusdemo.domain.entity;

import lombok.Data;
import java.util.Date;

/**
 * @Deacription 配置表
 * @Author zwt
 * @CreateTime 2019/11/22 11:12
 * @Company 杭州泽达鑫药盟技术有限公司
 * @Department 医疗组
 * @Version 1.0
 **/
@Data
public class ConfigManager {
    private Integer id ;
    /**
    配置类型 1 ： 本地磁盘配置
    */
    private Integer configType ;
    /**
    名字
    */
    private String name ;
    /**
     值
     */
    private String value ;
    /**
    创建时间
    */
    private Date createTime ;
    /**
    修改时间
    */
    private Date updateTime ;

    public ConfigManager() {
    }

    public Integer getId(){
        return  id;
    }
    public void setId(Integer id ){
        this.id = id;
    }

    /**
     * 配置类型 1 ： 本地磁盘配置
     *@return
     */
    public Integer getConfigType(){
        return  configType;
    }
    /**
     * 配置类型 1 ： 本地磁盘配置
     *@param  configType
     */
    public void setConfigType(Integer configType ){
        this.configType = configType;
    }

    /**
     * 名字
     *@return
     */
    public String getName(){
        return  name;
    }
    /**
     * 名字
     *@param  name
     */
    public void setName(String name ){
        this.name = name;
    }

    /**
     * 值
     *@return
     */
    public String getValue() {
        return value;
    }

    /**
     * 值
     *@param  value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 创建时间
     *@return
     */
    public Date getCreateTime(){
        return  createTime;
    }
    /**
     * 创建时间
     *@param  createTime
     */
    public void setCreateTime(Date createTime ){
        this.createTime = createTime;
    }

    /**
     * 修改时间
     *@return
     */
    public Date getUpdateTime(){
        return  updateTime;
    }
    /**
     * 修改时间
     *@param  updateTime
     */
    public void setUpdateTime(Date updateTime ){
        this.updateTime = updateTime;
    }
}
