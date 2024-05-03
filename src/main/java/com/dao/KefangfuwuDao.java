package com.dao;

import com.entity.KefangfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KefangfuwuVO;
import com.entity.view.KefangfuwuView;


/**
 * 客房服务
 * 
 * @author 
 * @email 
 * @date 2021-03-09 01:32:48
 */
public interface KefangfuwuDao extends BaseMapper<KefangfuwuEntity> {
	
	List<KefangfuwuVO> selectListVO(@Param("ew") Wrapper<KefangfuwuEntity> wrapper);
	
	KefangfuwuVO selectVO(@Param("ew") Wrapper<KefangfuwuEntity> wrapper);
	
	List<KefangfuwuView> selectListView(@Param("ew") Wrapper<KefangfuwuEntity> wrapper);

	List<KefangfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<KefangfuwuEntity> wrapper);
	
	KefangfuwuView selectView(@Param("ew") Wrapper<KefangfuwuEntity> wrapper);
	
}
