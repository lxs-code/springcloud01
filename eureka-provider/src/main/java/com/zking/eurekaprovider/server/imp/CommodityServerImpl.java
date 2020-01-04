package com.zking.eurekaprovider.server.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.eurekaprovider.mapper.CommodityMapper;
import com.zking.eurekaprovider.model.Commodity;
import com.zking.eurekaprovider.server.CommodityServer;
import com.zking.eurekaprovider.uitl.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServerImpl implements CommodityServer {
    @Autowired
    private CommodityMapper commodityMapper;
    @Override
    public int add(Commodity commodity) {
        return commodityMapper.insertSelective(commodity);
    }

    @Override
    public int del(Integer tComid) {
        return commodityMapper.deleteByPrimaryKey(tComid);
    }

    @Override
    public int up(Commodity commodity) {
        return commodityMapper.updateByPrimaryKeySelective(commodity);
    }

    @Override
    public List<Commodity> list(Commodity commodity, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<Commodity>lists = commodityMapper.list(commodity);

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(lists);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return lists;
    }

    @Override
    public int update(Commodity commodity) {
        return commodityMapper.update(commodity);
    }


}
