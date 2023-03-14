package com.hanwy.wenyitools.system.utils;

import com.hanwy.wenyitools.common.utils.IConvertUtil;
import com.hanwy.wenyitools.system.repository.entity.SysMenuEntity;
import com.hanwy.wenyitools.system.service.dto.SysMenuDto;
import com.hanwy.wenyitools.system.web.vo.SysMenuVo;
import org.springframework.stereotype.Component;

/**
 * 系统菜单模型对象转换服务接口
 *
 * @author hanwy
 * @date 2023/3/9
 */
@Component
public interface ISysMenuConvert extends IConvertUtil<SysMenuVo, SysMenuDto, SysMenuEntity> {
}