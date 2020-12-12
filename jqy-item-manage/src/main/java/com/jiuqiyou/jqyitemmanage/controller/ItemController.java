package com.jiuqiyou.jqyitemmanage.controller;

import com.jiuqiyou.jqyitemcommon.pojo.Item;
import com.jiuqiyou.jqyitemcommon.vo.SysResult;
import com.jiuqiyou.jqyitemmanage.service.ItemService;
import com.jiuqiyou.jqyitemmanage.vo.EasyUITable;
import com.jiuqiyou.jqyitemmanage.vo.EasyUITree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/query")
    public EasyUITable findItemByPage(Integer page,Integer rows){
        return itemService.findItemByPage(page,rows);
    }
    @RequestMapping("/save")
    public SysResult doSave(Item item){
        itemService.saveItem(item);
       return SysResult.success();
    }
    @RequestMapping("/update")
    public SysResult doUpdate(Item item){
        itemService.updateItem(item);
        return SysResult.success();
    }
    @RequestMapping("/instock")
    public SysResult instock(Long[] ids){
        int status = 2;
        itemService.updateStatus(ids,status);
        return SysResult.success();
    }
    @RequestMapping("/reshelf")
    public SysResult reshelf(Long[] ids){
        int status = 1;
        itemService.updateStatus(ids,status);
        return SysResult.success();
    }

    public static void main(String[] args) {
        System.out.println("你是哪个掉毛");
    }



}
