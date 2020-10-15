package com.lfj.springbootsecurity.abstractfactory;

/**
 * 抽象黄种人
 *
 * @author lfj
 * @date 2020/10/10 15:03
 */
public abstract class AbstractYellowPerson implements IPerson {

    @Override
    public void name(String name) {
        System.out.println("我是黄种人姓名是：" + name);
    }

    @Override
    public void age(Integer age) {
        System.out.println("我是黄种人年龄是：" + age);
    }

    @Override
    public void country(String country) {
        System.out.println("我是黄种人国家是：" + country);
    }

}
