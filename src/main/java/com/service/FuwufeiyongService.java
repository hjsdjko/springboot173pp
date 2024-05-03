package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwufeiyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwufeiyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwufeiyongView;


/**
 * 服务费用
 *
 * @author 
 * @email 
 * @date 2021-03-09 01:32:48
 */
public interface FuwufeiyongService extends IService<FuwufeiyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwufeiyongVO> selectListVO(Wrapper<FuwufeiyongEntity> wrapper);
   	
   	FuwufeiyongVO selectVO(@Param("ew") Wrapper<FuwufeiyongEntity> wrapper);
   	
   	List<FuwufeiyongView> selectListView(Wrapper<FuwufeiyongEntity> wrapper);
   	
   	FuwufeiyongView selectView(@Param("ew") Wrapper<FuwufeiyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwufeiyongEntity> wrapper);
   	
}

