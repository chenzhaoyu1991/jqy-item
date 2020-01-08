package com.jiuqiyou.jqyitemmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/page/{modelName}")
    public String doIndexUI(@PathVariable String modelName){
        return modelName;
    }
}
