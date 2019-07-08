package com.shsxt.ego.rpc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.ego.common.model.BigPicture;
import com.shsxt.ego.common.model.PageResult;
import com.shsxt.ego.rpc.mapper.db.dao.TbContentMapper;
import com.shsxt.ego.rpc.pojo.TbContent;
import com.shsxt.ego.rpc.query.ContentQuery;
import com.shsxt.ego.rpc.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentServiceImpl implements IContentService {
    @Autowired
    private TbContentMapper contentMapper;
    @Override
    public PageResult<TbContent> queryContentsByParams(ContentQuery contentQuery) {
        PageHelper.startPage(contentQuery.getPage(), contentQuery.getRows());
        List<TbContent> itemList= contentMapper.queryContentsByParams(contentQuery);
        PageInfo<TbContent> pageInfo =new PageInfo<>(itemList);
        PageResult<TbContent> pageResult =new PageResult<>();
        pageResult.setTotal(pageInfo.getTotal());
        pageResult.setRows(pageInfo.getList());
        return pageResult;
    }

    @Override
    public List<BigPicture> queryContentsByCategoryId(Long cid) {
        List<BigPicture> pictures = null;
        List<TbContent> contents = contentMapper.queryContentsByCategoryId(cid);
        if (null != contents && contents.size() >0){
            pictures = new ArrayList<>();
            List<BigPicture> finalPictures = pictures;
            contents.forEach(c->{
                BigPicture bigPicture = new BigPicture();
                bigPicture.setAlt("egos商城");
                bigPicture.setHref(c.getUrl());
                bigPicture.setSrc(c.getPic());
                bigPicture.setSrcb(c.getPic2());
                finalPictures.add(bigPicture);
            });
        }
        return pictures;
    }
}
