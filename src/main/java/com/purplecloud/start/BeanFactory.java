package com.purplecloud.start;

import java.util.List;

public class BeanFactory {
    List<Class<?>> classes;
    List<Object> instances;
    public Object getBeanByClass(Class<?> clazz) {
        instances.forEach(instance -> {
            if (clazz.isInstance(instance)) {
                //return instance;
            }
        });
        return null;
    }
}
