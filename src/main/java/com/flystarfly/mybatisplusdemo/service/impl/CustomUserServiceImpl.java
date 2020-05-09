package com.flystarfly.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.flystarfly.mybatisplusdemo.domain.entity.SysUser;
import com.flystarfly.mybatisplusdemo.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouzhiqing
 * @deacription TODO
 * @createTime 2020/5/6 7:26 下午
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Service
public class CustomUserServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysUser::getUsername, username);
        SysUser sysUser = sysUserMapper.selectOne(queryWrapper);
        if(sysUser!=null){
            return new User(sysUser.getUsername(), new BCryptPasswordEncoder().encode(sysUser.getPassword()), sysUser.getAuthorities());
        }
        return  new SysUser();
    }
}
