import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Test {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("TX_jdbcTemplate/config/applicationContext.xml");

    @org.junit.Test
    public void test01() throws SQLException {
        DataSource bean = ioc.getBean(DataSource.class);
        Connection connection = bean.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
