package com.zking.eurekaprovidershh.server;

import com.zking.eurekaprovidershh.uitl.PageBean;
import com.zking.eurekaprovidershh.model.Organization;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface OrganizationServer {
    @Transactional(readOnly = true)
    List<Organization> list(PageBean pageBean, Organization organization);

    @Transactional(readOnly = true)
    List<Organization> getall();

    int updateByPrimaryKeySelective(Organization organization);
}
