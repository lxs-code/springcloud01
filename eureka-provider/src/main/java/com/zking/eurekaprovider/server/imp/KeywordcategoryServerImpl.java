package com.zking.eurekaprovider.server.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.eurekaprovider.mapper.KeywordcategoryMapper;
import com.zking.eurekaprovider.mapper.UserMapper;
import com.zking.eurekaprovider.model.Keywordcategory;
import com.zking.eurekaprovider.model.User;
import com.zking.eurekaprovider.server.KeywordcategoryServer;
import com.zking.eurekaprovider.uitl.PageBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class KeywordcategoryServerImpl implements KeywordcategoryServer {
@Autowired
private KeywordcategoryMapper keywordcategoryMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Keywordcategory> KeywordcategoryList(Keywordcategory keywordcategory, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<Keywordcategory> keywordcategories = keywordcategoryMapper.KeywordcategoryList(keywordcategory);
        for (Keywordcategory  ke:keywordcategories) {
            User user=new User();

user.setUserId(ke.getCreateid());
            User user1 = userMapper.selectBykey(user);
            ke.setUser(user1);
        }
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(keywordcategories);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }

        return keywordcategories;
    }

    @Override
    public int insetKeywordcategory(Keywordcategory keywordcategory) {
        return keywordcategoryMapper.insertSelective(keywordcategory);
    }

    @Override
    public int upKeywordcategory(Keywordcategory keywordcategory) {
        return keywordcategoryMapper.updateByPrimaryKeySelective(keywordcategory);
    }

    @Override
    public int delKeywordcategory(Keywordcategory keywordcategory) {
        return keywordcategoryMapper.deleteByPrimaryKey(keywordcategory.getKcid());
    }
}
