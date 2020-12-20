package cn.chang.dto;

public class ResultDTOBuilder {

    public ResultDTOBuilder() {
    }

    public static ResultDTO success(){
        return new ResultDTO(true,"200",ResultMsgDTO.msg.get("000000"),"");
    }

    public static ResultDTO success(Object data){
        return new ResultDTO(true,"200",ResultMsgDTO.msg.get("000000"),data);
    }

    public static ResultDTO success(boolean status,String code,String msg,Object data){
        return new ResultDTO(status,code,msg,data);
    }

    public static ResultDTO failure(){
        return new ResultDTO(false,"400",ResultMsgDTO.msg.get("000001"),"");
    }

    public static ResultDTO failure(String code){
        return new ResultDTO(false,code,ResultMsgDTO.msg.get(code),"");
    }

    public static ResultDTO failure(boolean status,String code,String msg){
        return new ResultDTO(status,code,msg,"");
    }
}
