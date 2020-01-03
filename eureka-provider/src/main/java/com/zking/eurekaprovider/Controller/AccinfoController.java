package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.model.Accinfo;
import com.zking.eurekaprovider.server.AccinfoServer;
import com.zking.eurekaprovider.uitl.JsonData;
import com.zking.eurekaprovider.uitl.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Accinfo")
public class AccinfoController {
JsonData jsonData=new JsonData();
    @Autowired
    private AccinfoServer accinfoServer;
    @RequestMapping("/list")
//    @ResponseBody
    public JsonData list(Accinfo accinfo, PageBean pageBean){
//        System.out.println(pageBean.getPage()+","+pageBean.getRows()+","+accinfo.gettAccid());
//        List<Accinfo> list = accinfoServer.list(accinfo,pageBean);

        if(null==accinfo.gettAccname()||accinfo.gettAccname()==""){
            accinfo.settAccname("");
        }
        List<Accinfo> list = accinfoServer.list(accinfo,pageBean);
        for (Accinfo user1:list){
            System.out.println(user1.gettAccname());
        }
        jsonData.setResult(list);
        jsonData.setCode(0);
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        jsonData.setMessage("成功");
        return jsonData;
    }
}
