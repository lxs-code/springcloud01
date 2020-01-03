package com.zking.eurekaprovider.server.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.eurekaprovider.mapper.AccinfoMapper;
import com.zking.eurekaprovider.model.Accinfo;
import com.zking.eurekaprovider.server.AccinfoServer;
import com.zking.eurekaprovider.uitl.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccinfoServerImpl implements AccinfoServer {
    @Autowired
    private AccinfoMapper accinfoMapper;
    @Override
    public List<Accinfo> list(Accinfo accinfo, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<Accinfo> lists = accinfoMapper.list(accinfo);

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(lists);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return lists;
    }

}
