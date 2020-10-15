package com.lfj.springbootsecurity.proxypattern;

/**
 * 王婆，代理对象
 *
 * @author lfj
 * @date 2020/10/14 10:40
 */
public class WangPoProxy implements Women{

    /**
     *  代理对象
     */
    private Women women;

    /**
     *  默认代理类是潘金莲
     */
    public WangPoProxy() {
        this.women = new PanJinLian();
    }

    /**
     *  传参数代理对象
     * @param women
     */
    public WangPoProxy(Women women) {
        this.women = women;
    }

    /**
     * 做羞羞的事情
     */
    @Override
    public void makeLove() {
        // 自己搞不动了，早别人
        women.makeLove();
    }

    /**
     * 勾引男人
     */
    @Override
    public void makeEyesWithMan() {
        // 自己搞不动了，早别人
        women.makeEyesWithMan();
    }

}
