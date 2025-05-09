package com.spring.puzzle.class1.solution2;

import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Service;

/**
 * 验证注入时多个构造器时，默认使用无参构造器
 *
 * @author tomyli
 * @date 2025/5/9
 *         enjoy
 */
@Service
public class ServiceDefaultImpl {

    private String serviceName;

    public ServiceDefaultImpl() {
        this.serviceName = "defaultServiceName";
    }

    public ServiceDefaultImpl(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * @param serviceName 服务名称
     *         <p>
     *         See {@link AbstractAutowireCapableBeanFactory#instantiateBean(String, RootBeanDefinition)}
     */
    public ServiceDefaultImpl(String serviceName, String otherStringParameter) {
        this.serviceName = serviceName;
    }

}
