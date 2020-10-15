package com.lfj.springbootsecurity.simplefactory;

/**
 * 黄色人种
 *
 * @author lfj
 * @date 2020/10/10 9:42
 */
public class YellowPerson implements Person {

    @Override
    public void type() {
        System.out.println("黄色人种");
    }

    @Override
    public void cry() {
        System.out.println("黄色人种会哭");
    }

    @Override
    public void talk() {
        System.out.println("说的中国话");
    }
}
