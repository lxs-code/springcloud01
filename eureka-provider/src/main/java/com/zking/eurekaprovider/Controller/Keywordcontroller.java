package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.mapper.AnsweringMapper;
import com.zking.eurekaprovider.model.Answering;
import com.zking.eurekaprovider.model.Keywordcategory;
import com.zking.eurekaprovider.model.keyword;
import com.zking.eurekaprovider.server.AnsweringServer;
import com.zking.eurekaprovider.server.KeywordServer;
import com.zking.eurekaprovider.uitl.JsonData;
import com.zking.eurekaprovider.uitl.MyLog;
import com.zking.eurekaprovider.uitl.PageBean;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("keyword")
public class Keywordcontroller {

    @Autowired
    private KeywordServer keywordServer;




    private JsonData jsonData;
@MyLog("获得所有关键字")
@RequestMapping("getkeywordlist")
    public JsonData getkeywordlist(keyword keyword, PageBean pageBean){
        jsonData=new JsonData();

        List<keyword> keywords = keywordServer.keywordList(keyword, pageBean);

        jsonData.setPage(pageBean.getPage());
        jsonData.setCode(0);
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setRows(pageBean.getRows());

        jsonData.setResult(keywords);



        return jsonData;
    }

    @MyLog("添加关键字")
    @RequestMapping("intserKeyword")
    public JsonData  intserKeyword(String ad,keyword keyword){
        List<Answering>  answeringList=new ArrayList<>();
        String[] split = ad.split("\"},");

        for ( String a:split
             ) {
            Answering answering=new Answering();
            a=	a.replace("[","");
            a=	a.replace("]","");
            a=	a.replace("{","");
            a=a.replace("\"}","");
            a=a.replace("\\","");
            a=a.replace("\"category\":\"","");
answering.setAnswering(a);
if(answering.getAnswering().contains("img")){
    answering.setAntype(1);
}else{
    answering.setAntype(2);
}
answering.setCreateid(keyword.getCreateid());
            answeringList.add(answering);
        }
        jsonData=new JsonData();

        int i = keywordServer.insertkeyword(answeringList,keyword);


        if(i>0){
            jsonData.setCode(0);
            jsonData.setMessage("添加成功");
        }else{
            jsonData.setCode(-1);
            jsonData.setMessage("添加失败");
        }

        return jsonData;
    };






@Autowired
private AnsweringServer answeringServer;



    @MyLog("修改关键字")
    @RequestMapping("upKeyword")
    public JsonData  upserKeywordcategory(String del,String delsum,String  inter,String intersum,String uppdeta,String  uppdetasum,String keyword){
int a=0;
        int b=0;int c=0;int d=0;


        keyword  ss=null;
 if(null!=inter) {
    JSONArray jsonArray = JSONArray.fromObject(inter);
    for (int i = 0; i < Integer.parseInt(intersum); i++) {
        Object o = jsonArray.get(i);
        JSONObject jsonObject2 = JSONObject.fromObject(o);
        Answering stu2 = (Answering) JSONObject.toBean(jsonObject2, Answering.class);
         a = answeringServer.insertAnswering(stu2);

    }
}

        String[] split = del.split("-");

        for (String v :split
             ) {
            System.out.println(v);
            Answering answering=new Answering();
            answering.setAnid((long)Integer.parseInt(v));
        b=       answeringServer.delAnswering(answering);
        }

        if(null!=uppdeta) {
            JSONArray jsonArray = JSONArray.fromObject(uppdeta);
            for (int i = 0; i < Integer.parseInt(uppdetasum); i++) {
                Object o = jsonArray.get(i);
                JSONObject jsonObject2 = JSONObject.fromObject(o);
                Answering stu2 = (Answering) JSONObject.toBean(jsonObject2, Answering.class);
              c=  answeringServer.upAnswering(stu2);
            }
        }
        if(null!=keyword) {
            JSONObject jsonObject=JSONObject.fromObject(keyword);
            ss=(keyword)JSONObject.toBean(jsonObject, keyword.class);
         d=   keywordServer.upkeyword(ss);
        }

        jsonData.setCode(0);
        jsonData.setMessage("修改成功！！！");
        return jsonData;
    };
    @MyLog("删除关键字")
    @RequestMapping("delKeyword")
    public JsonData  delKeyword(keyword keyword){
        jsonData=new JsonData();
        int i = keywordServer.delkeyword(keyword);
        if(i>0){
            jsonData.setCode(0);
            jsonData.setMessage("删除成功");
        }else{
            jsonData.setCode(-1);
            jsonData.setMessage("删除失败");
        }
        System.out.println(i);
        return jsonData;
    };

}
