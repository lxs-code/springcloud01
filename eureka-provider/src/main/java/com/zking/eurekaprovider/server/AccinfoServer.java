package com.zking.eurekaprovider.server;

import com.zking.eurekaprovider.model.Accinfo;
import com.zking.eurekaprovider.uitl.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AccinfoServer {

    @Transactional(readOnly = true)
    List<Accinfo> list(Accinfo accinfo, PageBean pageBean);

 }
