package com.jfrao.dao;

import com.jfrao.domain.PageList;
import com.jfrao.domain.WebInformation;
import com.jfrao.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class PageListDao {
    public Long getNum(String type){
        Session currentSession = HibernateUtil.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();

        Query query1 = currentSession.createQuery("select count(*) from WebInformation where type = :bbb");
        query1.setParameter("bbb",type);
        Long num = (Long) query1.uniqueResult();
        transaction.commit();

        return num;
    }

    public PageList getInformationList(Integer page, String type){
        Session currentSession = HibernateUtil.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();

        Query query1 = currentSession.createQuery("from WebInformation where type = :bbb order by date DESC");
        query1.setParameter("bbb",type);
        query1.setFirstResult((page - 1) * 15);
        query1.setMaxResults(15);
        List<WebInformation> list = query1.list();
        PageList pageList = new PageList();
        pageList.setCurrentPage(page);
        pageList.setCurrentTitle(list);
        transaction.commit();
        return pageList;
    }
}
