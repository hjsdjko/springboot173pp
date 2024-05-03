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


import com.dao.KefangfuwuDao;
import com.entity.KefangfuwuEntity;
import com.service.KefangfuwuService;
import com.entity.vo.KefangfuwuVO;
import com.entity.view.KefangfuwuView;

@Service("kefangfuwuService")
public class KefangfuwuServiceImpl extends ServiceImpl<KefangfuwuDao, KefangfuwuEntity> implements KefangfuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KefangfuwuEntity> page = this.selectPage(
                new Query<KefangfuwuEntity>(params).getPage(),
                new EntityWrapper<KefangfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KefangfuwuEntity> wrapper) {
		  Page<KefangfuwuView> page =new Query<KefangfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KefangfuwuVO> selectListVO(Wrapper<KefangfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KefangfuwuVO selectVO(Wrapper<KefangfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KefangfuwuView> selectListView(Wrapper<KefangfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KefangfuwuView selectView(Wrapper<KefangfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
