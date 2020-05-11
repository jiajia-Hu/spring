package ioc_3.service;

import ioc_3.dao.BaseDao;
import ioc_3.dao.BookDao;
import ioc_3.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService extends BaseService<Book>{


}
