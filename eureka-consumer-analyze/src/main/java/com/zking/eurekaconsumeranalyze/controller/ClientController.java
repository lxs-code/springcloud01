package com.zking.eurekaconsumeranalyze.controller;

import com.zking.eurekaconsumeranalyze.server.ClientFeigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClientFeigin clientFeigin;

    @RequestMapping("selectAll")
    public String selectAll() {
        String data= clientFeigin.selectAll();
        return data;
    }

    @RequestMapping("selectDate")
    public String selectDate() {
        String data = clientFeigin.selectDate();
        return data;
    }

    @RequestMapping("selectDate1")
    public String selectDate1() {
        String data = clientFeigin.selectDate1();
        return data;
    }
}
