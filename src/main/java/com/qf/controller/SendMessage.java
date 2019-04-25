package com.qf.controller;


import com.qf.utils.GetSMS;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class SendMessage {

    @RequestMapping(value = "/hello")
    public String index() {
        return "hello!";
    }

    @RequestMapping(value = "/sms/{to}")
    public String sendSMS(@PathVariable String to) {
        return GetSMS.getmMssage(to);
    }

}
