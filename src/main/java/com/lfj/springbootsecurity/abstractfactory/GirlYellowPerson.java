package com.lfj.springbootsecurity.abstractfactory;

/**
 * 女黄种人
 *
 * @author lfj
 * @date 2020/10/10 15:58
 */
public class GirlYellowPerson extends AbstractYellowPerson{


    @Override
    public void sex() {
        System.out.println("我是黄种人性别是：女生");
    }

}
