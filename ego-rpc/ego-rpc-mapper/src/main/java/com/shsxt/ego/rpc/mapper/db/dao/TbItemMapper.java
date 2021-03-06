package com.shsxt.ego.rpc.mapper.db.dao;

import com.shsxt.ego.rpc.pojo.TbItem;
import com.shsxt.ego.rpc.query.ItemQuery;

import java.util.List;
import java.util.Map;

public interface TbItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    TbItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);

    public  List<TbItem> queryItemsByParams(ItemQuery itemQuery);


    int updateItemStatusBatch(Map<String,Object> param);


    int deleteItemBatch(Map<String, Object> param);
}