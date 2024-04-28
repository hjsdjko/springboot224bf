package com.dao;

import com.entity.CheweizumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheweizumaiVO;
import com.entity.view.CheweizumaiView;


/**
 * 车位租买
 * 
 * @author 
 * @email 
 * @date 2021-04-23 10:20:09
 */
public interface CheweizumaiDao extends BaseMapper<CheweizumaiEntity> {
	
	List<CheweizumaiVO> selectListVO(@Param("ew") Wrapper<CheweizumaiEntity> wrapper);
	
	CheweizumaiVO selectVO(@Param("ew") Wrapper<CheweizumaiEntity> wrapper);
	
	List<CheweizumaiView> selectListView(@Param("ew") Wrapper<CheweizumaiEntity> wrapper);

	List<CheweizumaiView> selectListView(Pagination page,@Param("ew") Wrapper<CheweizumaiEntity> wrapper);
	
	CheweizumaiView selectView(@Param("ew") Wrapper<CheweizumaiEntity> wrapper);
	
}
