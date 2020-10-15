package com.lfj.springbootsecurity.adapterpattern;

/**
 * 播放VLC格式音频
 *
 * @author lfj
 * @date 2020/10/14 14:19
 */
public class VlcPlayer implements OtherPlayer {

    /**
     * 播放VLC格式的
     *
     * @param fileName 文件名称
     */
    @Override
    public void play(String fileName) {
        System.out.println("播放VLC格式音频， fileName: "+ fileName);
    }

}
