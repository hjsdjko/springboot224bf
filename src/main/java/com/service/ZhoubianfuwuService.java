package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhoubianfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhoubianfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhoubianfuwuView;


/**
 * 周边服务
 *
 * @author 
 * @email 
 * @date 2021-04-23 10:20:10
 */
public interface ZhoubianfuwuService extends IService<ZhoubianfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhoubianfuwuVO> selectListVO(Wrapper<ZhoubianfuwuEntity> wrapper);
   	
   	ZhoubianfuwuVO selectVO(@Param("ew") Wrapper<ZhoubianfuwuEntity> wrapper);
   	
   	List<ZhoubianfuwuView> selectListView(Wrapper<ZhoubianfuwuEntity> wrapper);
   	
   	ZhoubianfuwuView selectView(@Param("ew") Wrapper<ZhoubianfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhoubianfuwuEntity> wrapper);
   	
}

