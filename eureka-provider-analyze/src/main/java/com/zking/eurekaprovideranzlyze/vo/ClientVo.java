package com.zking.eurekaprovideranzlyze.vo;

import com.zking.eurekaprovideranzlyze.model.Client;
import lombok.Data;

@Data
public class ClientVo extends Client {
    private long affirm;
    private long cancel;
    private long total;

    private int count;
    private String click_date;

}
