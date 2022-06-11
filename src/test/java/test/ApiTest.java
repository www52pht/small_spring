package test;


import com.www.springframework.test.bean.UserService;
import org.junit.Test;
import springframework.BeanDefinition;
import springframework.BeanFactory;

/**
 * @author www
 * @version 1.0
 * @create 2022/5/29 20:37
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }


}
