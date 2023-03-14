package com.hanwy.wenyitools.system.repository.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hanwy.wenyitools.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 系统菜单实体模型对象
 *
 * @author hanwy
 * @date 2023/3/9
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_sys_menu")
public class SysMenuEntity extends BaseEntity {
    @TableField(exist = false)
    private static final long serialVersionUID = 7455107627001528202L;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 链接 url 地址
     */
    @TableField(value = "url")
    private String url;

    /**
     * 图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 父级菜单主键 id
     */
    @TableField(value = "parent_id")
    private String parentId;

    /**
     * 菜单层级
     */
    @TableField(value = "level")
    private Byte level;

    /**
     * 显示排序
     */
    @TableField(value = "show_sort")
    private Integer showSort;

}