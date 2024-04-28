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


import com.dao.DiscusszaixianbaoxiuDao;
import com.entity.DiscusszaixianbaoxiuEntity;
import com.service.DiscusszaixianbaoxiuService;
import com.entity.vo.DiscusszaixianbaoxiuVO;
import com.entity.view.DiscusszaixianbaoxiuView;

@Service("discusszaixianbaoxiuService")
public class DiscusszaixianbaoxiuServiceImpl extends ServiceImpl<DiscusszaixianbaoxiuDao, DiscusszaixianbaoxiuEntity> implements DiscusszaixianbaoxiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszaixianbaoxiuEntity> page = this.selectPage(
                new Query<DiscusszaixianbaoxiuEntity>(params).getPage(),
                new EntityWrapper<DiscusszaixianbaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszaixianbaoxiuEntity> wrapper) {
		  Page<DiscusszaixianbaoxiuView> page =new Query<DiscusszaixianbaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszaixianbaoxiuVO> selectListVO(Wrapper<DiscusszaixianbaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszaixianbaoxiuVO selectVO(Wrapper<DiscusszaixianbaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszaixianbaoxiuView> selectListView(Wrapper<DiscusszaixianbaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszaixianbaoxiuView selectView(Wrapper<DiscusszaixianbaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
