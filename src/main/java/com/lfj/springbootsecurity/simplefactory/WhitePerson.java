package com.lfj.springbootsecurity.simplefactory;

/**
 * 白色人类
 *
 * @author lfj
 * @date 2020/10/10 9:43
 */
public class WhitePerson implements Person {
    @Override
    public void type() {
        System.out.println("白人");
    }

    @Override
    public void cry() {
        System.out.println("白色人类会哭");
    }

    @Override
    public void talk() {
        System.out.println("say English");
    }
}
