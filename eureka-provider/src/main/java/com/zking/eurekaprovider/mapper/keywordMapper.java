package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.keyword;

import java.util.List;

public interface keywordMapper {
    int deleteByPrimaryKey(Long kid);

    int insert(keyword record);

    int insertSelective(keyword record);

    keyword selectByPrimaryKey(Long kid);

    int updateByPrimaryKeySelective(keyword record);

    int updateByPrimaryKey(keyword record);


    List<keyword>  keywordList(keyword keyword);
}