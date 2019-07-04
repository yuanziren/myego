package com.shsxt.ego.rpc.service.impl;

import com.shsxt.ego.rpc.mapper.db.dao.TbUserMapper;
import com.shsxt.ego.rpc.pojo.TbUser;
import com.shsxt.ego.rpc.service.IIUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IIUserService {

    @Autowired
    private TbUserMapper userMapper;
    @Override
    public TbUser queryUserByUserId(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
