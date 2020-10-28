package com.lfj.springbootsecurity.decoratorpattern;

/**
 * 装饰接口实现类
 *
 * @author lfj
 * @date 2020/10/28 10:32
 */
public class SchoolReportImpl implements SchoolReport {

    /**
     * 展示学生成绩
     */
    @Override
    public void showReport() {
        System.out.println("学校：平川中学， 姓名：欧阳学聪， 成绩：数学：60， 语文： 66， 英语：50");

    }

    /**
     * 家长签字
     */
    @Override
    public void sign(String name) {
        System.out.println("家长签字为：" + name + "\n");
    }

}
