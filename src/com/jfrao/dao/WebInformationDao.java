package com.jfrao.dao;

import com.jfrao.domain.WebInformation;
import com.jfrao.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.swing.plaf.ColorUIResource;
import java.util.List;

public class WebInformationDao {

    public List<WebInformation> findInformation(String type){
        Session currentSession = HibernateUtil.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();

        Query query = currentSession.createQuery("from WebInformation where type = :aaa");
        query.setParameter("aaa",type);
        List<WebInformation> list = query.list();

        transaction.commit();
        return list;

    }
}
