package com.zking.eurekaconsumeranalyze.controller;

import com.zking.eurekaconsumeranalyze.server.AttentionFeigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("attention")
public class AttentionController {
    @Autowired
    private AttentionFeigin attentionFeigin;

    @RequestMapping("selectState")
    public String selectState() {
        String data = attentionFeigin.selectState();
        return data;
    }

    @RequestMapping("selectDate")
    public String selectDate() {
        String data = attentionFeigin.selectDate();
        return data;
    }

    @RequestMapping("selectDate1")
    public String selectDate1() {
        String data = attentionFeigin.selectDate1();
        return data;
    }

}
