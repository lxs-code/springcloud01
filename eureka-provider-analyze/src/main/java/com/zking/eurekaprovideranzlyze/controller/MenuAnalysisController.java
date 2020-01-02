package com.zking.eurekaprovideranzlyze.controller;

import com.zking.eurekaprovideranzlyze.server.MenuAnalysisServer;
import com.zking.eurekaprovideranzlyze.vo.MenuAnalysisVo;
import com.zking.vo.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("menuAnalysis")
public class MenuAnalysisController {
    @Autowired
    private MenuAnalysisServer menuAnalysisServer;

    @RequestMapping("add")
    public JsonData selectState(MenuAnalysisVo menuAnalysis, HttpServletRequest request) {
        JsonData jsonData = new JsonData();
        menuAnalysis.setCid(Integer.parseInt(request.getParameter("id")));
        menuAnalysis.setPermissionName(request.getParameter("name"));
        System.out.println(menuAnalysis.getCid() + "//" + menuAnalysis.getPermissionName());
        if (menuAnalysis.getCid() != null && menuAnalysis.getPermissionName() != null && !menuAnalysis.getPermissionName().equals("")) {
            menuAnalysisServer.insert(menuAnalysis);
            jsonData.setCode(0);
        } else {
            jsonData.setCode(-1);
        }
        return jsonData;

    }

    @RequestMapping("date")
    public JsonData selectdate() {
        JsonData jsonData = new JsonData();
        List<MenuAnalysisVo> list = menuAnalysisServer.selectdate();
        jsonData.setResult(list);
        jsonData.setCode(0);
        return jsonData;
    }

    @RequestMapping("all")
    public JsonData selectAll() {
        JsonData jsonData = new JsonData();
        List<MenuAnalysisVo> list = menuAnalysisServer.selectAll();
        jsonData.setResult(list);
        jsonData.setCode(0);
        return jsonData;
    }
}
