package com.zking.eurekaprovideranzlyze.server.imp;

import com.zking.eurekaprovideranzlyze.mapper.ClientMapper;
import com.zking.eurekaprovideranzlyze.server.ClientServer;
import com.zking.eurekaprovideranzlyze.vo.ClientVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServerImp implements ClientServer{

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public List<ClientVo> selectAll() {
        return clientMapper.selectAll();
    }

    @Override
    public List<ClientVo> selectDate() {
        return clientMapper.selectDate();
    }

    @Override
    public List<ClientVo> selectDate1() {
        return clientMapper.selectDate1();
    }
}
