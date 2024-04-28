package com.dao;

import com.entity.AixinzhulaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AixinzhulaoVO;
import com.entity.view.AixinzhulaoView;


/**
 * 爱心助老
 * 
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
public interface AixinzhulaoDao extends BaseMapper<AixinzhulaoEntity> {
	
	List<AixinzhulaoVO> selectListVO(@Param("ew") Wrapper<AixinzhulaoEntity> wrapper);
	
	AixinzhulaoVO selectVO(@Param("ew") Wrapper<AixinzhulaoEntity> wrapper);
	
	List<AixinzhulaoView> selectListView(@Param("ew") Wrapper<AixinzhulaoEntity> wrapper);

	List<AixinzhulaoView> selectListView(Pagination page,@Param("ew") Wrapper<AixinzhulaoEntity> wrapper);
	
	AixinzhulaoView selectView(@Param("ew") Wrapper<AixinzhulaoEntity> wrapper);
	
}
