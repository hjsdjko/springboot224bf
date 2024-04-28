package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshequxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshequxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshequxinxiView;


/**
 * 社区信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
public interface DiscussshequxinxiService extends IService<DiscussshequxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshequxinxiVO> selectListVO(Wrapper<DiscussshequxinxiEntity> wrapper);
   	
   	DiscussshequxinxiVO selectVO(@Param("ew") Wrapper<DiscussshequxinxiEntity> wrapper);
   	
   	List<DiscussshequxinxiView> selectListView(Wrapper<DiscussshequxinxiEntity> wrapper);
   	
   	DiscussshequxinxiView selectView(@Param("ew") Wrapper<DiscussshequxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshequxinxiEntity> wrapper);
   	
}

