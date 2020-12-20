package cn.chang.dto;

import java.util.HashMap;
import java.util.Map;

public class ResultMsgDTO {
    public static Map<String,String> msg;
    static {
        msg = new HashMap<>();
        //通用标识
        msg.put("000000","成功");
        msg.put("000001","意外的错误,稍后重试");

        //客户端问题
        msg.put("010000","请求环境异常");
        msg.put("010001","参数异常,检查参数");
        msg.put("010002","必填参数,不能为空");
        //客户端需要更新,但是还依然提供接口能力
        msg.put("010003","请求成功,客户端版本需要更新");
        //客户端需要更新,不更新无法提供接口能力
        msg.put("010004","请求失败,客户端需要强制更新");

        //服务端问题
        msg.put("020000","数据源错误,请联系管理人员");
        msg.put("020001","io错误,请联系管理人员");
        msg.put("020002","版本信息读取失败,请联系管理人员");
    }
}
