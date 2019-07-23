import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import wang.dreamland.www.entity.User;
import wang.dreamland.www.service.UserService;

/**
 * dreamland-PACKAGE_NAME
 * created by LI LICHUNYAN at 2019/7/20
 */
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class TestTransaction extends AbstractJUnit4SpringContextTests {
    @Autowired
    private UserService userService;
    @Test
    public void testSave(){
        User user = new User();
        user.setNickname("封剑主-叹希奇");
        user.setEmail("123456@qq.com");
        userService.regist(user);
    }
}