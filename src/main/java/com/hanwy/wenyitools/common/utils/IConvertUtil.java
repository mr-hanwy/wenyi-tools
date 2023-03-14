package com.hanwy.wenyitools.common.utils;

import com.hanwy.wenyitools.common.entity.BaseDto;
import com.hanwy.wenyitools.common.entity.BaseEntity;
import com.hanwy.wenyitools.common.entity.BaseVo;

/**
 * 基础模型对象转换服务接口
 *
 * @author hanwy
 * @date 2023/3/9
 */
public interface IConvertUtil<Vo extends BaseVo, Dto extends BaseDto, Entity extends BaseEntity> {
    /**
     * 将传输模型对象转换成展示模型对象
     *
     * @param dto 传输模型对象
     *
     * @return 展示模型对象
     */
    Vo toVo(Dto dto);

    /**
     * 将展示模型对象转换成传输模型对象
     *
     * @param vo 展示模型对象
     *
     * @return 传输模型对象
     */
    Dto toDto(Vo vo);

    /**
     * 将实体模型对象转换成传输模型对象
     *
     * @param entity 实体模型对象
     *
     * @return 传输模型对象
     */
    Dto toDto(Entity entity);

    /**
     * 将传输模型对象转换成实体模型对象
     *
     * @param dto 传输模型对象
     *
     * @return 实体模型对象
     */
    Entity toEntity(Dto dto);
}