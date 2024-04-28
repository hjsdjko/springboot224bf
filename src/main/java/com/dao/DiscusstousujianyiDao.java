package com.dao;

import com.entity.DiscusstousujianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstousujianyiVO;
import com.entity.view.DiscusstousujianyiView;


/**
 * 投诉建议评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
public interface DiscusstousujianyiDao extends BaseMapper<DiscusstousujianyiEntity> {
	
	List<DiscusstousujianyiVO> selectListVO(@Param("ew") Wrapper<DiscusstousujianyiEntity> wrapper);
	
	DiscusstousujianyiVO selectVO(@Param("ew") Wrapper<DiscusstousujianyiEntity> wrapper);
	
	List<DiscusstousujianyiView> selectListView(@Param("ew") Wrapper<DiscusstousujianyiEntity> wrapper);

	List<DiscusstousujianyiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstousujianyiEntity> wrapper);
	
	DiscusstousujianyiView selectView(@Param("ew") Wrapper<DiscusstousujianyiEntity> wrapper);
	
}
