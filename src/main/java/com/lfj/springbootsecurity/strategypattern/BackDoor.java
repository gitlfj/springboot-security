package com.lfj.springbootsecurity.strategypattern;

/**
 * 找乔国老帮忙，使孙权不能杀刘备
 *
 * @author lfj
 * @date 2020/10/13 16:38
 */
public class BackDoor implements IStrategy{


    /**
     * 策略执行方法
     */
    @Override
    public void doOperation() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }

}
