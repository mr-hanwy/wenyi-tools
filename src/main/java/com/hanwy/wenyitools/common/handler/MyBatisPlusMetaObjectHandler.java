package com.hanwy.wenyitools.common.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.github.ksuid.KsuidGenerator;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;

/**
 * 自定义 MyBatisPlus 元对象处理器接口，实现自动注入公共字段属性值
 *
 * @author hanwy
 * @date 2023/3/10
 */
public class MyBatisPlusMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        fillStrategy(metaObject, "id", KsuidGenerator.generate());
        strictInsertFill(metaObject, "createTime", LocalDateTime::now, LocalDateTime.class);
        strictInsertFill(metaObject, "updateTime", LocalDateTime::now, LocalDateTime.class);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        strictUpdateFill(metaObject, "updateTime", LocalDateTime::now, LocalDateTime.class);
    }
}