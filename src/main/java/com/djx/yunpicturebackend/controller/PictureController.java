package com.djx.yunpicturebackend.controller;

import com.djx.yunpicturebackend.annotation.AuthCheck;
import com.djx.yunpicturebackend.common.BaseResponse;
import com.djx.yunpicturebackend.common.ResultUtils;
import com.djx.yunpicturebackend.constant.UserConstant;
import com.djx.yunpicturebackend.model.dto.picture.PictureUploadRequest;
import com.djx.yunpicturebackend.model.entity.User;
import com.djx.yunpicturebackend.model.vo.PictureVO;
import com.djx.yunpicturebackend.service.PictureService;
import com.djx.yunpicturebackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
@RequestMapping("/picture")
public class PictureController {

    @Resource
    private UserService userService;

    @Resource
    private PictureService pictureService;

    /**
     * 上传图片
     * @param multipartFile 文件
     * @param pictureUploadRequest 图片请求参数
     * @param request 请求
     * @return 图片信息
     */
    @PostMapping("/upload")
    @AuthCheck(mustRole = UserConstant.ADMIN_ROLE)
    public BaseResponse<PictureVO> uploadPicture(@RequestPart MultipartFile multipartFile,
                                                 PictureUploadRequest pictureUploadRequest, HttpServletRequest request){
        User loginUser = userService.getLoginUser(request);
        PictureVO pictureVO = pictureService.uploadPicture(multipartFile, pictureUploadRequest, loginUser);
        return ResultUtils.success(pictureVO);
    }
}
