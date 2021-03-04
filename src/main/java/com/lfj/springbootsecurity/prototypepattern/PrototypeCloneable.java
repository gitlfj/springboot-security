package com.lfj.springbootsecurity.prototypepattern;

import java.util.List;

/**
 * 基于Cloneable接口克隆对象
 *
 * @author lfj
 * @date 2020/12/7 15:38
 */
public class PrototypeCloneable implements Cloneable{


    private String name;

    private Integer age;

    private List<String> hobbies;


    @Override
    protected PrototypeCloneable clone() throws CloneNotSupportedException {
        return (PrototypeCloneable) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

//    @Override
//    public String toString() {
//        return "PrototypeCloneable{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", hobbies=" + hobbies +
//                '}';
//    }
}
