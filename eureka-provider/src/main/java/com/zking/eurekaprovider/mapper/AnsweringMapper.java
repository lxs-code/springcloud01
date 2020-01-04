package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.Answering;

import java.util.List;

public interface AnsweringMapper {
    int deleteByPrimaryKey(Long anid);

    int insert(Answering record);

    int insertSelective(Answering record);

    Answering selectByPrimaryKey(Long anid);

    int updateByPrimaryKeySelective(Answering record);

    int updateByPrimaryKeyWithBLOBs(Answering record);

    int updateByPrimaryKey(Answering record);

int delbyan(Long kid);

    List<Answering>  AnsweringList(Long kid);
}