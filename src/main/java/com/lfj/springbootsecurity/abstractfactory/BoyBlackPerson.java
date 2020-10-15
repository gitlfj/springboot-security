package com.lfj.springbootsecurity.abstractfactory;

/**
 * 男黑种人
 *
 * @author lfj
 * @date 2020/10/10 16:05
 */
public class BoyBlackPerson extends AbstractBlackPerson {
    /**
     * 性别
     */
    @Override
    public void sex() {
        System.out.println("我是黑种人性别是：男生");
    }

}
