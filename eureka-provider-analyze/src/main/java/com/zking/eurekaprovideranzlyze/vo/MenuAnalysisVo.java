package com.zking.eurekaprovideranzlyze.vo;

import com.zking.eurekaprovideranzlyze.model.MenuAnalysis;
import lombok.Data;

@Data
public class MenuAnalysisVo extends MenuAnalysis {
    private String click_date;
    private int count;
    private int total;
}
