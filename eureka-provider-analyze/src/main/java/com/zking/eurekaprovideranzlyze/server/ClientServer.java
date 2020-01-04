package com.zking.eurekaprovideranzlyze.server;

import com.zking.eurekaprovideranzlyze.vo.ClientVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ClientServer {
    //查询绑定数据
    List<ClientVo> selectAll();
//    查询绑定时间
    List<ClientVo> selectDate();

    List<ClientVo> selectDate1();
}
