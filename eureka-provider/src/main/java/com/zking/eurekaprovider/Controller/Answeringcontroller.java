package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.model.Answering;
import com.zking.eurekaprovider.server.AnsweringServer;
import com.zking.eurekaprovider.uitl.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Answeringcontroller")
public class Answeringcontroller {


    @Autowired
    private AnsweringServer answeringServer;



    private JsonData jsonData;



    public  JsonData getacsweringlist(){
        return  jsonData;
    }

@RequestMapping("interanswering")
    public   JsonData  interanswering(Answering answering){


    int i = answeringServer.insertAnswering(answering);
    if(i>0){
        jsonData.setCode(0);
        jsonData.setMessage("添加成功");
    }else{
        jsonData.setCode(-1);
        jsonData.setMessage("添加失败");
    }


    return  jsonData;
    }


    @RequestMapping("upanswering")
    public   JsonData  upanswering(Answering answering){


        int i = answeringServer.upAnswering(answering);
        if(i>0){
            jsonData.setCode(0);
            jsonData.setMessage("修改成功");
        }else{
            jsonData.setCode(-1);
            jsonData.setMessage("修改失败");
        }


        return  jsonData;
    }
    @RequestMapping("delanswering")
    public   JsonData  delanswering(Answering answering){


        int i = answeringServer.delAnswering(answering);
        if(i>0){
            jsonData.setCode(0);
            jsonData.setMessage("删除成功");
        }else{
            jsonData.setCode(-1);
            jsonData.setMessage("删除失败");
        }


        return  jsonData;
    }

}
