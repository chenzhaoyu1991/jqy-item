package com.jiuqiyou.jqyitemmanage.vo;

import com.jiuqiyou.jqyitemcommon.pojo.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class EasyUITable {
    private Integer total;
    private List<Item> rows;
}
