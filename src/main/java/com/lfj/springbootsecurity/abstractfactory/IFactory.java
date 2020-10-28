package com.lfj.springbootsecurity.abstractfactory;

/**
 * 抽象工厂
 *
 * @author lfj
 * @date 2020/10/10 15:12
 */
public interface IFactory {

    /**
     * 创建人工厂
     * @param clazz class
     * @return person
     */
    IPerson createPerson(Class<? extends IPerson> clazz);


    /**
     * 创建老虎工厂
     * @param clazz class
     * @return person
     */
    ITiger createTiger(Class<? extends ITiger> clazz);

}
