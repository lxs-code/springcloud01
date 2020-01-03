package com.zking.eurekaprovider.server;

import com.zking.eurekaprovider.model.Commodity;
import com.zking.eurekaprovider.uitl.PageBean;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface CommodityServer {

    @Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    int add(Commodity commodity);

    @Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    int del(Integer tComid);

    @Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    int up(Commodity commodity);

    @Transactional(readOnly = true)
    List<Commodity> list(PageBean pageBean);

    @Transactional
    int update(Commodity commodity);


}
