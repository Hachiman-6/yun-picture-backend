package com.djx.yunpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.djx.yunpicturebackend.model.dto.spaceuser.SpaceUserAddRequest;
import com.djx.yunpicturebackend.model.dto.spaceuser.SpaceUserQueryRequest;
import com.djx.yunpicturebackend.model.entity.SpaceUser;
import com.djx.yunpicturebackend.model.vo.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 86139
* @description 针对表【spaceUser_user(空间用户关联)】的数据库操作Service
* @createDate 2025-06-07 14:36:47
*/
public interface SpaceUserService extends IService<SpaceUser> {

    /**
     * 创建空间成员
     *
     * @param spaceUserAddRequest 空间成员添加请求
     * @return 空间成员id
     */
    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);

    /**
     * 获取查询条件
     *
     * @param spaceUserQueryRequest 空间成员查询条件
     * @return 查询条件
     */
    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);

    /**
     * 获取空间成员封装类
     *
     * @param spaceUser   空间成员
     * @param request 请求
     * @return 空间成员封装类
     */
    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    /**
     * 分页获取空间成员封装
     *
     * @param spaceUserList 空间成员列表
     * @return 空间成员分页
     */
    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);

    /**
     * 空间成员校验
     *
     * @param spaceUser 空间成员
     * @param add   是否添加
     */
    void validSpaceUser(SpaceUser spaceUser, boolean add);
}
