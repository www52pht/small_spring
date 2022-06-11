package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * @author www
 * @version 1.0
 * @create 2022/5/29 21:49
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object...args) throws BeansException;
}
