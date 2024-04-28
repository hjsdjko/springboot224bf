package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanyudajuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanyudajuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanyudajuanView;


/**
 * 参与答卷
 *
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
public interface CanyudajuanService extends IService<CanyudajuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanyudajuanVO> selectListVO(Wrapper<CanyudajuanEntity> wrapper);
   	
   	CanyudajuanVO selectVO(@Param("ew") Wrapper<CanyudajuanEntity> wrapper);
   	
   	List<CanyudajuanView> selectListView(Wrapper<CanyudajuanEntity> wrapper);
   	
   	CanyudajuanView selectView(@Param("ew") Wrapper<CanyudajuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanyudajuanEntity> wrapper);
   	
}

