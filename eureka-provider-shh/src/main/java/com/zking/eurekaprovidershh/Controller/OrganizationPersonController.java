package com.zking.eurekaprovidershh.Controller;

import com.zking.eurekaprovidershh.model.OrganizationPerson;
import com.zking.eurekaprovidershh.server.OrganizationPersonServer;
import com.zking.eurekaprovidershh.uitl.JsonData;
import com.zking.eurekaprovidershh.uitl.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Organiz")
public class OrganizationPersonController {
    @Autowired
    private OrganizationPersonServer organizationPersonServer;
//    @Autowired
//    private OrganizationPerson organizationPerson;
    @RequestMapping("/list")
    public JsonData getall(PageBean pageBean, OrganizationPerson organizationPerson){
        JsonData jsonData = new JsonData();
        List<OrganizationPerson> list = organizationPersonServer.list(pageBean,organizationPerson);

        for (int i =0;i<list.size();i++){
            if(list.get(i).getorptype()==1){
                list.get(i).setOrptypes("工作中");
            }else{
                list.get(i).setOrptypes("以撤职");
            }
        }
        System.out.println(pageBean.getPage()+","+pageBean.getRows()+","+organizationPerson.getOrpName());
        jsonData.setResult(list);
        jsonData.setCode(1);
        jsonData.setPage(pageBean.getPage());
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        return jsonData;
    }


    @RequestMapping("/getall")
    public JsonData getpen(PageBean pageBean,OrganizationPerson organizationPerson){
        JsonData jsonData = new JsonData();
        //System.out.println(pageBean.getPage()+","+pageBean.getRows()+","+organizationPerson.getOrpName());
        if(null==organizationPerson.getOrpName()){
            organizationPerson.setOrpName("");
        }
        List<OrganizationPerson> list = organizationPersonServer.list2(pageBean,organizationPerson);
        for (int i =0;i<list.size();i++){
            if(list.get(i).getorptype()==1){
                list.get(i).setOrptypes("工作中");
            }else{
                list.get(i).setOrptypes("以撤职");
            }
        }
        jsonData.setResult(list);
        jsonData.setCode(1);
        jsonData.setPage(pageBean.getPage());
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        return jsonData;
    }

    @RequestMapping("/get")
    public JsonData get(PageBean pageBean,OrganizationPerson organizationPerson){
        JsonData jsonData = new JsonData();
        List<OrganizationPerson> list = organizationPersonServer.list1(pageBean,organizationPerson);
        for (int i =0;i<list.size();i++){
            if(list.get(i).getorptype()==1){
                list.get(i).setOrptypes("工作中");
            }else{
                list.get(i).setOrptypes("以撤职");
            }
        }
        System.out.println();
        jsonData.setResult(list);
        jsonData.setCode(1);
        jsonData.setPage(pageBean.getPage());
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        return jsonData;
    }


    @RequestMapping("/update")
    public JsonData update(OrganizationPerson organizationPerson){
        JsonData jsonData = new JsonData();
        int n = organizationPersonServer.updateByPrimaryKeySelective(organizationPerson);
        System.out.println(n);
        if(n!=0){
            jsonData.setCode(1);
            jsonData.setMessage("以撤职");
        }else{
            jsonData.setCode(0);
            jsonData.setMessage("无法撤职");
        }
        return jsonData;
    }

    @RequestMapping("/updateper")
    public JsonData update1(OrganizationPerson organizationPerson){
        JsonData jsonData = new JsonData();
        int n = organizationPersonServer.update(organizationPerson);
        System.out.println(n);
        if(n==1){
            jsonData.setCode(1);
            jsonData.setMessage("以复职");
        }else{
            jsonData.setCode(0);
            jsonData.setMessage("复职失败");
        }
        return jsonData;
    }


    @RequestMapping("/insert")
    public JsonData insert(OrganizationPerson organizationPerson){
        JsonData jsonData = new JsonData();
        System.out.println(organizationPerson.getOrpOrgid()+","+organizationPerson.getorptype()+","+organizationPerson.getOrpName());
        int n = organizationPersonServer.insert(organizationPerson);
        System.out.println(n);
        if(n!=0){
            jsonData.setCode(1);
            jsonData.setMessage("增加成功");
        }else{
            jsonData.setCode(0);
            jsonData.setMessage("增加失败");
        }
        return jsonData;
    }


}
