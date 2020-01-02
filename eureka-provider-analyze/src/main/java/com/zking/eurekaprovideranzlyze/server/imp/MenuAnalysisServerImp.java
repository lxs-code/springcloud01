package com.zking.eurekaprovideranzlyze.server.imp;

import com.zking.eurekaprovideranzlyze.mapper.MenuAnalysisMapper;
import com.zking.eurekaprovideranzlyze.server.MenuAnalysisServer;
import com.zking.eurekaprovideranzlyze.vo.MenuAnalysisVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuAnalysisServerImp implements MenuAnalysisServer {
    @Autowired
    private MenuAnalysisMapper menuAnalysisMapper;

    @Override
    public int insert(MenuAnalysisVo record) {
        return menuAnalysisMapper.insert(record);
    }

    @Override
    public List<MenuAnalysisVo> selectdate() {
        return menuAnalysisMapper.selectdate();
    }

    @Override
    public List<MenuAnalysisVo> selectAll() {
        return menuAnalysisMapper.selectAll();
    }
}
