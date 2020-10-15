package com.lfj.springbootsecurity.abstractfactory;

/**
 * 黑色女生
 *
 * @author lfj
 * @date 2020/10/10 16:09
 */
public class GirlBlackPerson extends AbstractBlackPerson {
    /**
     * 性别
     */
    @Override
    public void sex() {
        System.out.println("我是黑种人性别是：女生");
    }

}
