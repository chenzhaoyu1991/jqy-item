package com.jiuqiyou.jqyitemmanage.controller;

import com.jiuqiyou.jqyitemmanage.service.ItemCatService;
import com.jiuqiyou.jqyitemmanage.vo.EasyUITree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item/cat")
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;
    @RequestMapping("/queryItemName")
    public String findItemCatById(Long itemCatId){
        return itemCatService.findItemCatById(itemCatId);
    }
    @RequestMapping("/list")
    public List<EasyUITree> findItemCatList(@RequestParam(defaultValue = "0",name = "id")Long parentId){
      return itemCatService.findItemCatList(parentId);
    }
}
