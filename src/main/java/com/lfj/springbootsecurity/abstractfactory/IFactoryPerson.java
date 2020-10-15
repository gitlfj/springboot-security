package com.lfj.springbootsecurity.abstractfactory;

/**
 * 抽象工厂
 *
 * @author lfj
 * @date 2020/10/10 15:12
 */
public interface IFactoryPerson {

    /**
     * 创建方法
     * @param calzz class
     * @return person
     */
    IPerson createPerson(Class calzz);

}
