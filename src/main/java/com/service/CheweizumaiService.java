package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheweizumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheweizumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheweizumaiView;


/**
 * 车位租买
 *
 * @author 
 * @email 
 * @date 2021-04-23 10:20:09
 */
public interface CheweizumaiService extends IService<CheweizumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheweizumaiVO> selectListVO(Wrapper<CheweizumaiEntity> wrapper);
   	
   	CheweizumaiVO selectVO(@Param("ew") Wrapper<CheweizumaiEntity> wrapper);
   	
   	List<CheweizumaiView> selectListView(Wrapper<CheweizumaiEntity> wrapper);
   	
   	CheweizumaiView selectView(@Param("ew") Wrapper<CheweizumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheweizumaiEntity> wrapper);
   	
}

