package lf.spring.Controller;

import lf.spring.bean.User;
import lf.spring.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * user controller
 *
 * @author lfm on 2019/7/24
 */

public class UserControl {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) ctx.getBean("userService");
        User user = new User();
        user.setName("lfm");
        user.setPwd("123456");
        userService.add(user);
    }
}
