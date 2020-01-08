package com.jiuqiyou.jqyitemcommon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class SysResult implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer status;
    private String msg;
    private Object data;
    public static SysResult success(){
        return new SysResult(200,"ok",null);
    }
    public static SysResult success(String msg,Object data){
        return new SysResult(200,msg,data);
    }
    public static SysResult success(Object data){
        return new SysResult(200,"ok",data);
    }
    public static SysResult fail(){
        return new SysResult(201,"服务器执行失败",null);
    }
}
