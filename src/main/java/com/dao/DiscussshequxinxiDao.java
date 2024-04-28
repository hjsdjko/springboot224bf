package com.dao;

import com.entity.DiscussshequxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshequxinxiVO;
import com.entity.view.DiscussshequxinxiView;


/**
 * 社区信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
public interface DiscussshequxinxiDao extends BaseMapper<DiscussshequxinxiEntity> {
	
	List<DiscussshequxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussshequxinxiEntity> wrapper);
	
	DiscussshequxinxiVO selectVO(@Param("ew") Wrapper<DiscussshequxinxiEntity> wrapper);
	
	List<DiscussshequxinxiView> selectListView(@Param("ew") Wrapper<DiscussshequxinxiEntity> wrapper);

	List<DiscussshequxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshequxinxiEntity> wrapper);
	
	DiscussshequxinxiView selectView(@Param("ew") Wrapper<DiscussshequxinxiEntity> wrapper);
	
}
