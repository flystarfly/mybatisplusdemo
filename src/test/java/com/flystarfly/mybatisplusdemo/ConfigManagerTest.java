package com.flystarfly.mybatisplusdemo;

import cn.hutool.core.collection.CollectionUtil;
import com.flystarfly.mybatisplusdemo.domain.entity.ConfigManager;
import com.flystarfly.mybatisplusdemo.mapper.ConfigManagerMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * @author zhouzhiqing
 * @deacription MYBATIS-PLUS测试类
 * @createTime 2020/4/24 2:11 下午
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigManagerTest {

    @Autowired
    private ConfigManagerMapper configManagerMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<ConfigManager> userList = configManagerMapper.selectList(null);

        ConfigManager configManager = new ConfigManager();
        configManager = configManagerMapper.selectById(2);
        userList.forEach(System.out::println);
        System.out.println(configManager.getName());

        List<Map<String, Object>> mapList = configManagerMapper.selectMaps(null);
        if(CollectionUtil.isEmpty(mapList)){

        }


        mapList.stream().forEach(map -> {
            System.out.println(map.keySet());
        });


    }


}


