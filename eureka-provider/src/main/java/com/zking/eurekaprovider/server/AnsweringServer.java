package com.zking.eurekaprovider.server;

import com.zking.eurekaprovider.model.Answering;
import com.zking.eurekaprovider.uitl.PageBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface AnsweringServer {

    List<Answering> AnsweringList(Answering answering, PageBean pageBean);


    int  insertAnswering(Answering answering);


    int upAnswering(Answering answering);

    int delAnswering(Answering answering);



}
