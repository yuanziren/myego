package com.shsxt.ego.rpc.service;

import com.shsxt.ego.rpc.pojo.TbItemDesc;

public interface ItemDescService {

    public TbItemDesc queryItemDescByItemId(Long itemId);
}
