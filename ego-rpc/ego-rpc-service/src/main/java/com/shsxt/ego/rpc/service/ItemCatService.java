package com.shsxt.ego.rpc.service;

import com.shsxt.ego.rpc.dto.TreeDto;

import java.util.List;

public interface ItemCatService {

    public List<TreeDto> queryItemCatsByParentId(Long id);
}
