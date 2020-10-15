package com.lfj.springbootsecurity.abstractfactory;

/**
 * 人接口类
 *
 * @author lfj
 * @date 2020/10/10 14:57
 */
public interface IPerson {

    /**
     * 姓名
     * @param name 姓名
     */
    void name(String name);

    /**
     * 年龄
     * @param age 年龄
     */
    void age(Integer age);

    /**
     * 性别
     */
    void sex();

    /**
     * 国家
     * @param countryName 国家名字
     */
    void country(String countryName);
}
