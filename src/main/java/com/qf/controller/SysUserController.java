package com.qf.controller;


import com.qf.entity.Address;

import com.qf.entity.User;
import com.qf.service.SysUserService;
import com.qf.utils.R;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@CrossOrigin("*")
@RestController
public class SysUserController {

    @Resource
    private SysUserService sysUserService;


    //个人中心 @RequestBody int userId
    @RequestMapping("/user/userMessage")
    public User usermessage(int userid) { //int userId

        return  sysUserService.message(userid);
    }

    //查询登录名是否存在
    @RequestMapping("/user/findUsername")
    public R findusername(String username) { //String userName

        //String userName = "333";
        return sysUserService.findUsername(username);
    }

    //更改个人信息
    //更改登录名
    @RequestMapping("/user/updateUser")
    public R updateuser(@RequestBody User user) { //User user

        if(user.getUsername()!=null&&user.getUserpassword()!=null){
            String username = user.getUsername();
            String pwd = user.getUserpassword();
            Md5Hash md5Hash = new Md5Hash(pwd,user.getUsername(),1024);
            pwd = md5Hash.toString();
            user.setUserpassword(pwd);
        }

        return   sysUserService.updateuser(user);
    }

    //收货地址列表
    @RequestMapping("/user/getAddress")
    public R addlist(int userid) {//int userid

        return sysUserService.findAll(userid);
    }

    //删除收货地址
    @RequestMapping("/user/delAddress")
    public R deladdress(int addressid) {//int addressId
       // int addressId = 7;
        return sysUserService.deladdress(addressid);
    }

    //添加收货地址
    @RequestMapping("/user/addAddress")
    public R addaddr(@RequestBody Address address) {//@RequestBody Address address


        return sysUserService.addaddr(address);
    }


    //修改收货地址
    @RequestMapping("/user/updateaddr")
    public R updateaddr(@RequestBody Address address) {//@RequestBody Address address

        return sysUserService.updateaddr(address);
    }

    //设置为默认收货地址
    @RequestMapping("/user/updateisDefauif")
    public R updateisDefauif(@RequestBody Address address) {//@RequestBody Address address

        return sysUserService.defultaddr(address);

    }

    //城市级联
    //省份列表
    @RequestMapping("/user/addrprovince")
    public R addrprovince() {
        int parenid = 0;
        return sysUserService.addrprovince(parenid);
    }

    //城市列表
    @RequestMapping("/user/addrcity")
    public R addrcity(int parenid) {//int parenId
       // int parenId = 110100;
        return sysUserService.addrcity(parenid);
    }

    //区级列表
    @RequestMapping("/user/addrcounty")
    public R addrcounty(int parenid) {
        //int parenId = 0;
        return sysUserService.addrcounty(parenid);
    }

    @RequestMapping("/user/out")
    public R outcount(HttpSession session){

        session.invalidate();

        return R.ok("已退出登陆");

    }



}
