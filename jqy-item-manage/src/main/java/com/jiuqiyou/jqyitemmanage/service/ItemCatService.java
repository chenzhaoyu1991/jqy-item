package com.jiuqiyou.jqyitemmanage.service;

import com.jiuqiyou.jqyitemcommon.pojo.ItemCat;
import com.jiuqiyou.jqyitemmanage.vo.EasyUITree;

import java.util.List;

public interface ItemCatService {
    String findItemCatById(Long itemCatId);

    List<EasyUITree> findItemCatList(Long parentId);
}
