package com.jiuqiyou.jqyitemmanage.service;

import com.jiuqiyou.jqyitemcommon.pojo.Item;
import com.jiuqiyou.jqyitemmanage.vo.EasyUITable;
import jdk.net.SocketFlow;

public interface ItemService {
    EasyUITable findItemByPage(Integer page, Integer rows);
    int saveItem(Item item);
    int updateItem(Item item);

    void updateStatus(Long[] ids, Integer status);
}
