package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.Keywordcategory;

import java.util.List;

public interface KeywordcategoryMapper {
    int deleteByPrimaryKey(Long kcid);

    int insert(Keywordcategory record);

    int insertSelective(Keywordcategory record);

    Keywordcategory selectByPrimaryKey(Long kcid);

    int updateByPrimaryKeySelective(Keywordcategory record);

    int updateByPrimaryKey(Keywordcategory record);


    List<Keywordcategory> KeywordcategoryList(Keywordcategory keywordcategory);



}