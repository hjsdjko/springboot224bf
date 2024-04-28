package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AixinzhulaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AixinzhulaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AixinzhulaoView;


/**
 * 爱心助老
 *
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
public interface AixinzhulaoService extends IService<AixinzhulaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AixinzhulaoVO> selectListVO(Wrapper<AixinzhulaoEntity> wrapper);
   	
   	AixinzhulaoVO selectVO(@Param("ew") Wrapper<AixinzhulaoEntity> wrapper);
   	
   	List<AixinzhulaoView> selectListView(Wrapper<AixinzhulaoEntity> wrapper);
   	
   	AixinzhulaoView selectView(@Param("ew") Wrapper<AixinzhulaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AixinzhulaoEntity> wrapper);
   	
}

