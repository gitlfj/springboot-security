package com.lfj.springbootsecurity.abstractfactory;

/**
 * 小老虎
 *
 * @author lfj
 * @date 2020/10/15 15:39
 */
public class MiniTiger implements ITiger {

    /**
     * 老虎
     */
    @Override
    public void info() {
        System.out.println("我是小老虎！");
    }

}
