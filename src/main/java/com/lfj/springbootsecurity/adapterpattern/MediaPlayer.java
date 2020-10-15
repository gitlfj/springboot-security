package com.lfj.springbootsecurity.adapterpattern;

/**
 * 默认播放MP3格式的接口
 *
 * @author lfj
 * @date 2020/10/14 13:57
 */
public interface MediaPlayer {

    /**
     *  播放接口
     * @param audioType 文件类型
     * @param fileName 文件名称
     */
    void play(String audioType, String fileName);

}
