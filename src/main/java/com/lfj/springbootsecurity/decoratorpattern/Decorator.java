package com.lfj.springbootsecurity.decoratorpattern;

/**
 * 装饰类，我要把我的成绩单装饰一下
 *
 * @author lfj
 * @date 2020/10/28 11:34
 */
public abstract class Decorator implements SchoolReport{


    private SchoolReport schoolReport;


    Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }


    @Override
    public void showReport() {
        schoolReport.showReport();
    }


    @Override
    public void sign(String name) {
        schoolReport.sign(name);
    }

}
