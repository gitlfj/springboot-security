package com.lfj.springbootsecurity.prototypepattern;

import java.util.Date;

/**
 * 需要创建的原型对象
 *
 * @author lfj
 * @date 2020/12/7 15:04
 */
public class CreatePrototype implements IPrototype<CreatePrototype>{

    private String name;

    private int age;

    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 克隆方法
     *
     * @return 返回原型对象
     */
    @Override
    public CreatePrototype clone() {
        CreatePrototype createPrototype = new CreatePrototype();
        createPrototype.setName(this.name);
        createPrototype.setAge(this.age);
        createPrototype.setBirthday(this.birthday);
        return createPrototype;
    }

    @Override
    public String toString() {
        return "CreatePrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
