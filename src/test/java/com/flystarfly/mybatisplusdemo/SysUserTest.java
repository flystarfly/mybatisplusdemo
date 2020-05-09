package com.flystarfly.mybatisplusdemo;

import cn.hutool.core.collection.CollectionUtil;
import com.flystarfly.mybatisplusdemo.domain.entity.ConfigManager;
import com.flystarfly.mybatisplusdemo.domain.entity.SysUser;
import com.flystarfly.mybatisplusdemo.mapper.ConfigManagerMapper;
import com.flystarfly.mybatisplusdemo.mapper.SysUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * @author zhouzhiqing
 * @deacription TODO
 * @createTime 2020/5/8 3:20 下午
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<SysUser> userList = sysUserMapper.querySysUserList();
        System.out.println(userList.size());
        String name = sysUserMapper.findPassWordByName("admin");
        System.out.println(name);
    }
}
