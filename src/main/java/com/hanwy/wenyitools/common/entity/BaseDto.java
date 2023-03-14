package com.hanwy.wenyitools.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 抽象传输模型对象
 *
 * @author hanwy
 * @date 2023/3/8
 */
@Data
public abstract class BaseDto implements Serializable {
    private static final long serialVersionUID = -5343181101479641236L;

    /**
     * 主键 id
     */
    private String id;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}