package com.djx.yunpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.djx.yunpicturebackend.model.dto.space.SpaceAddRequest;
import com.djx.yunpicturebackend.model.dto.space.SpaceQueryRequest;
import com.djx.yunpicturebackend.model.entity.Space;
import com.djx.yunpicturebackend.model.entity.User;
import com.djx.yunpicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 86139
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-05-20 17:25:33
*/
public interface SpaceService extends IService<Space> {

    /**
     * 创建空间
     *
     * @param spaceAddRequest 空间添加请求
     * @param loginUser       登录用户
     * @return 空间id
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param spaceQueryRequest 空间查询条件
     * @return 查询条件
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 获取空间封装类
     *
     * @param space 空间
     * @param request 请求
     * @return 空间封装类
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 分页获取空间封装
     *
     * @param spacePage 空间分页
     * @param request     请求
     * @return 空间分页
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 空间校验
     *
     * @param space 空间
     * @param add   是否添加
     */
    void validSpace(Space space, boolean add);

    /**
     * 根据空间级别填充空间对象
     * @param space 空间对象
     */
    void fillSpaceBySpaceLevel(Space space);
}
