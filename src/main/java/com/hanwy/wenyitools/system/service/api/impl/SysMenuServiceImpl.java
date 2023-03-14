package com.hanwy.wenyitools.system.service.api.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hanwy.wenyitools.system.repository.api.ISysMenuRepository;
import com.hanwy.wenyitools.system.repository.entity.SysMenuEntity;
import com.hanwy.wenyitools.system.service.api.ISysMenuService;
import org.springframework.stereotype.Service;

/**
 * 系统菜单业务逻辑接口实现类
 *
 * @author hanwy
 * @date 2023/3/9
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<ISysMenuRepository, SysMenuEntity> implements ISysMenuService {
}