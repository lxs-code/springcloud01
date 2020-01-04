package com.zking.eurekaprovideranzlyze.server.imp;

import com.zking.eurekaprovideranzlyze.mapper.AttentionMapper;
import com.zking.eurekaprovideranzlyze.server.AttentionServer;
import com.zking.eurekaprovideranzlyze.vo.AttentionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttentionServerImp implements AttentionServer {

    @Autowired
    private AttentionMapper attentionMapper;

    @Override
    public List<AttentionVo> selectState() {
        return attentionMapper.selectState();
    }

    @Override
    public List<AttentionVo> selectDate() {
        return attentionMapper.selectDate();
    }

    @Override
    public List<AttentionVo> selectDate1() {
        return attentionMapper.selectDate1();
    }
}
