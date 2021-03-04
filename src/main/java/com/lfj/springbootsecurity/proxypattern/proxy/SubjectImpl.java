package com.lfj.springbootsecurity.proxypattern.proxy;

/**
 * java 动态代理实现类
 *
 * @author lfj
 * @date 2020/10/30 15:32
 */
public class SubjectImpl implements Subject {

    @Override
    public void hello(String name) {
        System.out.println("Hello: " + name);
    }
}
