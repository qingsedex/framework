package lf.spring.service;

import lf.spring.bean.User;
import lf.spring.dao.UserDao;

/**
 * user service impl
 *
 * @author lfm on 2019/7/24
 */

public class UserServiceImpl {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add(User user){
        userDao.insert(user);
    }
}
