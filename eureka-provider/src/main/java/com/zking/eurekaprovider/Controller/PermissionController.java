package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.mapper.PermissionMapper;
import com.zking.eurekaprovider.mapper.RoleMapper;
import com.zking.eurekaprovider.model.Permission;
import com.zking.eurekaprovider.model.Role;
import com.zking.eurekaprovider.model.User;
import com.zking.eurekaprovider.server.PerssionServer;
import com.zking.eurekaprovider.server.UserServer;
import com.zking.eurekaprovider.uitl.JsonData;
import com.zking.eurekaprovider.uitl.MyLog;
import com.zking.vo.model.RolePermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("Permission")
public class PermissionController {

@Autowired
    private UserServer userServer;


@Autowired
        private PerssionServer perssionServer;

@Autowired
private RoleMapper roleMapper;
private  JsonData jsonData;



@RequestMapping("getPermission")
public JsonData selectPrtmissions(User user){
    jsonData=new JsonData();
    List<Permission> permissions = userServer.listPermissionsByUserName(user);
jsonData.setResult(permissions);
jsonData.setCode(0);
    return  jsonData;
}
    @MyLog(value = "查询角色和改角色拥有的权限")
    @RequestMapping("getPermissiona")
    public JsonData getPrtmissions(){
        Map<String,Object> map=new HashMap<>();
        List<Permission> permissionsa = perssionServer.getPermissions();


        List<Role> listroles = roleMapper.listroles();
        for (Role r :listroles) {
            List<Permission> permissions = perssionServer.getPermission(r);
            r.setPermission(permissions);
        }

        map.put("permissionsa",permissionsa);
        map.put("listroles",listroles);
        jsonData=new JsonData();
        jsonData.setResult(map);
        jsonData.setCode(0);
        return  jsonData;
    }




    @MyLog(value = "权限修改")
    @RequestMapping("uppermission")
    public JsonData uppermission(String ac,Long rid,String li){
        jsonData=new JsonData();
        String[] split = ac.split("-");
        String[] splits = li.split("-");
        List<RolePermission>   del=new ArrayList<>();
        List<RolePermission>   inte=new ArrayList<>();
         for (String s:splits ) {
            if(ac.contains(s)){
            }else{
                System.out.println("不包含"+s);
                RolePermission rolePermission=new RolePermission();
                rolePermission.setPid((long)Integer.parseInt(s));
                rolePermission.setRid(rid);
                perssionServer.delPermission(rolePermission);
            }
        }
        for (String s:split ) {
            if(li.contains(s)){
            }else{
                RolePermission rolePermission=new RolePermission();
                rolePermission.setPid((long)Integer.parseInt(s));
                rolePermission.setRid(rid);
                perssionServer.intPermission(rolePermission);
            }
        }
        jsonData.setCode(0);
         jsonData.setMessage("修改！");
        return  jsonData;
    }


}
