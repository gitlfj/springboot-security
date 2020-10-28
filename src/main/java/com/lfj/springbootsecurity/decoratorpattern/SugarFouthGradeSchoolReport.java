package com.lfj.springbootsecurity.decoratorpattern;

/**
 * 对这个成绩单进行美化
 *
 * @author lfj
 * @date 2020/10/28 10:57
 */
public class SugarFouthGradeSchoolReport extends SchoolReportImpl{


    /**
     *  首先要定义你要美化的方法，先给老爸说学校最高成绩
     */
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    /**
     *  在老爸看完毕成绩单后，我再汇报学校的排名情况
     */
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }


    /**
     *  由于汇报的内容已经发生变更，那所以要重写父类
     */
    @Override
    public void showReport() {
        reportHighScore();
        super.showReport();
        reportSort();

    }


}
