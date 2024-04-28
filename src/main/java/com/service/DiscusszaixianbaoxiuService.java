package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszaixianbaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszaixianbaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszaixianbaoxiuView;


/**
 * 在线报修评论表
 *
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
public interface DiscusszaixianbaoxiuService extends IService<DiscusszaixianbaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszaixianbaoxiuVO> selectListVO(Wrapper<DiscusszaixianbaoxiuEntity> wrapper);
   	
   	DiscusszaixianbaoxiuVO selectVO(@Param("ew") Wrapper<DiscusszaixianbaoxiuEntity> wrapper);
   	
   	List<DiscusszaixianbaoxiuView> selectListView(Wrapper<DiscusszaixianbaoxiuEntity> wrapper);
   	
   	DiscusszaixianbaoxiuView selectView(@Param("ew") Wrapper<DiscusszaixianbaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszaixianbaoxiuEntity> wrapper);
   	
}

