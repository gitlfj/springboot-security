package com.lfj.springbootsecurity.decoratorpattern;

/**
 * 我要把我学校的最高成绩告诉老爸
 *
 * @author lfj
 * @date 2020/10/28 11:36
 */
public class HighScoreDecorator extends Decorator {


    HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }


    private void reportHighScore() {
        System.out.println("学校数学最高为70， 语文最高：77， 英语最高为：70");
    }


    @Override
    public void showReport() {
        reportHighScore();
        super.showReport();
    }

}
