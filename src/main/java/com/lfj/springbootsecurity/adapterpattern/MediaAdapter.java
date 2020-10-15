package com.lfj.springbootsecurity.adapterpattern;

/**
 * 播放器适配器
 *
 * @author lfj
 * @date 2020/10/14 14:32
 */
public class MediaAdapter implements MediaPlayer {

    private OtherPlayer otherPlayer;


    MediaAdapter(Class<? extends OtherPlayer> clazz) {
        try {
            this.otherPlayer = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    /**
     * 播放接口
     *
     * @param audioType 文件类型
     * @param fileName  文件名称
     */
    @Override
    public void play(String audioType, String fileName) {
        otherPlayer.play(fileName);
    }

}
