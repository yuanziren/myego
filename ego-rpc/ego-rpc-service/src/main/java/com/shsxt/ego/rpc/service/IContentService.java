package com.shsxt.ego.rpc.service;

import com.shsxt.ego.common.model.PageResult;
import com.shsxt.ego.rpc.pojo.TbContent;
import com.shsxt.ego.rpc.query.ContentQuery;

public interface IContentService {
    PageResult<TbContent> queryContentsByParams(ContentQuery contentQuery);
}
