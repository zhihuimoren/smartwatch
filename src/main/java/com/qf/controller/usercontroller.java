package com.qf.controller;


import com.qf.entity.Address;
import com.qf.entity.User;
import com.qf.service.SysUserService;
import com.qf.utils.R;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class usercontroller {

    @Resource
    private SysUserService sysUserService;


    //个人中心 @RequestBody int userId
    @RequestMapping("/user/userMessage")
    public User usermessage(int userId) { //int userId

        return  sysUserService.message(userId);
    }

    //查询登录名是否存在
    @RequestMapping("/user/findUsername")
    public R findusername(String userName) { //String userName
       // String userName = "333";
        return sysUserService.findUsername(userName);
    }

    //更改个人信息
    //更改登录名
    @RequestMapping("/user/updateUser")
    public R updateuser(@RequestBody User user) { //User user

        return   sysUserService.updateuser(user);
    }

    //收货地址列表
    @RequestMapping("/user/getAddress")
    public R addlist(int userId) {//int userId

        return sysUserService.findAll(userId);
    }

    //删除收货地址
    @RequestMapping("/user/delAddress")
    public R deladdress(int addressId) {//int addressId
       // int addressId = 7;
        return sysUserService.deladdress(addressId);
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
        int parenId = 0;
        return sysUserService.addrprovince(parenId);
    }

    //城市列表
    @RequestMapping("/user/addrcity")
    public R addrcity(int parenId) {//int parenId
       // int parenId = 110100;
        return sysUserService.addrcity(parenId);
    }

    //区级列表
    @RequestMapping("/user/addrcounty")
    public R addrcounty(int parenId) {
        //int parenId = 0;
        return sysUserService.addrcounty(parenId);
    }



}
