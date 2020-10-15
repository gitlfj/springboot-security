package com.lfj.springbootsecurity.simplefactory;

/**
 * 黑色人种
 *
 * @author lfj
 * @date 2020/10/10 9:45
 */
public class BlackPerson implements Person {
    @Override
    public void type() {
        System.out.println("黑色人种");
    }

    @Override
    public void cry() {
        System.out.println("黑色人种会哭");
    }

    @Override
    public void talk() {
        System.out.println("不知道说的什么");
    }
}
