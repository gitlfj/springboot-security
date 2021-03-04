package com.lfj.springbootsecurity.builderpattern;

/**
 * iPhone 手机
 *
 * @author lfj
 * @date 2020/12/8 11:18
 */
public class Iphone {

    /**
     *  名称
     */
    private String name;

    /**
     *  cpu
     */
    private String cpu;

    /**
     *  运行内存
     */
    private String ram;

    /**
     *  机身内存
     */
    private String rom;

    /**
     *  电池大小
     */
    private int batterySize;

    /**
     *  屏幕大小
     */
    private float screenSize;

    /**
     *  重量
     */
    private int weight;

    /**
     *  系统版本
     */
    private String systemVersion;

    /**
     *  摄像头个数
     */
    private int cameraNum;

    /**
     *  生产年份
     */
    private Integer year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    public int getCameraNum() {
        return cameraNum;
    }

    public void setCameraNum(int cameraNum) {
        this.cameraNum = cameraNum;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
