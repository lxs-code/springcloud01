package com.zking.eurekaconsumeranalyze.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


@Service
@FeignClient("eureka-provider-analyze")
public interface ClientFeigin {

    //查询绑定数据
    @RequestMapping("/client/selectAll")
    String selectAll();

    //    查询绑定时间
    @RequestMapping("/client/selectDate")
    String selectDate();
}
