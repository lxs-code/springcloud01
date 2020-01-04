package com.zking.eurekaprovider.server;

import com.zking.eurekaprovider.model.Keywordcategory;
import com.zking.eurekaprovider.uitl.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 关键字类别接口
 * 作者：罗佳美
 *
 */
@Transactional
public interface KeywordcategoryServer {



List<Keywordcategory>  KeywordcategoryList(Keywordcategory keywordcategory, PageBean pageBean);



int  insetKeywordcategory(Keywordcategory keywordcategory);

int upKeywordcategory(Keywordcategory keywordcategory);


int delKeywordcategory(Keywordcategory keywordcategory);
}
