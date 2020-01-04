package com.zking.eurekaprovider.Controller;

import cn.hutool.json.JSONArray;
import com.zking.eurekaprovider.model.Keywordcategory;
import com.zking.eurekaprovider.server.KeywordcategoryServer;
import com.zking.eurekaprovider.uitl.JsonData;
import com.zking.eurekaprovider.uitl.MyLog;
import com.zking.eurekaprovider.uitl.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class Keywordcategorycontroller {

@Autowired
    private KeywordcategoryServer keywordcategoryServer;

private JsonData jsonData;
@MyLog("获得关键字所有类别")
@RequestMapping("getKeywordcategorylisy")
public JsonData  getKeywordcategorylisy(Keywordcategory keywordcategory, PageBean pageBean){
jsonData=new JsonData();
    List<Keywordcategory> keywordcategories = keywordcategoryServer.KeywordcategoryList(keywordcategory, pageBean);


    jsonData.setPage(pageBean.getPage());
    jsonData.setCode(0);
    jsonData.setTotal(pageBean.getTotal());
    jsonData.setRows(pageBean.getRows());
    jsonData.setResult(keywordcategories);


    return jsonData;
};

//
//    public JsonData  intserKeywordcategory(String[] ad,Keywordcategory keywordcategory){
//    jsonData=new JsonData();
//List<>
//    for (String sa :ad
//         ) {
//        System.out.println("-----"+sa+"-----");
//    }
//        System.out.println(keywordcategory.getCreateid()+"q1321");
@MyLog("添加关键字类别")
    @RequestMapping("intserKeywordcategory")
    public JsonData  intserKeywordcategory(Keywordcategory keywordcategory){
        jsonData=new JsonData();
        int i = keywordcategoryServer.insetKeywordcategory(keywordcategory);
if(i>0){
    jsonData.setCode(0);
    jsonData.setMessage("添加成功");
}else{
    jsonData.setCode(-1);
    jsonData.setMessage("添加失败");
}
        return jsonData;
    };


    @MyLog("修改关键字类别")
    @RequestMapping("upKeywordcategory")
    public JsonData  upserKeywordcategory(Keywordcategory keywordcategory){
        jsonData=new JsonData();
        int i = keywordcategoryServer.upKeywordcategory(keywordcategory);
        if(i>0){
            jsonData.setCode(0);
            jsonData.setMessage("修改成功");
        }else{
            jsonData.setCode(-1);
            jsonData.setMessage("修改失败");
        }




        return jsonData;
    };
    @MyLog("删除关键字类别")
    @RequestMapping("delKeywordcategory")
    public JsonData  delKeywordcategory(Keywordcategory keywordcategory){
        jsonData=new JsonData();
        int i = keywordcategoryServer.delKeywordcategory(keywordcategory);
        if(i>0){
            jsonData.setCode(0);
            jsonData.setMessage("删除成功");
        }else{
            jsonData.setCode(-1);
            jsonData.setMessage("删除失败");
        }




        return jsonData;
    };

}
