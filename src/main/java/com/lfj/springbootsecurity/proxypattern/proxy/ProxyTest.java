package com.lfj.springbootsecurity.proxypattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 测试类
 *
 * @author lfj
 * @date 2020/10/30 16:09
 */
public class ProxyTest {

    public static void main(String[] args) {
        //没有代理
        Subject subject = new SubjectImpl();
        subject.hello("1212");

        System.out.println();

        //使用代理模式
        Subject subject1 = new SubjectImpl();
        InvocationHandler subjectProxy = new SubjectProxy(subject1);
        Subject instance = (Subject) Proxy.newProxyInstance(
                subjectProxy.getClass().getClassLoader(),
                subject1.getClass().getInterfaces(),
                subjectProxy);
        instance.hello("2323");


    }

}
