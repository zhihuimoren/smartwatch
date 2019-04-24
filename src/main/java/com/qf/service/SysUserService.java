package com.qf.service;

import com.qf.entity.Address;
import com.qf.entity.User;
import com.qf.utils.R;

public interface SysUserService {

    public User message(int userid);

    public R findUsername(String username);

    public R updateuser(User user);

    public R findAll(int userId);

    public R deladdress(int addressid);

    public R defultaddr(Address address);

    public R addaddr(Address address);

    public R updateaddr(Address address);

    public R addrprovince(int parentId);

    public R addrcity(int parentId);

    public R addrcounty(int parentId);



}
