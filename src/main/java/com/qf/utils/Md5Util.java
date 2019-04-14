package com.qf.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

public class Md5Util {
    public static String toMd5(String pwd, String username) {
        Md5Hash md5Hash = new Md5Hash(pwd, username, 1024);
        return md5Hash.toString();
    }

}
