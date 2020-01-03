package com.zking.eurekaprovidershh.mapper;

import com.zking.eurekaprovidershh.model.OrganizationPerson;

import java.util.List;

public interface OrganizationPersonMapper {
    int deleteByPrimaryKey(Integer orpId);

    int insert(OrganizationPerson record);

    int insertSelective(OrganizationPerson record);

    List<OrganizationPerson> list(Integer orpId);

    List<OrganizationPerson> list1(Integer orpId);

    List<OrganizationPerson> list2(String orpName);

    int updateByPrimaryKeySelective(OrganizationPerson record);

    int update(OrganizationPerson record);

    int updateByPrimaryKey(OrganizationPerson record);
}