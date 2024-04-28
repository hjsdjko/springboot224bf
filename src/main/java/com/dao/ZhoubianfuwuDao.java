package com.dao;

import com.entity.ZhoubianfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhoubianfuwuVO;
import com.entity.view.ZhoubianfuwuView;


/**
 * 周边服务
 * 
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
public interface ZhoubianfuwuDao extends BaseMapper<ZhoubianfuwuEntity> {
	
	List<ZhoubianfuwuVO> selectListVO(@Param("ew") Wrapper<ZhoubianfuwuEntity> wrapper);
	
	ZhoubianfuwuVO selectVO(@Param("ew") Wrapper<ZhoubianfuwuEntity> wrapper);
	
	List<ZhoubianfuwuView> selectListView(@Param("ew") Wrapper<ZhoubianfuwuEntity> wrapper);

	List<ZhoubianfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhoubianfuwuEntity> wrapper);
	
	ZhoubianfuwuView selectView(@Param("ew") Wrapper<ZhoubianfuwuEntity> wrapper);
	
}
