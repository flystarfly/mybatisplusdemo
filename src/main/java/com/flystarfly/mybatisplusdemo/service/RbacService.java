package com.flystarfly.mybatisplusdemo.service;

import com.flystarfly.mybatisplusdemo.domain.entity.SysUser;
import com.flystarfly.mybatisplusdemo.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zhouzhiqing
 * @deacription TODO
 * @createTime 2020/5/8 4:52 下午
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
@Component("rbacService")
public class RbacService {

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Autowired
    private SysUserMapper sysUserMapper;

    public boolean hasPermission(HttpServletRequest request, Authentication auth) {
        final boolean[] hasPermission = {false};
        Object principal = auth.getPrincipal();

        // 只有对非匿名用户才有必要进行权限控制
        if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();

            // 根据username 查询用户所拥有权限的所有URL
            Set<String> urls = getUrlsByUsername(username);
            // 遍历判断用户所访问的请求是否在其权限允许的范围内
            urls.forEach(url -> {
                if (antPathMatcher.match(url, request.getRequestURI())) {
                    hasPermission[0] = true;
                }
            });
        }

        return hasPermission[0];
    }


    Set<String> getUrlsByUsername(String username){
        List<String> list = sysUserMapper.getUrlListByUsername(username);
        Set<String> simpleSet = new HashSet<>(list);
        return simpleSet;
    }
}
