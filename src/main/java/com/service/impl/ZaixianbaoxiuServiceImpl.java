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


import com.dao.ZaixianbaoxiuDao;
import com.entity.ZaixianbaoxiuEntity;
import com.service.ZaixianbaoxiuService;
import com.entity.vo.ZaixianbaoxiuVO;
import com.entity.view.ZaixianbaoxiuView;

@Service("zaixianbaoxiuService")
public class ZaixianbaoxiuServiceImpl extends ServiceImpl<ZaixianbaoxiuDao, ZaixianbaoxiuEntity> implements ZaixianbaoxiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixianbaoxiuEntity> page = this.selectPage(
                new Query<ZaixianbaoxiuEntity>(params).getPage(),
                new EntityWrapper<ZaixianbaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixianbaoxiuEntity> wrapper) {
		  Page<ZaixianbaoxiuView> page =new Query<ZaixianbaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixianbaoxiuVO> selectListVO(Wrapper<ZaixianbaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixianbaoxiuVO selectVO(Wrapper<ZaixianbaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixianbaoxiuView> selectListView(Wrapper<ZaixianbaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixianbaoxiuView selectView(Wrapper<ZaixianbaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
