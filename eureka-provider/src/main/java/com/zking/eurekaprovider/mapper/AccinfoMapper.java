package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.Accinfo;

import java.util.List;

public interface AccinfoMapper {
    int insert(Accinfo record);

    int insertSelective(Accinfo record);

    List<Accinfo> list(Accinfo accinfo);
}