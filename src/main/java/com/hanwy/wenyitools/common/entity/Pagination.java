package com.hanwy.wenyitools.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页查询参数对象
 *
 * @author hanwy
 * @date 2023/3/9
 */
@Data
public class Pagination implements Serializable {
    private static final long serialVersionUID = 4676777597649141486L;

    /**
     * 页码，默认“1”
     */
    private long pageIndex = 1;

    /**
     * 每页大小，默认“15”
     */
    private long pageSize = 15;

    /**
     * 总数据量，默认“0”
     */
    private long total = 0;

    /**
     * 总页数，默认“0”
     */
    private long pages = 0;
}