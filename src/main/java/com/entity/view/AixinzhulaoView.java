package com.entity.view;

import com.entity.AixinzhulaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 爱心助老
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
@TableName("aixinzhulao")
public class AixinzhulaoView  extends AixinzhulaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public AixinzhulaoView(){
	}
 
 	public AixinzhulaoView(AixinzhulaoEntity aixinzhulaoEntity){
 	try {
			BeanUtils.copyProperties(this, aixinzhulaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
