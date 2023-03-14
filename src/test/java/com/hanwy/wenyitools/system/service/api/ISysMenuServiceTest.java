package com.hanwy.wenyitools.system.service.api;

import com.hanwy.wenyitools.system.repository.entity.SysMenuEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author hanwy
 * @date 2023/3/9
 */
@SpringBootTest
class ISysMenuServiceTest {

    @Autowired
    private ISysMenuService sysMenuService;

    @Test
    public void testQuery() {
        List<SysMenuEntity> list = sysMenuService.lambdaQuery().list();
        list.forEach(System.out::println);
    }

    @Test
    public void testAdd(){
        SysMenuEntity entity = new SysMenuEntity();
        entity.setTitle("test2");
        entity.setUrl("http://localhost/test2");
        System.out.println(sysMenuService.save(entity));
    }

    @Test
    public void testUpdate(){
        SysMenuEntity entity = new SysMenuEntity();
        entity.setId("2MmqXEX9CcN2Ek5xFbq3kYBxREq");
        entity.setTitle("test1");
        entity.setUrl("http://localhost/test1");
        System.out.println(sysMenuService.updateById(entity));
    }

    @Test
    public void testDelete(){
        System.out.println(sysMenuService.removeById("2MmrBvYZynSJEdMU8NzW2bpCFKY"));
    }
}