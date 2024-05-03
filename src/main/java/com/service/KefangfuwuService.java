package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KefangfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KefangfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KefangfuwuView;


/**
 * 客房服务
 *
 * @author 
 * @email 
 * @date 2021-03-09 01:32:48
 */
public interface KefangfuwuService extends IService<KefangfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KefangfuwuVO> selectListVO(Wrapper<KefangfuwuEntity> wrapper);
   	
   	KefangfuwuVO selectVO(@Param("ew") Wrapper<KefangfuwuEntity> wrapper);
   	
   	List<KefangfuwuView> selectListView(Wrapper<KefangfuwuEntity> wrapper);
   	
   	KefangfuwuView selectView(@Param("ew") Wrapper<KefangfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KefangfuwuEntity> wrapper);
   	
}

