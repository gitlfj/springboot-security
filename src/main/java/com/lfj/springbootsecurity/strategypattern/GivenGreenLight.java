package com.lfj.springbootsecurity.strategypattern;

/**
 * 求吴国太开个绿灯
 *
 * @author lfj
 * @date 2020/10/13 16:39
 */
public class GivenGreenLight implements IStrategy {

    /**
     * 策略执行方法
     */
    @Override
    public void doOperation() {
        System.out.println("求吴国太开个绿灯,放行！");
    }

}
