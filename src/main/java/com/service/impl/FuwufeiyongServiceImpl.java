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


import com.dao.FuwufeiyongDao;
import com.entity.FuwufeiyongEntity;
import com.service.FuwufeiyongService;
import com.entity.vo.FuwufeiyongVO;
import com.entity.view.FuwufeiyongView;

@Service("fuwufeiyongService")
public class FuwufeiyongServiceImpl extends ServiceImpl<FuwufeiyongDao, FuwufeiyongEntity> implements FuwufeiyongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwufeiyongEntity> page = this.selectPage(
                new Query<FuwufeiyongEntity>(params).getPage(),
                new EntityWrapper<FuwufeiyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwufeiyongEntity> wrapper) {
		  Page<FuwufeiyongView> page =new Query<FuwufeiyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwufeiyongVO> selectListVO(Wrapper<FuwufeiyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwufeiyongVO selectVO(Wrapper<FuwufeiyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwufeiyongView> selectListView(Wrapper<FuwufeiyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwufeiyongView selectView(Wrapper<FuwufeiyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
