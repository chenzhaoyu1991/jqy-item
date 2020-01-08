package com.jiuqiyou.jqyitemmanage.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jiuqiyou.jqyitemcommon.pojo.Item;
import com.jiuqiyou.jqyitemmanage.mapper.ItemMapper;
import com.jiuqiyou.jqyitemmanage.vo.EasyUITable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Wrapper;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;

    @Override
    public EasyUITable findItemByPage(Integer page, Integer rows) {
        int total = itemMapper.selectCount(null);
        int start = (page-1)*rows;
        List<Item> itemList = itemMapper.findItemByPage(start,rows);
        EasyUITable easyUITable = new EasyUITable();
        easyUITable.setRows(itemList)
                   .setTotal(total);
        return easyUITable;
    }

    @Override
    @Transactional
    public int saveItem(Item item) {
            item.setStatus(1)
                .setCreated(new Date())
                .setUpdated(item.getCreated());
        return itemMapper.insert(item);
    }

    @Override
    public int updateItem(Item item) {
        item.setUpdated(new Date());
        return itemMapper.updateById(item);
    }

    @Override
    public void updateStatus(Long[] ids, Integer status) {
        //itemMapper.update(ids,status);
        Item item = new Item();
        item.setStatus(status).setUpdated(new Date());
        UpdateWrapper<Item> updateWrapper = new UpdateWrapper<>();
        List<Long> idList = Arrays.asList(ids);
        updateWrapper.in("id",idList);
        itemMapper.update(item,updateWrapper);
    }

}
