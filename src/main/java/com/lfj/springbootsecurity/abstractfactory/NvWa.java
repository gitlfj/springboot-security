package com.lfj.springbootsecurity.abstractfactory;

/**
 * 我是女娲，负责造人
 *
 * @author lfj
 * @date 2020/10/10 16:11
 */
public class NvWa {

    public static void main(String[] args) {

        PersonFactory factory = new PersonFactory();

        IPerson person = factory.createPerson(BoyBlackPerson.class);
        person.sex();


        IPerson person1 = factory.createPerson(GirlBlackPerson.class);
        person1.sex();

    }

}
