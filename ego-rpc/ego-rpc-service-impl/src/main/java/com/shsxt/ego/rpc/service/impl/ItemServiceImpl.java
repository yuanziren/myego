package com.shsxt.ego.rpc.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.ego.common.model.PageResult;
import com.shsxt.ego.rpc.mapper.db.dao.TbItemMapper;
import com.shsxt.ego.rpc.pojo.TbItem;
import com.shsxt.ego.rpc.query.ItemQuery;
import com.shsxt.ego.rpc.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements IItemService {
    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public PageResult<TbItem> queryItemsListByParams(ItemQuery itemQuery) {
        // 启动分页
        PageHelper.startPage(itemQuery.getPage(), itemQuery.getRows());
        List<TbItem> itemList= itemMapper.queryItemsByParams(itemQuery);
        PageInfo<TbItem> pageInfo =new PageInfo<>(itemList);
        PageResult<TbItem> pageResult =new PageResult<>();
        pageResult.setTotal(pageInfo.getTotal());
        pageResult.setRows(pageInfo.getList());
        return pageResult;
    }
}
