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


import com.dao.CheweizumaiDao;
import com.entity.CheweizumaiEntity;
import com.service.CheweizumaiService;
import com.entity.vo.CheweizumaiVO;
import com.entity.view.CheweizumaiView;

@Service("cheweizumaiService")
public class CheweizumaiServiceImpl extends ServiceImpl<CheweizumaiDao, CheweizumaiEntity> implements CheweizumaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheweizumaiEntity> page = this.selectPage(
                new Query<CheweizumaiEntity>(params).getPage(),
                new EntityWrapper<CheweizumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheweizumaiEntity> wrapper) {
		  Page<CheweizumaiView> page =new Query<CheweizumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheweizumaiVO> selectListVO(Wrapper<CheweizumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheweizumaiVO selectVO(Wrapper<CheweizumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheweizumaiView> selectListView(Wrapper<CheweizumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheweizumaiView selectView(Wrapper<CheweizumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
