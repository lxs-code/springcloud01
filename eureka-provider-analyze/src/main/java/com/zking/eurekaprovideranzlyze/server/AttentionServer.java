package com.zking.eurekaprovideranzlyze.server;

import com.zking.eurekaprovideranzlyze.vo.AttentionVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AttentionServer {
    List<AttentionVo> selectState();
    List<AttentionVo> selectDate();
    List<AttentionVo> selectDate1();
}
