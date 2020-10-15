package com.lfj.springbootsecurity.abstractfactory;

/**
 * 创建男生
 *
 * @author lfj
 * @date 2020/10/10 16:16
 */
public class PersonFactory implements IFactoryPerson {

    /**
     * 创建方法
     *
     * @return person
     */
    @Override
    public IPerson createPerson(Class calzz) {
        try {
            IPerson o = (IPerson) Class.forName(calzz.getName()).newInstance();
            return o;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
