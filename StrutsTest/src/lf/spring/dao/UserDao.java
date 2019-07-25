package lf.spring.dao;

import lf.spring.bean.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * user dao
 *
 * @author lfm on 2019/7/24
 */

public class UserDao {

    SessionFactory sessionfactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionfactory = sessionFactory;
    }

    public void insert(User user){
        Session session = sessionfactory.openSession();
        session.save(user);
    }

}
