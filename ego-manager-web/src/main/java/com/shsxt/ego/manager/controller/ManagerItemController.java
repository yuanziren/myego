package com.shsxt.ego.manager.controller;

import com.shsxt.ego.common.model.PageResult;
import com.shsxt.ego.manager.service.IManagerItemService;
import com.shsxt.ego.rpc.pojo.TbItem;
import com.shsxt.ego.rpc.query.ItemQuery;
import com.shsxt.ego.rpc.service.IItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ManagerItemController {
    @Resource
    private IManagerItemService managerItemService;


    @RequestMapping("item/list")
    @ResponseBody
    public PageResult<TbItem> itemList(ItemQuery itemQuery){
        return managerItemService.itemList(itemQuery);
    }
}
