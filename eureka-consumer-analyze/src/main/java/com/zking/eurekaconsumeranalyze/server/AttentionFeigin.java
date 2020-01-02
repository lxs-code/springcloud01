package com.zking.eurekaconsumeranalyze.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


@Service
@FeignClient("eureka-provider-analyze")
public interface  AttentionFeigin {

    @RequestMapping("/attention/selectState")
    String selectState();

    @RequestMapping("/attention/selectDate")
    String selectDate();

    @RequestMapping("/attention/selectDate1")
    String selectDate1();
}
