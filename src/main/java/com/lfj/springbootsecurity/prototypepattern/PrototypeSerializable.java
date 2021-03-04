package com.lfj.springbootsecurity.prototypepattern;

import java.io.*;
import java.util.List;

/**
 * 序列号的方式实现深度克隆
 *
 * @author lfj
 * @date 2020/12/7 16:14
 */
public class PrototypeSerializable implements Cloneable, Serializable {


    private String name;

    private Integer age;

    private List<String> hobbies;


    @Override
    protected PrototypeCloneable clone() throws CloneNotSupportedException {
        return (PrototypeCloneable) super.clone();
    }


    /**
     * 使用序列化的方式深度克隆对象
     * @return 返回克隆的对象
     */
    public PrototypeSerializable deepClone() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectOutputStream1 = new ObjectInputStream(byteArrayInputStream);

            return (PrototypeSerializable) objectOutputStream1.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
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

    @Override
    public String toString() {
        return "PrototypeCloneable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }

}
