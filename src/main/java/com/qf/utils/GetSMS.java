package com.qf.utils;


import net.sf.json.JSONObject;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetSMS {

    public static final String ACCOUNT_SID = "3b99da9f0808484c8c72ed1fd7175281";//这里填写你在平台里的ACOUNT_SID

    /**
     * 密钥
     */
    public static final String AUTH_TOKEN = "84130951411247f48204db452fd34570";

    /**
     * 请求地址前半部分
     */
    public static final String BASE_URL = "https://api.miaodiyun.com/20150822/industrySMS/sendSMS";//请求地址是固定的不用改
    /**
     * 随机码
     */
    public static String randNum = RandUtil.getRandomNum();
    public static String smsContent = "【名表科技】尊敬的用户，您正在注册名表科技有限公司，您的验证码为{" + randNum + "}，如非本人，请忽略此短信";

    /**
     * 获取验证码
     *
     * @param to
     * @return
     */
    public static String getmMssage(String to) {
        String args = SendNumUtil.queryArgs(ACCOUNT_SID, AUTH_TOKEN, smsContent, to);
        OutputStreamWriter out = null;
        InputStream in = null;
        BufferedReader br = null;
        StringBuffer sb = new StringBuffer();
        try {
            URL url = new URL(BASE_URL);
            URLConnection connection = url.openConnection();//打开连接
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setConnectTimeout(5000);  //设置链接超时
            connection.setReadTimeout(10000);    //设置读取超时
            out = new OutputStreamWriter(connection.getOutputStream(), "utf-8");
            out.write(args);
            out.flush();
            //读取返回数据
            br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        JSONObject jsonObject = JSONObject.fromObject(sb.toString());

        Object object = jsonObject.get("respCode");
        System.out.println("状态码：" + object + "验证码：" + randNum);
        System.out.println(!object.equals("00000"));
        return jsonObject.toString();
//        if (!object.equals("00000")) {
//            return object.toString();
//        }else{
//            return "发送成功！";
//        }
    }


//  public static void main(String[] args) {
//     String result = getmMssage("18803093083");
//    System.out.println("验证码："+randNum+"\t"+result);
// }

}
