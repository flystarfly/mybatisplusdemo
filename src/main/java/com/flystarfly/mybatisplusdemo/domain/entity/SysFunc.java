package com.flystarfly.mybatisplusdemo.domain.entity;


import com.flystarfly.mybatisplusdemo.common.BaseEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Data
public class SysFunc  extends BaseEntity {
	//模块名称
	private String name;
	//模块链接
	private String url;
	//上级菜单ID
	private Long preId;  //放在哪个上级模块的下面
	//自定义ID
	private String cusId; //作为左边导航展开用，一般是上级菜单用的
	//模块级别
	private Integer levelF; 
	
	private List<SysFunc> sysFuncSubList;
	
	private Integer checked; //逻辑用，不需要添加字段



}
