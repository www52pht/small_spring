package cn.bugstack.springframework.beans;

/**
 * @author www
 * @version 1.0
 * @create 2022/5/29 21:51
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
