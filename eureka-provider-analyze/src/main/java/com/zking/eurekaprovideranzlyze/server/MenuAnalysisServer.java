package com.zking.eurekaprovideranzlyze.server;

import com.zking.eurekaprovideranzlyze.vo.MenuAnalysisVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface MenuAnalysisServer {

    int insert(MenuAnalysisVo record);

    List<MenuAnalysisVo> selectdate();

    List<MenuAnalysisVo> selectAll();
}
