package com.dao;

import com.entity.TousujianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TousujianyiVO;
import com.entity.view.TousujianyiView;


/**
 * 投诉建议
 * 
 * @author 
 * @email 
 * @date 2021-04-23 10:20:09
 */
public interface TousujianyiDao extends BaseMapper<TousujianyiEntity> {
	
	List<TousujianyiVO> selectListVO(@Param("ew") Wrapper<TousujianyiEntity> wrapper);
	
	TousujianyiVO selectVO(@Param("ew") Wrapper<TousujianyiEntity> wrapper);
	
	List<TousujianyiView> selectListView(@Param("ew") Wrapper<TousujianyiEntity> wrapper);

	List<TousujianyiView> selectListView(Pagination page,@Param("ew") Wrapper<TousujianyiEntity> wrapper);
	
	TousujianyiView selectView(@Param("ew") Wrapper<TousujianyiEntity> wrapper);
	
}
