package com.sustech.main_service.service;

import com.sustech.main_service.entity.User;

/**
* @author Lynchrocket
* @description 针对表【t_user(用户表)】的数据库操作Service
* @createDate 2023-04-08 23:26:57
*/
public interface UserService{

    User getByUsername(String username);

    User getByNickName(String nickName);

//    User getById(String id);

    boolean reviseInfo(String id, String username, String password, String nick_name, String email, String avatar, String background);
}
