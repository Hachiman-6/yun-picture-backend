package com.djx.yunpicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求封装类
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -6755258725761110215L;
    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}
