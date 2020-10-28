package com.lfj.springbootsecurity.abstractfactory;

/**
 * 创建老虎工厂
 *
 * @author lfj
 * @date 2020/10/15 15:51
 */
public class TigerFactory implements IFactory {
    /**
     * 创建人工厂
     *
     * @param clazz class
     * @return person
     */
    @Override
    public IPerson createPerson(Class<? extends IPerson> clazz) {
        return null;
    }

    /**
     * 创建老虎工厂
     *
     * @param clazz class
     * @return person
     */
    @Override
    public ITiger createTiger(Class<? extends ITiger> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
