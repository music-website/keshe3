package com.jfrao.dao;

import com.jfrao.domain.WebInformation;
import com.jfrao.utils.ClassifyUtil;
import com.jfrao.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class FlushDao {

    public void flush(){

        Session currentSession = HibernateUtil.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();

        Query query = currentSession.createQuery("from WebInformation where type is null");
        List<WebInformation> list = query.list();
        for (WebInformation webInformation : list) {
            int index = ClassifyUtil.classification(webInformation.getText());
            switch (index){
                case 0 : webInformation.setType("政策法规") ; break;
                case 1 : webInformation.setType("行政处罚") ; break;
                case 2 : webInformation.setType("行业活动") ; break;
                default: webInformation.setType("其他"); break;
            }
        }

        transaction.commit();

    }

}
