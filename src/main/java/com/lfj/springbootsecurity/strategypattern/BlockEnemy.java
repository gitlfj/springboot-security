package com.lfj.springbootsecurity.strategypattern;

/**
 * 孙夫人断后，挡住追兵
 *
 * @author lfj
 * @date 2020/10/13 16:40
 */
public class BlockEnemy implements IStrategy {

    /**
     * 策略执行方法
     */
    @Override
    public void doOperation() {
        System.out.println("孙夫人断后，挡住追兵");
    }

}
