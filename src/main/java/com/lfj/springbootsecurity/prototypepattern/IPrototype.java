package com.lfj.springbootsecurity.prototypepattern;

/**
 * 原型模式接口
 *
 * @author lfj
 * @date 2020/12/7 14:53
 */
public interface IPrototype<T> {

    /**
     *  克隆方法
     * @return 返回原型对象
     */
    T clone();

}
