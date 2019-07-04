package com.shsxt.ego.rpc.service;

import com.shsxt.ego.rpc.pojo.TbUser;

public interface IIUserService {
    public TbUser   queryUserByUserId(Long userId);
}
