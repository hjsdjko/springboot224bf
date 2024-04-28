package com.dao;

import com.entity.DiscusszaixianbaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszaixianbaoxiuVO;
import com.entity.view.DiscusszaixianbaoxiuView;


/**
 * 在线报修评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
public interface DiscusszaixianbaoxiuDao extends BaseMapper<DiscusszaixianbaoxiuEntity> {
	
	List<DiscusszaixianbaoxiuVO> selectListVO(@Param("ew") Wrapper<DiscusszaixianbaoxiuEntity> wrapper);
	
	DiscusszaixianbaoxiuVO selectVO(@Param("ew") Wrapper<DiscusszaixianbaoxiuEntity> wrapper);
	
	List<DiscusszaixianbaoxiuView> selectListView(@Param("ew") Wrapper<DiscusszaixianbaoxiuEntity> wrapper);

	List<DiscusszaixianbaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszaixianbaoxiuEntity> wrapper);
	
	DiscusszaixianbaoxiuView selectView(@Param("ew") Wrapper<DiscusszaixianbaoxiuEntity> wrapper);
	
}
