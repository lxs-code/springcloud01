package com.zking.eurekaprovidershh.server;

import com.zking.eurekaprovidershh.model.OrganizationPerson;
import com.zking.eurekaprovidershh.uitl.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface OrganizationPersonServer {
    @Transactional(readOnly = true)
    List<OrganizationPerson> list(PageBean pageBean, OrganizationPerson person);

    @Transactional(readOnly = true)
    List<OrganizationPerson> list1(PageBean pageBean, OrganizationPerson person);

    @Transactional(readOnly = true)
    List<OrganizationPerson> list2(PageBean pageBean, OrganizationPerson person);

    int updateByPrimaryKeySelective(OrganizationPerson organizationPerson);

    int update(OrganizationPerson organizationPerson);

    int insert(OrganizationPerson organizationPerson);
}
