package com.lfj.springbootsecurity.adapterpattern;

/**
 * 播放MP4格式音频
 *
 * @author lfj
 * @date 2020/10/14 14:20
 */
public class Mp4Player implements OtherPlayer {

    /**
     * 播放MP4格式的
     *
     * @param fileName 文件名称
     */
    @Override
    public void play(String fileName) {
        System.out.println("播放MP4格式音频， fileName: "+ fileName);
    }

}
