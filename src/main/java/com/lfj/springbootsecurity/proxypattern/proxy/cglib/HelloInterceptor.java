package com.lfj.springbootsecurity.proxypattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理类
 *
 * @author lfj
 * @date 2020/10/30 16:57
 */
public class HelloInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin time -----> "+ System.currentTimeMillis());
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("end time -----> "+ System.currentTimeMillis());
        return o1;
    }
}
