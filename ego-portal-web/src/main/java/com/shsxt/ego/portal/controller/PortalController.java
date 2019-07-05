package com.shsxt.ego.portal.controller;

import com.shsxt.ego.common.util.JsonUtils;
import com.shsxt.ego.portal.service.IPortalItemCatService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class PortalController {

    @Resource
    private IPortalItemCatService iPortalItemCatService;

    @RequestMapping(value = "/item/cat",produces= MediaType.TEXT_HTML_VALUE+";charset=UTF-8")
    @ResponseBody
    public String getAllCats(){
        Map<String,Object> map=iPortalItemCatService.getAllItemCats();
        return  JsonUtils.objectToJson(map);
    }



}
