package com.jiuqiyou.jqyitemcommon.thro;

import com.jiuqiyou.jqyitemcommon.vo.SysResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class SystResultControllerAdvice {
    @ExceptionHandler(RuntimeException.class)
    public SysResult doHandelResponseException(Exception e){
        e.printStackTrace();
        log.error("服务器异常:"+e.getMessage());
        return SysResult.fail();
    }
}
