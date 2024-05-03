package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuzhudengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuzhudengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuzhudengjiView;


/**
 * 入住登记
 *
 * @author 
 * @email 
 * @date 2021-03-09 01:32:48
 */
public interface RuzhudengjiService extends IService<RuzhudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuzhudengjiVO> selectListVO(Wrapper<RuzhudengjiEntity> wrapper);
   	
   	RuzhudengjiVO selectVO(@Param("ew") Wrapper<RuzhudengjiEntity> wrapper);
   	
   	List<RuzhudengjiView> selectListView(Wrapper<RuzhudengjiEntity> wrapper);
   	
   	RuzhudengjiView selectView(@Param("ew") Wrapper<RuzhudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuzhudengjiEntity> wrapper);
   	
}

