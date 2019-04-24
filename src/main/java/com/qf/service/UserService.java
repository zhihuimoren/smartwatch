package com.qf.service;



import com.qf.DTD.UserDto;
import com.qf.entity.Registcode;
import com.qf.entity.User;

import com.qf.utils.R;

import javax.servlet.http.HttpSession;

public interface UserService {
    User findByUserLongUserPhone(String userPhone);
    R regidter(String password, String code, String userPhone, int pwdSafety);
    R login(User user, HttpSession session);
    R loginPhone(String userPhone, String code, HttpSession session);
    R findByPhone(String phone);

    void addCode(String userPhone, String code)throws Exception;
    Registcode getcodeByPhone(String phone);
   // R deletecode(String phone);
    R captcha(UserDto userLogin);
    R code(String userPhone, String code);
    R password(User user);

}
