package com.zking.eurekaprovider.server.imp;

import com.zking.eurekaprovider.mapper.AnsweringMapper;
import com.zking.eurekaprovider.mapper.UserMapper;
import com.zking.eurekaprovider.model.Answering;
import com.zking.eurekaprovider.server.AnsweringServer;
import com.zking.eurekaprovider.uitl.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnsweringServerImpl implements AnsweringServer {


    @Autowired
    private AnsweringMapper answeringMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Answering> AnsweringList(Answering answering, PageBean pageBean) {

//        answeringMapper.

        return null;
    }

    @Override
    public int insertAnswering(Answering answering) {
        return answeringMapper.insertSelective(answering);
    }

    @Override
    public int upAnswering(Answering answering) {
        return answeringMapper.updateByPrimaryKeyWithBLOBs(answering);
    }

    @Override
    public int delAnswering(Answering answering) {
        return answeringMapper.deleteByPrimaryKey(answering.getAnid());
    }
}
