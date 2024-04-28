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


import com.dao.AixinzhulaoDao;
import com.entity.AixinzhulaoEntity;
import com.service.AixinzhulaoService;
import com.entity.vo.AixinzhulaoVO;
import com.entity.view.AixinzhulaoView;

@Service("aixinzhulaoService")
public class AixinzhulaoServiceImpl extends ServiceImpl<AixinzhulaoDao, AixinzhulaoEntity> implements AixinzhulaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AixinzhulaoEntity> page = this.selectPage(
                new Query<AixinzhulaoEntity>(params).getPage(),
                new EntityWrapper<AixinzhulaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AixinzhulaoEntity> wrapper) {
		  Page<AixinzhulaoView> page =new Query<AixinzhulaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AixinzhulaoVO> selectListVO(Wrapper<AixinzhulaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AixinzhulaoVO selectVO(Wrapper<AixinzhulaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AixinzhulaoView> selectListView(Wrapper<AixinzhulaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AixinzhulaoView selectView(Wrapper<AixinzhulaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
