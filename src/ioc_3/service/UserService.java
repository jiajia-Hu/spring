package ioc_3.service;

import ioc_3.dao.BaseDao;
import ioc_3.dao.UserDao;
import ioc_3.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {


}
