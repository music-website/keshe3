package com.jfrao.service;

import com.jfrao.dao.WebInformationDao;
import com.jfrao.domain.WebInformation;

import java.util.List;

public class WebInformationService {

    public List<WebInformation> findInformation(Integer id){
        String type = null;
        switch (id){
            case 0 : type = "政策法规"; break;
            case 1 : type = "行政处罚"; break;
            case 2 : type = "行业活动"; break;
            default : type = "其他" ; break;
        }

        WebInformationDao webInformationDao = new WebInformationDao();
        List<WebInformation> information = webInformationDao.findInformation(type);
        return information;

    }

}
