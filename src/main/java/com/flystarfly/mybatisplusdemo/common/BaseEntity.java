package com.flystarfly.mybatisplusdemo.common;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * 所有实体基类
 * 
 * @author Zhouzq
 */
@Data
public abstract class BaseEntity implements Serializable {
	private static final long serialVersionUID = -2556063656559150668L;
	@TableId
	private Integer seqid;


	public String getSeqidStr() {
		return seqid + "";
	}

}
