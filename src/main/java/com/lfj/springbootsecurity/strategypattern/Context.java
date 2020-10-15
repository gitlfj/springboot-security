package com.lfj.springbootsecurity.strategypattern;

/**
 * 策略执行中心
 *
 * @author lfj
 * @date 2020/10/13 16:41
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operation() {
        strategy.doOperation();
    }

}
