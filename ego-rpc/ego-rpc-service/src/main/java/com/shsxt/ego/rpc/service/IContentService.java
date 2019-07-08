package com.shsxt.ego.rpc.service;

import com.shsxt.ego.common.model.BigPicture;
import com.shsxt.ego.common.model.PageResult;
import com.shsxt.ego.rpc.pojo.TbContent;
import com.shsxt.ego.rpc.query.ContentQuery;

import java.util.List;

public interface IContentService {
    PageResult<TbContent> queryContentsByParams(ContentQuery contentQuery);

    List<BigPicture> queryContentsByCategoryId(Long cid);
}
