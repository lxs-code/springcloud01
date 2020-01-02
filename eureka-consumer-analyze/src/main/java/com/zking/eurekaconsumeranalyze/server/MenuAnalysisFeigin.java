package com.zking.eurekaconsumeranalyze.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@FeignClient("eureka-provider-analyze")
public interface MenuAnalysisFeigin {

    @RequestMapping("/menuAnalysis/add")
    String insert(@RequestParam("id")int id,@RequestParam("name")String name);

    @RequestMapping("/menuAnalysis/date")
    String selectdate();

    @RequestMapping("/menuAnalysis/all")
    String selectAll();
}
