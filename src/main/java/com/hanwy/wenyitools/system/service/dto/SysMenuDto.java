package com.hanwy.wenyitools.system.service.dto;

import com.hanwy.wenyitools.common.entity.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 系统菜单传输模型对象
 *
 * @author hanwy
 * @date 2023/3/9
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysMenuDto extends BaseDto {
    private static final long serialVersionUID = 7455107627001528202L;

    /**
     * 标题
     */
    private String title;

    /**
     * 链接 url 地址
     */
    private String url;

    /**
     * 图标
     */
    private String icon;

    /**
     * 描述
     */
    private String description;

    /**
     * 父级菜单主键 id
     */
    private String parentId;

    /**
     * 菜单层级
     */
    private Byte level;

    /**
     * 显示排序
     */
    private Integer showSort;

}