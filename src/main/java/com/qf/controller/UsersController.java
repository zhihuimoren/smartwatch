package com.qf.controller;

import com.google.code.kaptcha.Producer;

import com.qf.DTD.UserDto;
import com.qf.entity.User;
import com.qf.service.UserService;
import com.qf.utils.AccountUtil;
import com.qf.utils.GetSMS;
import com.qf.utils.R;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
@CrossOrigin("*")
@RestController
public class UsersController {
    @Resource
    private UserService userService;
    @Resource
    private Producer producer;
    @RequestMapping("/register")
    public R register(String password, String code, String userPhone, int pwdSafety){
        return userService.regidter(password,code,userPhone,pwdSafety);
    }

    @RequestMapping("/sys/login")
    public R login(@RequestBody UserDto userLogin, HttpSession session){
        //服务端生成的验证码
        String code=session.getAttribute("code").toString();
       // System.out.println(code+"dfghsdgsdfgsdfgdsf");
        //用户输入的验证码
        String c = userLogin.getCaptcha();
        System.out.println(c);
        if (code!=null&&!code.equals(c)){
            System.out.println(!code.equals(c));
            return R.error("验证码错误");
        }

        return userService.login(userLogin,session);

    }

    @RequestMapping("/login/phone")
    public R longinPhone(String userPhone, String code, HttpSession session){

        return userService.loginPhone(userPhone,code,session);

    }
    @RequestMapping("/captcha.jpg")
    public void captcah(HttpServletResponse response, HttpSession session){
        try {
            String text= producer.createText();//生成的验证码
            System.out.println(text);

            session.setAttribute("code",text);
            BufferedImage bufferedImage = producer.createImage(text);
            OutputStream os = response.getOutputStream();
            //把生成的验证码展示到客户端
            ImageIO.write(bufferedImage,"jpg",os);
            System.out.println(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("/regist")
    public R code(String userPhone){

        //判断手机号是否被注册
        userService.findByPhone(userPhone);
        //判断手机号是否正确
        if (!AccountUtil.isMobile(userPhone)){
            return R.error("请输入手机号");
        }
        //判断是否发过验证码
        if (userService.getcodeByPhone(userPhone)!=null){
            return R.error("已发送");
        }

        String code= GetSMS.randNum;
        try {
            userService.addCode(userPhone,code);
           // R.ok().put("stats",true);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(e.getMessage());
        }
        return R.ok();

    }

    @RequestMapping("/retrieve/captcha")
    public R captcha(@RequestBody UserDto userLogin, HttpSession session){
        String code=session.getAttribute("code")+"";
        System.out.println(code);
        String c = userLogin.getCaptcha();
        if (code!=null&&!code.equalsIgnoreCase(c)){
            return R.error("验证码错误");
        }
        session.setAttribute("userphone",userLogin.getUserphone());
        return userService.captcha(userLogin);

    }

    @RequestMapping("/retrieve/code")
    public R code(String userPhone, String code){
        return userService.code(userPhone,code);
    }

    @RequestMapping("/retrieve/password")
    public R password(@RequestBody User user){
       return userService.password(user);
    }



}
