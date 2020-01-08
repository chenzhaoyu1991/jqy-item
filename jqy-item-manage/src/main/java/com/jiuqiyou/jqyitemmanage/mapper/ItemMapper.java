package com.jiuqiyou.jqyitemmanage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiuqiyou.jqyitemcommon.pojo.Item;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemMapper extends BaseMapper<Item> {
    List<Item> findItemByPage(
            @Param("start") Integer start,
            @Param("rows") Integer rows);
    //void update(@Param("ids")Long[] ids,@Param("status") Integer status);
}
