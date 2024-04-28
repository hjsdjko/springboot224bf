package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhoubianfuwuDao;
import com.entity.ZhoubianfuwuEntity;
import com.service.ZhoubianfuwuService;
import com.entity.vo.ZhoubianfuwuVO;
import com.entity.view.ZhoubianfuwuView;

@Service("zhoubianfuwuService")
public class ZhoubianfuwuServiceImpl extends ServiceImpl<ZhoubianfuwuDao, ZhoubianfuwuEntity> implements ZhoubianfuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhoubianfuwuEntity> page = this.selectPage(
                new Query<ZhoubianfuwuEntity>(params).getPage(),
                new EntityWrapper<ZhoubianfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhoubianfuwuEntity> wrapper) {
		  Page<ZhoubianfuwuView> page =new Query<ZhoubianfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhoubianfuwuVO> selectListVO(Wrapper<ZhoubianfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhoubianfuwuVO selectVO(Wrapper<ZhoubianfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhoubianfuwuView> selectListView(Wrapper<ZhoubianfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhoubianfuwuView selectView(Wrapper<ZhoubianfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
