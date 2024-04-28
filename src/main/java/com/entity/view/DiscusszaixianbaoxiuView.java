package com.entity.view;

import com.entity.DiscusszaixianbaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线报修评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
@TableName("discusszaixianbaoxiu")
public class DiscusszaixianbaoxiuView  extends DiscusszaixianbaoxiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszaixianbaoxiuView(){
	}
 
 	public DiscusszaixianbaoxiuView(DiscusszaixianbaoxiuEntity discusszaixianbaoxiuEntity){
 	try {
			BeanUtils.copyProperties(this, discusszaixianbaoxiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
