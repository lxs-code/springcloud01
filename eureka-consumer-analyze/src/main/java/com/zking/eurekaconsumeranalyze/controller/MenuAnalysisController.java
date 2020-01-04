package com.zking.eurekaconsumeranalyze.controller;

import com.zking.eurekaconsumeranalyze.server.MenuAnalysisFeigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("menuAnalysis")
public class MenuAnalysisController {
    @Autowired
    private MenuAnalysisFeigin menuAnalysisFeigin;

    @RequestMapping("add")
    public String selectState( HttpServletRequest request) {
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String data = menuAnalysisFeigin.insert(id,name);
        return data;
    }

    @RequestMapping("date")
    public String selectdate() {
        String data = menuAnalysisFeigin.selectdate();
        return data;
    }

    @RequestMapping("all")
    public String selectAll() {
        String data = menuAnalysisFeigin.selectAll();
        return data;
    }
}
