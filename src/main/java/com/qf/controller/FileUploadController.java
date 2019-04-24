package com.qf.controller;


import com.qf.utils.FastDFSClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


@Controller
public class FileUploadController {

    @RequestMapping("/fileupload.json")
    @ResponseBody
    public Map<String,Object> fileUpload(MultipartFile file){
        Map<String,Object> map = new HashMap<String, Object>();
        try{
            byte[] b = file.getBytes();
            String filename = file.getOriginalFilename();//图片的名字
            //xxxx.jpg
            String suffix = filename.substring(filename.lastIndexOf(".")+1);

            FastDFSClient client = new FastDFSClient("clent.conf");
            /**
             * 参数一：图片内容
             * 参数二：后缀
             */
            String paths[] = client.uploadFile(b,suffix);
            StringBuffer sb = new StringBuffer();
            sb.append(paths[0]+File.separator+paths[1]);
            //group1
            //M00/00/00xxx.jpg
            System.out.println("上传成功："+sb.toString());
            map.put("result","success");
            map.put("imgurl",sb.toString());
        }catch(Exception e){
            e.printStackTrace();
            map.put("result","fail");
        }


        return  map;

    }


}
