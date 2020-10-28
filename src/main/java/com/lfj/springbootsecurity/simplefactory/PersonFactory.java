package com.lfj.springbootsecurity.simplefactory;

/**
 * 造人工厂
 *
 * @author lfj
 * @date 2020/10/10 9:58
 */
class PersonFactory {

    /**
     * 创建实例方法
     * @param clazz 需要创建的Class对象
     * @return Person
     */
    static Person createPerson(Class<? extends Person> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误！");
        }
        return null;
    }

}
