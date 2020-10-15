package com.lfj.springbootsecurity.abstractfactory;

/**
 * 黑种人
 *
 * @author lfj
 * @date 2020/10/10 16:02
 */
public abstract class AbstractBlackPerson implements IPerson{


    /**
     * 姓名
     *
     * @param name 姓名
     */
    @Override
    public void name(String name) {
        System.out.println("我是黑种人姓名是：" + name);
    }

    /**
     * 年龄
     *
     * @param age 年龄
     */
    @Override
    public void age(Integer age) {
        System.out.println("我是黑种人年龄是：" + age);
    }

    /**
     * 国家
     *
     * @param countryName 国家名字
     */
    @Override
    public void country(String countryName) {
        System.out.println("我是黑种人国家是：" + countryName);
    }
}
