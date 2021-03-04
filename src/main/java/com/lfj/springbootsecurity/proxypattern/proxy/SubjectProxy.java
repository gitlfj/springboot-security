package com.lfj.springbootsecurity.proxypattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类，实现了InvocationHandler类
 *
 * @author lfj
 * @date 2020/10/30 16:12
 */
public class SubjectProxy implements InvocationHandler {

    private Subject subject;

    SubjectProxy(Subject subject) {
        this.subject = subject;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前预处理。。。");
        Object invoke = method.invoke(subject, args);
        System.out.println("调用后处理。。。");
        return invoke;
    }


}
