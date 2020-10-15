package com.lfj.springbootsecurity.simplefactory;

/**
 * 造人工厂
 *
 * @author lfj
 * @date 2020/10/10 9:58
 */
public class PersonFactory {

    public static Person createPerson(Class clazz) {
        try {
            Person person = (Person) Class.forName(clazz.getName()).newInstance();
            return person;
        } catch (InstantiationException e) {
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误！");
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人类找不到！");
        }
        return null;
    }

}
