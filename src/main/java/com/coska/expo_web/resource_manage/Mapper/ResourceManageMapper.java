package com.coska.expo_web.resource_manage.Mapper;

import com.coska.expo_web.resource_manage.Entity.ResourceManage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ResourceManageMapper {

    @Select("select * from resource_manage")
    List<ResourceManage> findAllElement();
}
