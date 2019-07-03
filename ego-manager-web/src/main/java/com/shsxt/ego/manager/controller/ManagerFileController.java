package com.shsxt.ego.manager.controller;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import com.shsxt.ego.common.model.PictureResult;
import com.shsxt.ego.manager.service.IManagerItemFileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class ManagerFileController {

    @Resource
    private IManagerItemFileService iManagerItemFileService;

    @RequestMapping("pic/upload")
    @ResponseBody
    public PictureResult uploadFile(HttpServletRequest request) {
        PictureResult result = null;
        result = new PictureResult();
        MultipartHttpServletRequest mhsr = (MultipartHttpServletRequest) request;
        MultipartFile mf = mhsr.getFile("uploadFile");
        return iManagerItemFileService.uploadFile(mf);
    }
}
