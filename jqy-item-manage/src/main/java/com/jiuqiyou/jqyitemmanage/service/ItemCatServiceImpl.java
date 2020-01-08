package com.jiuqiyou.jqyitemmanage.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jiuqiyou.jqyitemcommon.pojo.ItemCat;
import com.jiuqiyou.jqyitemmanage.mapper.ItemCatMapper;
import com.jiuqiyou.jqyitemmanage.vo.EasyUITree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private ItemCatMapper itemCatMapper;


    @Override
    public String findItemCatById(Long itemCatId) {
        ItemCat itemCat = itemCatMapper.selectById(itemCatId);
        return itemCat.getName();
    }

    @Override
    public List<EasyUITree> findItemCatList(Long parentId) {
        List<ItemCat> itemCatList = getItemCatList(parentId);
        List<EasyUITree> easyUITreeList = new ArrayList<EasyUITree>();
        for(ItemCat itemCat : itemCatList){
            EasyUITree easyUITree = new EasyUITree();
            String state = itemCat.getIsParent()?"closed":"open";
            easyUITree.setId(itemCat.getId())
                      .setText(itemCat.getName())
                      .setState(state);
            easyUITreeList.add(easyUITree);
        }
        return easyUITreeList;
    }

    public List<ItemCat> getItemCatList(Long parentId) {
        QueryWrapper<ItemCat> queryWrapper = new QueryWrapper<ItemCat>();
        queryWrapper.eq("parent_id",parentId);
        List<ItemCat> itemCatList = itemCatMapper.selectList(queryWrapper);
        return itemCatList;
    }
}
