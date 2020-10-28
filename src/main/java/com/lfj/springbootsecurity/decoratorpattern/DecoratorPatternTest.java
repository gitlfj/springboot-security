package com.lfj.springbootsecurity.decoratorpattern;

/**
 * 装饰器模式:
 *  装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 *  这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
 *  我们通过下面的实例来演示装饰器模式的用法。其中，我们将把一个形状装饰上不同的颜色，同时又不改变形状类。
 *
 * 介绍:
     * 意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
     * 主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
     * 何时使用：在不想增加很多子类的情况下扩展类。
     * 如何解决：将具体功能职责划分，同时继承装饰者模式。
     * 关键代码： 1、Component 类充当抽象角色，不应该具体实现。 2、修饰类引用和继承 Component 类，具体扩展类重写父类方法。
     * 应用实例： 1、孙悟空有 72 变，当他变成"庙宇"后，他的根本还是一只猴子，但是他又有了庙宇的功能。 2、不论一幅画有没有画框都可以挂在墙上，但是通常都是有画框的，并且实际上是画框被挂在墙上。在挂在墙上之前，画可以被蒙上玻璃，装到框子里；这时画、玻璃和画框形成了一个物体。
     * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
     * 缺点：多层装饰比较复杂。
     * 使用场景： 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
     * 注意事项：可代替继承。
 *
 * @author lfj
 * @date 2020/10/28 9:57
 */
public class DecoratorPatternTest {

    public static void main(String[] args) {
        // 没有装饰
        SchoolReport schoolReport = new SchoolReportImpl();
        schoolReport.showReport();
        schoolReport.sign("不签");

        // 通过继承方式装饰后
        SchoolReport schoolReport1 = new SugarFouthGradeSchoolReport();
        schoolReport1.showReport();
        schoolReport1.sign("签");


        System.out.println("\n");

        // 通过装饰器模式装饰
        //成绩单拿过来
        SchoolReport sr = new SchoolReportImpl();
        //加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        //又加了成绩排名的说明
        sr = new SortDecorator(sr);
        //看成绩单
        sr.showReport();
        //然后老爸，一看，很开心，就签名了
        sr.sign("老三签字！");


    }

}
