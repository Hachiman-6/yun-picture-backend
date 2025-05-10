package com.djx.yunpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.djx.yunpicturebackend.model.dto.user.UserQueryRequest;
import com.djx.yunpicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.djx.yunpicturebackend.model.vo.LoginUserVO;
import com.djx.yunpicturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 86139
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-05-04 19:43:26
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册函数
     *
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkPassword 密码确认
     * @return 返回id
     */
    Long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @return 返回视图封装类
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     * @param request 请求
     * @return 返回当前登录用户
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     * @param request 请求
     * @return 返回用户信息
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取加密密码
     * @param userPassword 用户密码
     * @return 加密后的密码
     */
    String getEncryptPassword(String userPassword);

    /**
     * 获取脱敏登录用户视图
     * @param user 用户
     * @return 返回脱敏登录用户视图
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取脱敏用户视图
     * @param user 用户
     * @return 返回脱敏用户视图
     */
    UserVO getUserVO(User user);

    /**
     * 获取脱敏用户列表视图
     * @param userList 用户列表
     * @return 返回脱敏用户列表视图
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 获取查询条件
     * @param userQueryRequest 用户查询请求
     * @return 返回查询条件
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 判断是否为管理员
     * @param user 用户
     * @return 返回是否为管理员
     */
    boolean isAdmin(User user);
}
