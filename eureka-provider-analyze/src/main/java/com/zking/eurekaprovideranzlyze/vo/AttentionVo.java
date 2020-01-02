package com.zking.eurekaprovideranzlyze.vo;

import com.zking.eurekaprovideranzlyze.model.Attention;
import lombok.Data;

@Data
public class AttentionVo extends Attention {
    private int count;
    private String click_date;
}
