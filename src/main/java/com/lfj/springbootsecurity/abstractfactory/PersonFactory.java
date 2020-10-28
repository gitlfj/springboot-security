package com.lfj.springbootsecurity.abstractfactory;

/**
 * 创建男生
 *
 * @author lfj
 * @date 2020/10/10 16:16
 */
public class PersonFactory implements IFactory {


    /**
     * 创建人工厂
     *
     * @param clazz class
     * @return person
     */
    @Override
    public IPerson createPerson(Class<? extends IPerson> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 创建老虎工厂
     *
     * @param clazz class
     * @return person
     */
    @Override
    public ITiger createTiger(Class<? extends ITiger> clazz) {
        return null;
    }
}
