package com.shsxt.ego.manager.service;

import com.shsxt.ego.common.model.PageResult;
import com.shsxt.ego.rpc.pojo.TbItem;
import com.shsxt.ego.rpc.query.ItemQuery;

public interface IManagerItemService {
    public PageResult<TbItem> itemList(ItemQuery itemQuery);
}
