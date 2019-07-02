package com.shsxt;


import com.shsxt.ego.rpc.service.IItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring/applicationContext-dao.xml",
        "classpath:spring/applicationContext-service.xml",
        "classpath:spring/applicationContext-tx.xml"
})
public class TestItemService {

    @Resource
    private IItemService iItemService;

    @Test
    public void test01(){
        Long[] ids = {562379l,536563l};
        iItemService.deleteItemBatch(ids);
    }
}
