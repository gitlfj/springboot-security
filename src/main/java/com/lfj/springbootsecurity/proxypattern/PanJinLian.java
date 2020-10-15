package com.lfj.springbootsecurity.proxypattern;

/**
 * 中国古代女子潘金莲
 *
 * @author lfj
 * @date 2020/10/14 10:37
 */
public class PanJinLian implements Women {

    /**
     * 做羞羞的事情
     */
    @Override
    public void makeLove() {
        System.out.println("潘金莲在做羞羞的事情！");
    }

    /**
     * 勾引男人
     */
    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲在勾引男人！");
    }

}
