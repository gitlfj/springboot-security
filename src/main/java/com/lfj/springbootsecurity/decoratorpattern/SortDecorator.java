package com.lfj.springbootsecurity.decoratorpattern;

/**
 * 学校排名的情况汇报
 *
 * @author lfj
 * @date 2020/10/28 11:38
 */
public class SortDecorator extends Decorator{

    SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void sortShow() {
        System.out.println("我在学校的排名是33名");
    }


    @Override
    public void showReport() {
        sortShow();
        super.showReport();
    }
}
