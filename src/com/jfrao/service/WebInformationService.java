package com.jfrao.service;

import com.jfrao.dao.PageListDao;
import com.jfrao.dao.WebInformationDao;
import com.jfrao.domain.PageList;
import com.jfrao.domain.WebInformation;

import java.util.List;

public class WebInformationService {

//    public List<WebInformation> findInformation(Integer id){
//        String type = GetType(id);
//        WebInformationDao webInformationDao = new WebInformationDao();
//        List<WebInformation> information = webInformationDao.findInformation(type);
//        return information;
//    }

    public String GetType(Integer id){
        String type = null;
        switch (id){
            case 0 : type = "hyhd"; break;//行业活动
            case 1 : type = "cgxx"; break;//采购信息
            case 2 : type = "zcfg"; break;//政策法规
            case 3 : type = "cjgg"; break;//招标信息
            case 4 : type = "hyxw"; break;//行业新闻
        }
        return type;
    }

    public Long getSum(Integer id){
        String type = GetType(id);
        PageListDao pageListDao = new PageListDao();
        Long Sum = pageListDao.getNum(type);
        return Sum;
    }

    public PageList GetPageList(Integer page, Integer id){
        String type = GetType(id);
        PageListDao pageListDao = new PageListDao();
        PageList pageList = pageListDao.getInformationList(page, type);
        return pageList;
    }
}
