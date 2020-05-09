package com.flystarfly.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.flystarfly.mybatisplusdemo.domain.entity.ConfigManager;
import com.flystarfly.mybatisplusdemo.domain.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

/**
 * @author zhouzhiqing
 * @deacription TODO
 * @createTime 2020/5/6 2:09 下午
 * @company 杭州泽达鑫药盟技术有限公司
 * @department
 * @Version 1.0
 **/
public interface SysUserMapper extends BaseMapper<SysUser> {


    public int getCount();

    @Select(value=" select * from sys_user")
    public List<SysUser> allSysUsers();

    @Select(value=" select * from sys_user where seqid = ?")
    public SysUser findById(long seqid);

    @Select(value=" delete from sys_user where seqid = ?")
    public void deleteForId(long seqid);

    @Select(value=" select password from sys_user where username = #{name}")
    public String findPassWordByName(@Param("name") String name);

    List<SysUser> querySysUserList();

    List<String> getUrlListByUsername(String username);

}
