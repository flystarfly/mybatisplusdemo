package com.flystarfly.mybatisplusdemo.domain.entity;



import com.flystarfly.mybatisplusdemo.common.BaseEntity;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
public class SysRole  extends BaseEntity {

	private String name;

}
