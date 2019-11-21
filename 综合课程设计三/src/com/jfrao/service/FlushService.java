package com.jfrao.service;

import com.jfrao.dao.FlushDao;

public class FlushService {

    public void flush(){

        FlushDao flushDao = new FlushDao();
        flushDao.flush();

    }

}
