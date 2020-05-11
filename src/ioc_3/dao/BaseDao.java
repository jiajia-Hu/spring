package ioc_3.dao;

import org.springframework.stereotype.Repository;


/**
 * CRUD
 * @param <T>
 */
@Repository
public abstract class BaseDao<T> {
    public  abstract  void save();
}
