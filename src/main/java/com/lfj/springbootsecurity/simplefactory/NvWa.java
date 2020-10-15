package com.lfj.springbootsecurity.simplefactory;

/**
 * 女娲造人
 *
 * @author lfj
 * @date 2020/10/10 9:47
 */
public class NvWa {


    public static void main(String[] args) {
        Person person = PersonFactory.createPerson(YellowPerson.class);
        assert person != null;
        person.cry();
        person.type();
        person.talk();


        System.out.println("==============================================");



        Person person1 = PersonFactory.createPerson(WhitePerson.class);
        assert person1 != null;
        person1.cry();
        person1.type();
        person1.talk();


        System.out.println("==============================================");


        Person person2 = PersonFactory.createPerson(BlackPerson.class);
        assert person2 != null;
        person2.cry();
        person2.type();
        person2.talk();



    }

}
