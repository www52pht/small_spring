package cn.bugstack.springframework.beans.factory.config;

/**
 * @author www
 * @version 1.0
 * @create 2022/5/29 21:53
 */

/**
 * Bean定义类
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public BeanDefinition() {
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
