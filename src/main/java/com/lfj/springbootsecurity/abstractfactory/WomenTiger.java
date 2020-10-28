package com.lfj.springbootsecurity.abstractfactory;

/**
 * 母老虎
 *
 * @author lfj
 * @date 2020/10/15 15:39
 */
public class WomenTiger implements ITiger {

    /**
     * 老虎
     */
    @Override
    public void info() {
        System.out.println("我是母老虎");
    }
}
