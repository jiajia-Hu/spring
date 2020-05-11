package ioc_3.service;

import ioc_3.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;


public class BaseService<T> {

    @Autowired
    BaseDao<T> baseDao;

    public void save(){
        baseDao.save();
    }
}
