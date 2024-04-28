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


import com.dao.DiscusstousujianyiDao;
import com.entity.DiscusstousujianyiEntity;
import com.service.DiscusstousujianyiService;
import com.entity.vo.DiscusstousujianyiVO;
import com.entity.view.DiscusstousujianyiView;

@Service("discusstousujianyiService")
public class DiscusstousujianyiServiceImpl extends ServiceImpl<DiscusstousujianyiDao, DiscusstousujianyiEntity> implements DiscusstousujianyiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstousujianyiEntity> page = this.selectPage(
                new Query<DiscusstousujianyiEntity>(params).getPage(),
                new EntityWrapper<DiscusstousujianyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstousujianyiEntity> wrapper) {
		  Page<DiscusstousujianyiView> page =new Query<DiscusstousujianyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstousujianyiVO> selectListVO(Wrapper<DiscusstousujianyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstousujianyiVO selectVO(Wrapper<DiscusstousujianyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstousujianyiView> selectListView(Wrapper<DiscusstousujianyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstousujianyiView selectView(Wrapper<DiscusstousujianyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
