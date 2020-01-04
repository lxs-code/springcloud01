package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.Commodity;
import com.zking.eurekaprovider.uitl.PageBean;

import java.util.List;

public interface CommodityMapper {
    int deleteByPrimaryKey(Integer tComid);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer tComid);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);

    List<Commodity> list(Commodity commodity);

    int update(Commodity commodity);


}