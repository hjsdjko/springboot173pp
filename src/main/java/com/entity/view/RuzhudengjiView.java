package com.entity.view;

import com.entity.RuzhudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 入住登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 01:32:48
 */
@TableName("ruzhudengji")
public class RuzhudengjiView  extends RuzhudengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RuzhudengjiView(){
	}
 
 	public RuzhudengjiView(RuzhudengjiEntity ruzhudengjiEntity){
 	try {
			BeanUtils.copyProperties(this, ruzhudengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
