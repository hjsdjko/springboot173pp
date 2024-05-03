package com.dao;

import com.entity.FuwufeiyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwufeiyongVO;
import com.entity.view.FuwufeiyongView;


/**
 * 服务费用
 * 
 * @author 
 * @email 
 * @date 2021-03-09 01:32:48
 */
public interface FuwufeiyongDao extends BaseMapper<FuwufeiyongEntity> {
	
	List<FuwufeiyongVO> selectListVO(@Param("ew") Wrapper<FuwufeiyongEntity> wrapper);
	
	FuwufeiyongVO selectVO(@Param("ew") Wrapper<FuwufeiyongEntity> wrapper);
	
	List<FuwufeiyongView> selectListView(@Param("ew") Wrapper<FuwufeiyongEntity> wrapper);

	List<FuwufeiyongView> selectListView(Pagination page,@Param("ew") Wrapper<FuwufeiyongEntity> wrapper);
	
	FuwufeiyongView selectView(@Param("ew") Wrapper<FuwufeiyongEntity> wrapper);
	
}
