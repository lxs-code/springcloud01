package com.zking.eurekaprovideranzlyze.mapper;

import com.zking.eurekaprovideranzlyze.model.MenuAnalysis;
import com.zking.eurekaprovideranzlyze.vo.MenuAnalysisVo;

import java.util.List;

public interface MenuAnalysisMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MenuAnalysisVo record);

    int insertSelective(MenuAnalysis record);

    MenuAnalysis selectByPrimaryKey(Integer mid);

    List<MenuAnalysisVo> selectdate();

    List<MenuAnalysisVo> selectAll();

    int updateByPrimaryKeySelective(MenuAnalysis record);

    int updateByPrimaryKey(MenuAnalysis record);
}