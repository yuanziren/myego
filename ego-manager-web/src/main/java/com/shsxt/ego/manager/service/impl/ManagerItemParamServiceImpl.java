package com.shsxt.ego.manager.service.impl;

import com.shsxt.ego.common.model.PageResult;
import com.shsxt.ego.manager.service.IManagerItemParamService;
import com.shsxt.ego.rpc.pojo.TbItemParam;
import com.shsxt.ego.rpc.query.ItemParamQuery;
import com.shsxt.ego.rpc.service.IItemParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ManagerItemParamServiceImpl implements IManagerItemParamService {

    @Resource
    private IItemParamService itemParamServiceProxy;

    @Override
    public PageResult<TbItemParam> queryItemParamListByParams(ItemParamQuery itemParamQuery) {
        return itemParamServiceProxy.queryItemListByParams(itemParamQuery);
    }
}
