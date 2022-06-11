package springframework;

/**
 * @author www
 * @version 1.0
 * @create 2022/5/29 20:10
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
