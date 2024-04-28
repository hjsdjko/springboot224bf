package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TousujianyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TousujianyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TousujianyiView;


/**
 * 投诉建议
 *
 * @author 
 * @email 
 * @date 2021-04-23 10:20:09
 */
public interface TousujianyiService extends IService<TousujianyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TousujianyiVO> selectListVO(Wrapper<TousujianyiEntity> wrapper);
   	
   	TousujianyiVO selectVO(@Param("ew") Wrapper<TousujianyiEntity> wrapper);
   	
   	List<TousujianyiView> selectListView(Wrapper<TousujianyiEntity> wrapper);
   	
   	TousujianyiView selectView(@Param("ew") Wrapper<TousujianyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TousujianyiEntity> wrapper);
   	
}

