package cn.chang.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * interface 实体类
 * @author RemiliaScarlet
 */
@Data
public class Interface implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String apiTitle;

    private String apiUri;

    private String apiNotes;

    private Integer proId;

    private Integer apiStatus;
}