package com.djx.yunpicturebackend.service;

import com.djx.yunpicturebackend.model.dto.space.analyze.*;
import com.djx.yunpicturebackend.model.entity.Space;
import com.djx.yunpicturebackend.model.entity.User;
import com.djx.yunpicturebackend.model.vo.space.analyze.*;

import java.util.List;

public interface SpaceAnalyzeService {

    /**
     * 获取空间使用情况分析
     *
     * @param spaceUsageAnalyzeRequest 请求参数
     * @param loginUser                登录用户
     * @return 空间使用情况
     */
    SpaceUsageAnalyzeResponse getSpaceUsageAnalyze(SpaceUsageAnalyzeRequest spaceUsageAnalyzeRequest, User loginUser);

    /**
     * 获取空间图片分类分析
     *
     * @param spaceCategoryAnalyzeRequest 获取空间图片分类分析请求参数
     * @param loginUser                   登录用户
     * @return 空间图片分类分析列表
     */
    List<SpaceCategoryAnalyzeResponse> getSpaceCategoryAnalyze(SpaceCategoryAnalyzeRequest spaceCategoryAnalyzeRequest, User loginUser);

    /**
     * 获取空间图片标签分析
     *
     * @param spaceTagAnalyzeRequest 获取空间图片标签分析请求参数
     * @param loginUser              登录用户
     * @return 空间图片标签分析列表
     */
    List<SpaceTagAnalyzeResponse> getSpaceTagAnalyze(SpaceTagAnalyzeRequest spaceTagAnalyzeRequest, User loginUser);

    /**
     * 获取空间图片大小分析
     *
     * @param spaceSizeAnalyzeRequest 获取空间图片大小分析请求参数
     * @param loginUser               登录用户
     * @return 空间图片大小分析列表
     */
    List<SpaceSizeAnalyzeResponse> getSpaceSizeAnalyze(SpaceSizeAnalyzeRequest spaceSizeAnalyzeRequest, User loginUser);

    /**
     * 获取空间用户上传行为分析
     *
     * @param spaceUserAnalyzeRequest 获取空间用户上传行为分析请求参数
     * @param loginUser               登录用户
     * @return 空间用户上传行为分析列表
     */
    List<SpaceUserAnalyzeResponse> getSpaceUserAnalyze(SpaceUserAnalyzeRequest spaceUserAnalyzeRequest, User loginUser);

    /**
     * 获取空间使用排行分析（仅管理员）
     *
     * @param spaceRankAnalyzeRequest 获取空间使用排行分析请求参数
     * @param loginUser               登录用户
     * @return 空间使用排行分析列表
     */
    List<Space> getSpaceRankAnalyze(SpaceRankAnalyzeRequest spaceRankAnalyzeRequest, User loginUser);
}
