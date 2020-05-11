package ioc_3.dao;

import ioc_3.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User> {
    @Override
    public void save() {
        System.out.println("用户userDao save======");
    }
}
