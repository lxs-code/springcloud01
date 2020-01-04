package com.zking.eurekaprovidershh.server.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.eurekaprovidershh.mapper.OrganizationPersonMapper;
import com.zking.eurekaprovidershh.model.OrganizationPerson;
import com.zking.eurekaprovidershh.server.OrganizationPersonServer;
import com.zking.eurekaprovidershh.uitl.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class OrganizationPersonServerImpl implements OrganizationPersonServer {
    @Autowired
    private OrganizationPersonMapper organizationPersonMapper;


    @Override
    public List<OrganizationPerson> list(PageBean pageBean, OrganizationPerson person) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<OrganizationPerson> list = organizationPersonMapper.list(person.getOrpOrgid());//pb

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }

    @Override
    public List<OrganizationPerson> list1(PageBean pageBean, OrganizationPerson person) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<OrganizationPerson> list = organizationPersonMapper.list1(person.getOrpOrgid());//pb

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }
    @Override
    public List<OrganizationPerson> list2(PageBean pageBean, OrganizationPerson person) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<OrganizationPerson> list = organizationPersonMapper.list2(person.getOrpName());//pb

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }
    @Override
    public int updateByPrimaryKeySelective(OrganizationPerson organizationPerson) {
        return organizationPersonMapper.updateByPrimaryKeySelective(organizationPerson);
    }

    @Override
    public int update(OrganizationPerson organizationPerson) {
        return organizationPersonMapper.update(organizationPerson);
    }

    @Override
    public int insert(OrganizationPerson organizationPerson) {
        return organizationPersonMapper.insert(organizationPerson);
    }
}
