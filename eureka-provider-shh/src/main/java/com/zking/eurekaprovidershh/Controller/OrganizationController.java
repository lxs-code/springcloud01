package com.zking.eurekaprovidershh.Controller;

import com.zking.eurekaprovidershh.model.Organization;
import com.zking.eurekaprovidershh.server.OrganizationServer;
import com.zking.eurekaprovidershh.uitl.JsonData;
import com.zking.eurekaprovidershh.uitl.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Organ")
public class OrganizationController {
//    private JsonData jsonData;
    @Autowired
    private OrganizationServer organizationServer;
    @RequestMapping("/getall")
    public JsonData getall(PageBean pageBean,Organization organization){
        System.out.println("修改前的"+organization.getOrganame());
        if(null==organization.getOrganame()){
            organization.setOrganame("");
        }
        System.out.println("修改后的"+organization.getOrganame());
       // System.out.println("saddddddasdasdad"+pageBean.getPage()+","+pageBean.getRows()+","+pageBean.getTotal());
        JsonData jsonData = new JsonData();
        List<Organization> list = organizationServer.list(pageBean,organization);
        jsonData.setResult(list);
        jsonData.setCode(1);
        jsonData.setPage(pageBean.getPage());
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        return jsonData;
    }

    @RequestMapping("/getall1")
    public JsonData getall(){
        JsonData jsonData = new JsonData();
        List<Organization> list = organizationServer.getall();
        jsonData.setResult(list);
        jsonData.setCode(1);
        System.out.println("1111111111111111111111111111111"+"hehe"+list.size());
        return jsonData;
    }
    @RequestMapping("/upda")
    public JsonData upd(Organization organization){
        JsonData jsonData = new JsonData();
        int n = organizationServer.updateByPrimaryKeySelective(organization);
        if(n>0){
            jsonData.setCode(1);
            jsonData.setMessage("修改成功");
        }else{
            jsonData.setCode(0);
            jsonData.setMessage("修改失败");
        }
        return jsonData;
    }






}
