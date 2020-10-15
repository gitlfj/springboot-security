package com.lfj.springbootsecurity.adapterpattern;

import org.springframework.lang.NonNull;

/**
 * 默认播放MP3
 *
 * @author lfj
 * @date 2020/10/14 14:36
 */
public class AudioPlayer implements MediaPlayer {

    private static final String DEFAULT = "mp3";

    private MediaAdapter mediaAdapter;

    AudioPlayer() {
    }


    AudioPlayer(MediaAdapter mediaAdapter) {
        this.mediaAdapter = mediaAdapter;
    }

    /**
     * 播放接口
     *
     * @param audioType 文件类型
     * @param fileName  文件名称
     */
    @Override
    public void play(@NonNull String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if(DEFAULT.equals(audioType)) {
            System.out.println("Playing mp3 fileName: "+ fileName);
            return;
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        try {
            mediaAdapter.play(audioType, fileName);
        } catch (Exception e) {
            System.out.println("找不到的类型： "+ fileName);
        }
    }

}
