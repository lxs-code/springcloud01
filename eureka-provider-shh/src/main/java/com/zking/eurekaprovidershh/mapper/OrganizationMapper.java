package com.zking.eurekaprovidershh.mapper;

import com.zking.eurekaprovidershh.model.Organization;

import java.util.List;

public interface OrganizationMapper {
    int deleteByPrimaryKey(Integer orgaid);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(Integer orgaid);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);

    List<Organization> list(String organame);
}