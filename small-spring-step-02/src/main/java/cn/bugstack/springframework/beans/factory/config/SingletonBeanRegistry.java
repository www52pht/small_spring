package cn.bugstack.springframework.beans.factory.config;

/**
 * @author www
 * @version 1.0
 * @create 2022/5/29 21:55
 */

/**
 * 注册单实例bean
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String name);
}
