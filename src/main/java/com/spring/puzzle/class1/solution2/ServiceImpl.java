package com.spring.puzzle.class1.solution2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Service;

/**
 * 验证注入时的Bean从BeanFactory中获取
 *
 * @author tomyli
 * @date 2025/5/9
 *         enjoy
 */
@Service
public class ServiceImpl {

    private String serviceName;

    /**
     * @param serviceName {@code @See} {@link DefaultListableBeanFactory#doResolveDependency}
     */
    public ServiceImpl(@Autowired(required = false) String serviceName) {
        this.serviceName = serviceName;
    }

}
