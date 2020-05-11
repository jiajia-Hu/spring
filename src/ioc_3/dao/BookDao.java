package ioc_3.dao;

import ioc_3.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao extends BaseDao<Book>{
    @Override
    public void save() {
        System.out.println("图书bookDao save--------");
    }
}
