package com.entity.view;

import com.entity.ZaixianbaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线报修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 10:20:09
 */
@TableName("zaixianbaoxiu")
public class ZaixianbaoxiuView  extends ZaixianbaoxiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaixianbaoxiuView(){
	}
 
 	public ZaixianbaoxiuView(ZaixianbaoxiuEntity zaixianbaoxiuEntity){
 	try {
			BeanUtils.copyProperties(this, zaixianbaoxiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
