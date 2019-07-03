package com.shsxt.ego.rpc.service.impl;

import com.shsxt.ego.rpc.dto.TreeDto;
import com.shsxt.ego.rpc.mapper.db.dao.TbItemCatMapper;
import com.shsxt.ego.rpc.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<TreeDto> queryItemCatsByParentId(Long id) {
        return itemCatMapper.queryItemCatsByParentId(id);
    }
}
