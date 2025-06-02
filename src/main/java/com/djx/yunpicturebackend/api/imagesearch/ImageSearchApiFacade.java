package com.djx.yunpicturebackend.api.imagesearch;

import com.djx.yunpicturebackend.api.imagesearch.model.ImageSearchResult;
import com.djx.yunpicturebackend.api.imagesearch.sub.GetImageFirstUrlApi;
import com.djx.yunpicturebackend.api.imagesearch.sub.GetImageListApi;
import com.djx.yunpicturebackend.api.imagesearch.sub.GetImagePageUrlApi;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ImageSearchApiFacade {

    /**
     * 以图搜图，获取相似图片url信息列表
     *
     * @param imageUrl 原始图片url
     * @return 相似图片url信息列表
     */
    public static List<ImageSearchResult> searchImage(String imageUrl) {
        String searchResultUrl = GetImagePageUrlApi.getImagePageUrl(imageUrl);
        String imageFirstUrl = GetImageFirstUrlApi.getImageFirstUrl(searchResultUrl);
        return GetImageListApi.getImageList(imageFirstUrl);
    }
}
