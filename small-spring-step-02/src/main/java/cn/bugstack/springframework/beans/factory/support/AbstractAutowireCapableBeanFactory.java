package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.config.BeanDefinition;

/**
 * @author www
 * @version 1.0
 * @create 2022/5/29 22:55
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {


    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;

        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed");
        }

        addSingleton(beanName, bean);

        return bean;
    }
}
