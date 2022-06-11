package springframework;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author www
 * @version 1.0
 * @create 2022/5/29 20:13
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
