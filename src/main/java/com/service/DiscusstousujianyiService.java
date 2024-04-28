package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstousujianyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstousujianyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstousujianyiView;


/**
 * 投诉建议评论表
 *
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
public interface DiscusstousujianyiService extends IService<DiscusstousujianyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstousujianyiVO> selectListVO(Wrapper<DiscusstousujianyiEntity> wrapper);
   	
   	DiscusstousujianyiVO selectVO(@Param("ew") Wrapper<DiscusstousujianyiEntity> wrapper);
   	
   	List<DiscusstousujianyiView> selectListView(Wrapper<DiscusstousujianyiEntity> wrapper);
   	
   	DiscusstousujianyiView selectView(@Param("ew") Wrapper<DiscusstousujianyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstousujianyiEntity> wrapper);
   	
}

