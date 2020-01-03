package com.zking.eurekaprovider.Controller;



import com.zking.eurekaprovider.model.Accinfo;
import com.zking.eurekaprovider.model.Commodity;
import com.zking.eurekaprovider.server.AccinfoServer;
import com.zking.eurekaprovider.server.CommodityServer;
import com.zking.eurekaprovider.uitl.JsonData;
import com.zking.eurekaprovider.uitl.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

    @RestController
    @RequestMapping("/Commodity")
    //模糊查询分页

public class CommodityController {
    JsonData jsonData=new JsonData();
        @Autowired
        private CommodityServer commodityServer;
        @RequestMapping("/list")
        @ResponseBody
        public JsonData list( PageBean pageBean){
        System.out.println(pageBean.getPage()+","+pageBean.getRows());
        List<Commodity> list = commodityServer.list(pageBean);

//            if(null==commodity.gettComname()||commodity.gettComname()==""){
//                commodity.settComname("");
//            }
//
//            System.out.println(commodity.gettComname());
//            List<Commodity> list = commodityServer.list(commodity.gettComname(),pageBean);
//            for (Commodity com:list){
//                System.out.println(com.gettComname());
//            }
            jsonData.setResult(list);
            jsonData.setCode(0);
            jsonData.setTotal(pageBean.getTotal());
            jsonData.setRows(pageBean.getRows());
            jsonData.setPage(pageBean.getPage());
            jsonData.setMessage("成功");
            return jsonData;
    }


        @InitBinder
        public void init(WebDataBinder binder) {
            binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
        }
    @RequestMapping("/add")
    public JsonData add(Commodity commodity){


//        System.out.println(commodityServer.get()+","+organizationPerson.getorptype()+","+organizationPerson.getOrpName());
        int n = commodityServer.add(commodity);

        if(n!=0){
            jsonData.setCode(1);
            jsonData.setMessage("增加成功");
        }else{
            jsonData.setCode(0);
            jsonData.setMessage("增加失败");
        }
        return jsonData;
    }

    @RequestMapping("/delete")
    public JsonData delete(Integer tComid){


        int n =commodityServer.del(tComid);
        if(n==1){
            jsonData.setCode(1);
            jsonData.setMessage("删除成功");
        }else{
            jsonData.setCode(0);
            jsonData.setMessage("删除失败");
        }
        return jsonData;
    }

    @RequestMapping("/update")
    public JsonData update(Commodity commodity){

        commodity.settComname(commodity.gettComname());
        commodity.settComprice(commodity.gettComprice());
        commodity.settComremark(commodity.gettComremark());


        commodity.settAmount(commodity.gettAmount());

        int n =commodityServer.up(commodity);

        if(n!=0){
            jsonData.setCode(1);
            jsonData.setMessage("修改成功");
        }else {
            jsonData.setCode(0);
            jsonData.setMessage("修改失败");
        }
//        jsonData.setResult(n);

        return jsonData;
    }
        @RequestMapping("/updates")
        public JsonData updates(Commodity commodity){
            System.out.println(123);
            System.out.println(commodity);
            commodity.settComname(commodity.gettComname());
            commodity.settComprice(commodity.gettComprice());
            commodity.settComremark(commodity.gettComremark());
            commodity.settAmount(commodity.gettAmount());

            int n =commodityServer.up(commodity);
            if(n==1){
                jsonData.setCode(1);
                jsonData.setMessage("修改成功");
            }else {
                jsonData.setCode(0);
                jsonData.setMessage("修改失败");
            }
            return jsonData;
        }

}
