package com.shsxt.ego.manager.service;

import com.shsxt.ego.common.model.PageResult;
import com.shsxt.ego.rpc.pojo.TbItemParam;
import com.shsxt.ego.rpc.query.ItemParamQuery;

public interface IManagerItemParamService {

    public PageResult<TbItemParam> queryItemParamListByParams(ItemParamQuery itemParamQuery);
}
