package com.djx.yunpicturebackend.service;

import com.djx.yunpicturebackend.model.dto.picture.PictureUploadRequest;
import com.djx.yunpicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.djx.yunpicturebackend.model.entity.User;
import com.djx.yunpicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

/**
* @author 86139
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-05-08 19:12:34
*/
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

}
