package com.csy.dubbo.provider;

/**
 * @author chensy
 * @date 2019-04-29 08:07
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "provider" + name;
    }
}