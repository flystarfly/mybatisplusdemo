package com.flystarfly.mybatisplusdemo.domain.entity;



import com.flystarfly.mybatisplusdemo.common.BaseEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * 角色模块表
 * @author Zhouzq
 *
 */
@Component
@Data
public class SysRoleFunc  extends BaseEntity {

	private String name;
	private Long roleId;
	private Long funcId;
	private List<SysFunc> sysFuncSubList;
	
	private String funcIds;


}
