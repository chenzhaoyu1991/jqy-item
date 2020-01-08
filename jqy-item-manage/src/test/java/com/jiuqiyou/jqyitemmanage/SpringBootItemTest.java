package com.jiuqiyou.jqyitemmanage;

import com.jiuqiyou.jqyitemcommon.pojo.Item;
import com.jiuqiyou.jqyitemmanage.mapper.ItemMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
public class SpringBootItemTest {
    @Autowired
    private ItemMapper itemMapper;
    @Test
    public void testItem(){
        List<Item> itemList = itemMapper.findItemByPage(2, 3);
        System.out.println(itemList.size());
    }

}
