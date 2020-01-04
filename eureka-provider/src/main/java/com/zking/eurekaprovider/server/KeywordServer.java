package com.zking.eurekaprovider.server;

import com.zking.eurekaprovider.model.Answering;
import com.zking.eurekaprovider.model.keyword;
import com.zking.eurekaprovider.uitl.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface KeywordServer {

    List<keyword>  keywordList(keyword keyword ,PageBean page);

int insertkeyword(List<Answering> answeringList, keyword keyword);

    int upkeyword(keyword keyword);

int delkeyword(keyword keyword);

}
