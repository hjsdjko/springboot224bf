package com.entity.view;

import com.entity.ZhoubianfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 周边服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
@TableName("zhoubianfuwu")
public class ZhoubianfuwuView  extends ZhoubianfuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhoubianfuwuView(){
	}
 
 	public ZhoubianfuwuView(ZhoubianfuwuEntity zhoubianfuwuEntity){
 	try {
			BeanUtils.copyProperties(this, zhoubianfuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
