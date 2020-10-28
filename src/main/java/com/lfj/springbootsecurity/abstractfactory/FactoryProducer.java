package com.lfj.springbootsecurity.abstractfactory;

/**
 * 获取工厂
 *
 * @author lfj
 * @date 2020/10/15 16:02
 */
class FactoryProducer {


    /**
     *  获取工厂
     * @param clazz 工厂Class对象
     * @return Factory
     */
    static IFactory getFactory(Class<? extends IFactory> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
