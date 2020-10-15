package com.lfj.springbootsecurity.adapterpattern;

/**
 * 除了MP3以外的播放器
 *
 * @author lfj
 * @date 2020/10/14 15:49
 */
public interface OtherPlayer {

    /**
     *  播放
     * @param fileName 文件名称
     */
    void play(String fileName);

}
