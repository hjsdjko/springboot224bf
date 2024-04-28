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


import com.dao.DiscussshequxinxiDao;
import com.entity.DiscussshequxinxiEntity;
import com.service.DiscussshequxinxiService;
import com.entity.vo.DiscussshequxinxiVO;
import com.entity.view.DiscussshequxinxiView;

@Service("discussshequxinxiService")
public class DiscussshequxinxiServiceImpl extends ServiceImpl<DiscussshequxinxiDao, DiscussshequxinxiEntity> implements DiscussshequxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshequxinxiEntity> page = this.selectPage(
                new Query<DiscussshequxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshequxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshequxinxiEntity> wrapper) {
		  Page<DiscussshequxinxiView> page =new Query<DiscussshequxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshequxinxiVO> selectListVO(Wrapper<DiscussshequxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshequxinxiVO selectVO(Wrapper<DiscussshequxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshequxinxiView> selectListView(Wrapper<DiscussshequxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshequxinxiView selectView(Wrapper<DiscussshequxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
