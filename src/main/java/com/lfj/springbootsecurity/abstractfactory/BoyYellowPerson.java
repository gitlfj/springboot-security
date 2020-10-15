package com.lfj.springbootsecurity.abstractfactory;

/**
 * 男黄种人
 *
 * @author lfj
 * @date 2020/10/10 15:56
 */
public class BoyYellowPerson extends AbstractYellowPerson {

    @Override
    public void sex() {
        System.out.println("我是黄种人性别是：男生");
    }

}
