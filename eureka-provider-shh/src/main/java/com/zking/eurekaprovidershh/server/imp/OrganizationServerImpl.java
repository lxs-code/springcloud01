package com.zking.eurekaprovidershh.server.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.eurekaprovidershh.mapper.OrganizationMapper;
import com.zking.eurekaprovidershh.model.Organization;
import com.zking.eurekaprovidershh.server.OrganizationServer;
import com.zking.eurekaprovidershh.uitl.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class OrganizationServerImpl implements OrganizationServer {
    @Autowired
    private OrganizationMapper organizationMapper;
    @Override
    public List<Organization> list(PageBean pageBean,Organization organization) {

        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<Organization> list = organizationMapper.list(organization.getOrganame());//pb

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }

    @Override
    public List<Organization> getall() {
        return organizationMapper.list(null);
    }

    @Override
    public int updateByPrimaryKeySelective(Organization organization) {
        return organizationMapper.updateByPrimaryKeySelective(organization);
    }
}
