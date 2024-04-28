package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixianbaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixianbaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixianbaoxiuView;


/**
 * 在线报修
 *
 * @author 
 * @email 
 * @date 2021-04-23 10:20:09
 */
public interface ZaixianbaoxiuService extends IService<ZaixianbaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixianbaoxiuVO> selectListVO(Wrapper<ZaixianbaoxiuEntity> wrapper);
   	
   	ZaixianbaoxiuVO selectVO(@Param("ew") Wrapper<ZaixianbaoxiuEntity> wrapper);
   	
   	List<ZaixianbaoxiuView> selectListView(Wrapper<ZaixianbaoxiuEntity> wrapper);
   	
   	ZaixianbaoxiuView selectView(@Param("ew") Wrapper<ZaixianbaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixianbaoxiuEntity> wrapper);
   	
}

