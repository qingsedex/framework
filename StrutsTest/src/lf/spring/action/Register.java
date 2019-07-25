package lf.spring.action;

import com.opensymphony.xwork2.ActionSupport;
import lf.spring.bean.User;
import lf.spring.dao.UserDao;
import lf.spring.service.UserServiceImpl;

/**
 * register
 *
 * @author lfm on 2019/7/25
 */

public class Register extends ActionSupport {

    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    private UserServiceImpl userServiceImpl;


    public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        userServiceImpl.add(user);
        return "success";
    }
}
