package com.zking.eurekaprovider.server.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.eurekaprovider.mapper.AnsweringMapper;
import com.zking.eurekaprovider.mapper.KeywordcategoryMapper;
import com.zking.eurekaprovider.mapper.UserMapper;
import com.zking.eurekaprovider.mapper.keywordMapper;
import com.zking.eurekaprovider.model.Answering;
import com.zking.eurekaprovider.model.Keywordcategory;
import com.zking.eurekaprovider.model.User;
import com.zking.eurekaprovider.model.keyword;
import com.zking.eurekaprovider.server.KeywordServer;
import com.zking.eurekaprovider.uitl.PageBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class KeywordServerImpl implements KeywordServer {

    @Autowired
    private keywordMapper keywordMapper;

@Autowired
private  KeywordcategoryMapper keywordcategoryMapper;


@Autowired
private AnsweringMapper answeringMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<keyword> keywordList(keyword keyword, PageBean pageBean) {

        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<keyword> keywordcategories = keywordMapper.keywordList(keyword);

        for (keyword keyword1 : keywordcategories) {
            Keywordcategory keywordcategory = keywordcategoryMapper.selectByPrimaryKey(keyword1.getKcid());
            List<Answering> answerings = answeringMapper.AnsweringList(keyword1.getKid());
            keyword1.setAnsweringList(answerings);
            keyword1.setKeywordcategory(keywordcategory);
            User user=new User();
            user.setUserId(keyword1.getCreateid());
            User user1 = userMapper.selectBykey(user);
            keyword1.setUser(user);
        }
        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(keywordcategories);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }




        return keywordcategories;
    }

    @Override
    public int insertkeyword(List<Answering> answeringList,keyword keyword) {


        keywordMapper.insertSelective(keyword);
        System.out.println(keyword.getKcid());
        for (Answering s :answeringList) {
            s.setCreateid(keyword.getCreateid());
            s.setKid(keyword.getKid());
            answeringMapper.insertSelective(s);
        }



        return 1;
    }

    @Override
    public int upkeyword(keyword keyword) {
        return keywordMapper.updateByPrimaryKeySelective(keyword);
    }





    @Override
    public int delkeyword(keyword keyword) {
        int a=0;
  a+=      answeringMapper.delbyan(keyword.getKid());
  a+=      keywordMapper.deleteByPrimaryKey(keyword.getKid());

        return a;
    }
}
