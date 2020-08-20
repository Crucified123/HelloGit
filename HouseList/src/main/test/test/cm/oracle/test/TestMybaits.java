package cm.oracle.test;

import com.oracle.entity.User;
import com.oracle.service.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:config/bean.xml")
public class TestMybaits {

    @Autowired
    private UserService userService;

    @Test
    public void test() throws Exception {
        User user = userService.login("张三", "123");
        System.out.println(user);
    }



}
