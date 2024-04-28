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


import com.dao.CanyudajuanDao;
import com.entity.CanyudajuanEntity;
import com.service.CanyudajuanService;
import com.entity.vo.CanyudajuanVO;
import com.entity.view.CanyudajuanView;

@Service("canyudajuanService")
public class CanyudajuanServiceImpl extends ServiceImpl<CanyudajuanDao, CanyudajuanEntity> implements CanyudajuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanyudajuanEntity> page = this.selectPage(
                new Query<CanyudajuanEntity>(params).getPage(),
                new EntityWrapper<CanyudajuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanyudajuanEntity> wrapper) {
		  Page<CanyudajuanView> page =new Query<CanyudajuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanyudajuanVO> selectListVO(Wrapper<CanyudajuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanyudajuanVO selectVO(Wrapper<CanyudajuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanyudajuanView> selectListView(Wrapper<CanyudajuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanyudajuanView selectView(Wrapper<CanyudajuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
