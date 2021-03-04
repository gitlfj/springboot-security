package com.lfj.springbootsecurity.prototypepattern;

import java.util.Arrays;
import java.util.Date;

/**
 * 原型模式：
 *  原型模式的核心在于拷贝原型对象，以系统中已经存在的一个对象为原型，直接基于内存二进制流的方式进行拷贝，无需在经历耗时的对象初始化过程
 *  （不用调用构造函数）， 性能提升很多。
 *
 *  适用场景：
 *    1.类初始化消耗资源较多
 *    2.new 产生一个对象需要非常繁琐的过程（数据准备，权限控制）
 *    3.构造函数比较复杂
 *    4.循环体中生产大量对象时
 *
 *   例如：
 *      1. spring中的bean的原型模式
 *      2. JSON.parseObject()
 * @author lfj
 * @date 2020/12/7 14:39
 */
public class PrototypeTest {


    public static void main(String[] args) throws Exception {

        //==============自己实现的clone==================
        CreatePrototype createPrototype = new CreatePrototype();
        createPrototype.setName("欧阳学聪");
        createPrototype.setAge(18);
        createPrototype.setBirthday(new Date());
        System.out.println("createPrototype = " + createPrototype);

        CreatePrototype clone = createPrototype.clone();
        System.out.println("clone = " + clone);


        //====================Cloneable接口实现克隆=======浅克隆=======

        PrototypeCloneable prototypeCloneable = new PrototypeCloneable();
        prototypeCloneable.setAge(18);
        prototypeCloneable.setName("欧阳学聪");
        prototypeCloneable.setHobbies(Arrays.asList("跳舞", "打篮球"));
        System.out.println("prototypeCloneable = " + prototypeCloneable);

        PrototypeCloneable clone1 = prototypeCloneable.clone();
//        clone1.getHobbies().add("吃饭");
        System.out.println("clone1 = " + clone1);

        //===========================基于序列化接口进行的深度克隆=================================
        PrototypeSerializable prototypeSerializable = new PrototypeSerializable();
        prototypeSerializable.setName("欧亚超市");
        prototypeSerializable.setAge(34);
        prototypeSerializable.setHobbies(Arrays.asList("swad", "wesr"));
        System.out.println("prototypeSerializable = " + prototypeSerializable);

        PrototypeSerializable prototypeSerializable1 = prototypeSerializable.deepClone();
        System.out.println("prototypeSerializable1 = " + prototypeSerializable1);


    }


}
