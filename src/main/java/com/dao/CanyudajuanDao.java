package com.dao;

import com.entity.CanyudajuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanyudajuanVO;
import com.entity.view.CanyudajuanView;


/**
 * 参与答卷
 * 
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
public interface CanyudajuanDao extends BaseMapper<CanyudajuanEntity> {
	
	List<CanyudajuanVO> selectListVO(@Param("ew") Wrapper<CanyudajuanEntity> wrapper);
	
	CanyudajuanVO selectVO(@Param("ew") Wrapper<CanyudajuanEntity> wrapper);
	
	List<CanyudajuanView> selectListView(@Param("ew") Wrapper<CanyudajuanEntity> wrapper);

	List<CanyudajuanView> selectListView(Pagination page,@Param("ew") Wrapper<CanyudajuanEntity> wrapper);
	
	CanyudajuanView selectView(@Param("ew") Wrapper<CanyudajuanEntity> wrapper);
	
}
