package com.dao;

import com.entity.ZaixianbaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixianbaoxiuVO;
import com.entity.view.ZaixianbaoxiuView;


/**
 * 在线报修
 * 
 * @author 
 * @email 
 * @date 2021-04-23 10:20:09
 */
public interface ZaixianbaoxiuDao extends BaseMapper<ZaixianbaoxiuEntity> {
	
	List<ZaixianbaoxiuVO> selectListVO(@Param("ew") Wrapper<ZaixianbaoxiuEntity> wrapper);
	
	ZaixianbaoxiuVO selectVO(@Param("ew") Wrapper<ZaixianbaoxiuEntity> wrapper);
	
	List<ZaixianbaoxiuView> selectListView(@Param("ew") Wrapper<ZaixianbaoxiuEntity> wrapper);

	List<ZaixianbaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixianbaoxiuEntity> wrapper);
	
	ZaixianbaoxiuView selectView(@Param("ew") Wrapper<ZaixianbaoxiuEntity> wrapper);
	
}
