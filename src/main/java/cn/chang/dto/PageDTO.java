package cn.chang.dto;

import lombok.Data;

/**
 * 用于封装Page信息的类
 * @Author RemiliaScarlet
 */

@Data
public class PageDTO {
    private int total;
    private int size;
    private int current;
    private int pages;

    private Object data;
}
