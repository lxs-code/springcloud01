package com.zking.eurekaprovideranzlyze.mapper;

import com.zking.eurekaprovideranzlyze.model.Client;
import com.zking.eurekaprovideranzlyze.vo.ClientVo;

import java.util.List;

public interface ClientMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(Integer cid);

    List<ClientVo> selectAll();

    List<ClientVo> selectDate();

    List<ClientVo> selectDate1();

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);
}