package com.lfj.springbootsecurity.proxypattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * 测试类
 *
 * @author lfj
 * @date 2020/10/30 16:58
 */
public class Test {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CGsubject.class);
        enhancer.setCallback(new HelloInterceptor());
        CGsubject cGsubject = (CGsubject) enhancer.create();
        cGsubject.sayHello();
    }

}
