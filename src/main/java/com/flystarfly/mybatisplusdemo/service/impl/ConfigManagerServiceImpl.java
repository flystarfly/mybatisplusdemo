package com.flystarfly.mybatisplusdemo.service.impl;
import	java.util.List;

import com.flystarfly.mybatisplusdemo.domain.entity.ConfigManager;
import com.flystarfly.mybatisplusdemo.mapper.ConfigManagerMapper;
import com.flystarfly.mybatisplusdemo.service.ConfigManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouzhiqing
 * @deacription 配置表Service接口实现类
 * @createTime 2020/4/24 2:55 下午
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Service
public class ConfigManagerServiceImpl implements ConfigManagerService {

    @Autowired
    private ConfigManagerMapper configManagerMapper;

    @Override
    public List<ConfigManager> getConfigManagerList(){
        return this.configManagerMapper.selectList(null);
    }
}
