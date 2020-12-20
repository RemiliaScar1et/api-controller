package cn.chang.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ResultDTO implements Serializable {
    public boolean status = true;
    public String code;
    public String msg;
    public Object data;

    public ResultDTO() {
    }

    public ResultDTO(boolean status, String code, String msg, Object data) {
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
