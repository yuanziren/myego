package com.shsxt.ego.rpc.service;

import com.shsxt.ego.rpc.query.ItemQuery;
import com.shsxt.ego.common.model.PageResult;
import com.shsxt.ego.rpc.pojo.TbItem;

public interface IItemService {

    public PageResult<TbItem> queryItemsListByParams(ItemQuery itemQuery);
}
