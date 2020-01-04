package com.zking.eurekaprovideranzlyze.controller;

import com.zking.eurekaprovideranzlyze.server.ClientServer;
import com.zking.eurekaprovideranzlyze.vo.ClientVo;
import com.zking.vo.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClientServer clientServer;

    @RequestMapping("selectAll")
    public JsonData selectAll() {
        JsonData jsonData = new JsonData();
        List<ClientVo> list = clientServer.selectAll();
        jsonData.setResult(list);
        jsonData.setCode(0);
        return jsonData;
    }

    @RequestMapping("selectDate")
    public JsonData selectDate() {
        JsonData jsonData = new JsonData();
        List<ClientVo> list = clientServer.selectDate();
        jsonData.setResult(list);
        jsonData.setCode(0);
        return jsonData;
    }

    @RequestMapping("selectDate1")
    public JsonData selectDate1() {
        JsonData jsonData = new JsonData();
        List<ClientVo> list = clientServer.selectDate1();
        jsonData.setResult(list);
        jsonData.setCode(0);
        return jsonData;
    }

}
