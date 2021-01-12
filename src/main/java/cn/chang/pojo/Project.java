package cn.chang.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * project 实体类
 * @author RemiliaScarlet
 */
@Data
public class Project implements Serializable {
    private static final long serserialVersionUID = 1L;

    private Integer id;
    private String proName;
    private String proIntroduce;
    private Integer proStatus;
}
