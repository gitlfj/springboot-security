package com.lfj.springbootsecurity.abstractfactory;

/**
 * 我是大老虎
 *
 * @author lfj
 * @date 2020/10/15 15:38
 */
public class BigTiger implements ITiger {

    /**
     * 老虎
     */
    @Override
    public void info() {
        System.out.println("我是大老虎！");
    }

}
