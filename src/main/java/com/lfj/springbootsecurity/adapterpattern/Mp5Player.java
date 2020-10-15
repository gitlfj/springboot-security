package com.lfj.springbootsecurity.adapterpattern;

/**
 * 播放MP5格式音频
 *
 * @author lfj
 * @date 2020/10/14 14:19
 */
public class Mp5Player implements OtherPlayer {

    /**
     * 播放MP5格式的
     *
     * @param fileName 文件名称
     */
    @Override
    public void play(String fileName) {
        System.out.println("播放MP5格式音频， fileName: "+ fileName);
    }

}
