package com.flystarfly.mybatisplusdemo.service;

import com.flystarfly.mybatisplusdemo.domain.entity.ConfigManager;

import java.util.List;

/**
 * @author zhouzhiqing
 * @deacription 配置表Service接口类
 * @createTime 2020/4/24 2:55 下午
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
public interface ConfigManagerService {

    List<ConfigManager> getConfigManagerList();
}
