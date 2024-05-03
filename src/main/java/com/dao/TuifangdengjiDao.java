package com.dao;

import com.entity.TuifangdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuifangdengjiVO;
import com.entity.view.TuifangdengjiView;


/**
 * 退房登记
 * 
 * @author 
 * @email 
 * @date 2021-03-09 01:32:48
 */
public interface TuifangdengjiDao extends BaseMapper<TuifangdengjiEntity> {
	
	List<TuifangdengjiVO> selectListVO(@Param("ew") Wrapper<TuifangdengjiEntity> wrapper);
	
	TuifangdengjiVO selectVO(@Param("ew") Wrapper<TuifangdengjiEntity> wrapper);
	
	List<TuifangdengjiView> selectListView(@Param("ew") Wrapper<TuifangdengjiEntity> wrapper);

	List<TuifangdengjiView> selectListView(Pagination page,@Param("ew") Wrapper<TuifangdengjiEntity> wrapper);
	
	TuifangdengjiView selectView(@Param("ew") Wrapper<TuifangdengjiEntity> wrapper);
	
}
