package com.lfj.springbootsecurity.decoratorpattern;

/**
 * 最核心、最原始、最基本的接口或抽象类
 *
 * @author lfj
 * @date 2020/10/28 10:27
 */
public interface SchoolReport {

    /**
     *  展示学生成绩
     */
    void showReport();

    /**
     *  家长签字
     */
    void sign(String name);

}
