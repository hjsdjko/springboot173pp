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


import com.dao.RuzhudengjiDao;
import com.entity.RuzhudengjiEntity;
import com.service.RuzhudengjiService;
import com.entity.vo.RuzhudengjiVO;
import com.entity.view.RuzhudengjiView;

@Service("ruzhudengjiService")
public class RuzhudengjiServiceImpl extends ServiceImpl<RuzhudengjiDao, RuzhudengjiEntity> implements RuzhudengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuzhudengjiEntity> page = this.selectPage(
                new Query<RuzhudengjiEntity>(params).getPage(),
                new EntityWrapper<RuzhudengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuzhudengjiEntity> wrapper) {
		  Page<RuzhudengjiView> page =new Query<RuzhudengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuzhudengjiVO> selectListVO(Wrapper<RuzhudengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuzhudengjiVO selectVO(Wrapper<RuzhudengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuzhudengjiView> selectListView(Wrapper<RuzhudengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuzhudengjiView selectView(Wrapper<RuzhudengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
