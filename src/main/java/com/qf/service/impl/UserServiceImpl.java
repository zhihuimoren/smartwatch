package com.qf.service.Impl;


import com.qf.DTD.UserDto;
import com.qf.entity.Registcode;
import com.qf.entity.User;

import com.qf.entity.UserExample;
import com.qf.mapper.RegistcodeMapper;

import com.qf.mapper.UserMapper;
import com.qf.service.UserService;
import com.qf.utils.*;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private RegistcodeMapper registcodeMapper;
    private static final long FIVE_MINUTES = 1000*60*15*40;

    @Override
    public User findByUserLongUserPhone(String userPhone) {
       // UserLoginExample example =
        return null;
    }

    @Override
    public R regidter(String password, String code, String userPhone, int pwdSafety) {
//        UserLoginExample example = new UserLoginExample();
//        UserLoginExample.Criteria criteria = example.createCriteria();
//        criteria.andUserphoneEqualTo(userPhone);
//        List<UserLogin> list = userLoginMapper.selectByExample(example);
        List<User> list = userMapper.getUserLongByPhone(userPhone);
        List<String> list1 = userMapper.UserLongByPhone(userPhone);


        System.out.println(code);
        if (!AccountUtil.isMobile(userPhone)){
            return R.error("请输入正确的手机号");
        }
        if (StringUtils.isEmpty(code)){
            return R.error("请输入验证码");
        }

        if (list1!=null && list1.size()>0){
            return R.error("账号已被注册请登录");
        }
        Registcode regisCode = registcodeMapper.getcodeByPhone(userPhone);
        //System.out.println(regisCode);
        Date now= new Date();
        System.out.println(regisCode.getCodemsg());
//        if (regisCode==null || !code.equals(regisCode.getCodemsg())){
//            return R.error("验证码无效");
//        }
        if (regisCode==null && !regisCode.getCodemsg().equals(code)) {
            //System.out.println(regisCode.getCodemsg());
            System.out.println(!code.equals(regisCode.getCodemsg()));

            return R.error("验证码无效");
        }
        registcodeMapper.deletecode(regisCode.getUserphone());
        if (now.getTime()-regisCode.getDate().getTime()>FIVE_MINUTES){
            return R.error("验证码已过期");
        }
       //
        User user= new User();
        user.setUserphone(userPhone);
        String pwd = Md5Util.toMd5(password,userPhone);
        user.setUserpassword(pwd);
        user.setUsername(userPhone+ RandomStringUtils.randomAlphanumeric(6).toString());
        user.setUserstate(1);
        user.setPwdsafety(pwdSafety);
        int i = userMapper.insert(user);

        return i>0? R.ok(): R.error();
    }

    @Override
    public R login(User user, HttpSession session) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria= example.createCriteria();
        criteria.andUserphoneEqualTo(user.getUserphone());
        List<User> list = userMapper.selectByExample(example);

        if (list==null||list.size()==0){
            return R.error("账号不存在请注册");
        }

         user = list.get(0);


        String pwd = Md5Util.toMd5(user.getUserpassword(),user.getUserphone());
        user.setUserpassword(pwd);
        System.out.println(pwd);
        System.out.println(user.getUserpassword());
        System.out.println(user.getUserpassword());
        if (!user.getUserpassword().equals(pwd)){
            return R.error("密码错误");
        }
        if (user.getUserstate()==0){
            return R.error("账户被冻结");
        }
        session.setAttribute("user",user);
        return R.ok().put("user",user);
    }

    @Override
    public R loginPhone(String userPhone, String code, HttpSession session) {
//        UserLoginExample example = new UserLoginExample();
//        UserLoginExample.Criteria criteria = example.createCriteria();
//        criteria.andUserphoneEqualTo(userPhone);
//        List list = userLoginMapper.selectByExample(example);
        List<User> list = userMapper.getUserLongByPhone(userPhone);
        User user =  list.get(0);

        if (!AccountUtil.isMobile(userPhone)){
            return R.error("请输入正确的手机号");
        }

        if (list==null||list.size()==0){
            return R.error("账号不存在请注册");
        }

        if (StringUtils.isEmpty(code)){
            return R.error("请输入验证码");
        }

        Registcode regisCode = registcodeMapper.getcodeByPhone(userPhone);
        Date now= new Date();
        if (regisCode==null||!code.equals(regisCode.getCodemsg())){
            return R.error("验证码无效");
        }
        registcodeMapper.deletecode(regisCode.getUserphone());
        System.out.println(now.getTime()-regisCode.getDate().getTime());
        if (now.getTime()-regisCode.getDate().getTime()>FIVE_MINUTES){

            return R.error("验证码已过期");

        }

        session.setAttribute("user",user);
        return R.ok();
    }

    @Override
    public R findByPhone(String phone) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserphoneEqualTo(phone);
        List list = userMapper.selectByExample(example);
        if (list==null||list.size()==0){
            return R.error("账号不存在请注册");
        }
        return R.ok();
    }

    @Override
    public void addCode(String userPhone,String code) throws Exception{
       registcodeMapper.deletecode(userPhone);//删除原来的验证码
        Registcode regisCode=new Registcode();
        regisCode.setCodemsg(code);
        regisCode.setUserphone(userPhone);
        registcodeMapper.addCode(regisCode);
        GetSMS.getmMssage(userPhone);
//        Map<String, Object> map = (HashMap) JsonUtil.getObj(GetSMS.getmMssage(phone), HashMap.class);
//        if ((int) map.get("error_code") != 0) {
//            throw new Exception((String) map.get("reason"));
//        }


    }

    @Override
    public Registcode getcodeByPhone(String phone) {
        return null;
    }

    @Override
    public R captcha(UserDto userLogin) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserphoneEqualTo(userLogin.getUserphone());
        List list = userMapper.selectByExample(example);
        if (list==null||list.size()==0){
            return R.error("账号不存在请注册");
        }
        return R.ok().put("user",list);
    }

    @Override
    public R code(String userPhone, String code) {
        if (StringUtils.isEmpty(code)){
            return R.error("请输入验证码");
        }
        Registcode regisCode = registcodeMapper.getcodeByPhone(userPhone);
        Date now= new Date();
        if (regisCode==null||!code.equals(regisCode.getCodemsg())){
            return R.error("验证码无效");
        }
        registcodeMapper.deletecode(regisCode.getUserphone());
        if (now.getTime()-regisCode.getDate().getTime()>FIVE_MINUTES){
            return R.error("验证码已过期");
        }

        return R.ok();
    }

    @Override
    public R password(User user) {


        String pwd = Md5Util.toMd5(user.getUserpassword(),user.getUserphone());
        user.setUserpassword(pwd);
       int i = userMapper.updateUserLongPassword(user);
       return i>0? R.ok(): R.error();
    }
}
