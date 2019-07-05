package com.shsxt.ego.manager.controller;

import com.shsxt.ego.common.model.PageResult;
import com.shsxt.ego.manager.service.IManagerContentService;
import com.shsxt.ego.rpc.pojo.TbContent;
import com.shsxt.ego.rpc.query.ContentQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ManagerContentController {

    @Autowired
    private IManagerContentService iManagerContentService;

    @RequestMapping("/content/query/list")
    @ResponseBody
    public PageResult<TbContent> queryContentsByParams(ContentQuery contentQuery){
        return iManagerContentService.queryContentsByParams(contentQuery);
    }
}
