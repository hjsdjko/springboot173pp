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


import com.dao.TuifangdengjiDao;
import com.entity.TuifangdengjiEntity;
import com.service.TuifangdengjiService;
import com.entity.vo.TuifangdengjiVO;
import com.entity.view.TuifangdengjiView;

@Service("tuifangdengjiService")
public class TuifangdengjiServiceImpl extends ServiceImpl<TuifangdengjiDao, TuifangdengjiEntity> implements TuifangdengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuifangdengjiEntity> page = this.selectPage(
                new Query<TuifangdengjiEntity>(params).getPage(),
                new EntityWrapper<TuifangdengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuifangdengjiEntity> wrapper) {
		  Page<TuifangdengjiView> page =new Query<TuifangdengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuifangdengjiVO> selectListVO(Wrapper<TuifangdengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuifangdengjiVO selectVO(Wrapper<TuifangdengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuifangdengjiView> selectListView(Wrapper<TuifangdengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuifangdengjiView selectView(Wrapper<TuifangdengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
