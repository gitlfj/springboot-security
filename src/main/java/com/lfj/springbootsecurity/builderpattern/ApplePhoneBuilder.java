package com.lfj.springbootsecurity.builderpattern;

/**
 * apple手机构建类
 *
 * @author lfj
 * @date 2020/12/8 11:38
 */
public class ApplePhoneBuilder {

    private Iphone iphone = new Iphone();

    public ApplePhoneBuilder addCpu(String cpu) {
        iphone.setCpu(cpu);
        return this;
    }

    public ApplePhoneBuilder addRam(String ram) {
        iphone.setRam(ram);
        return this;
    }

    public ApplePhoneBuilder addRom(String rom) {
        iphone.setRom(rom);
        return this;
    }

    public ApplePhoneBuilder addBatterySize(Integer batterySize) {
        iphone.setBatterySize(batterySize);
        return this;
    }

    public ApplePhoneBuilder addScreenSize(float screenSize) {
        iphone.setScreenSize(screenSize);
        return this;
    }

    public ApplePhoneBuilder addWeight(Integer weight) {
        iphone.setWeight(weight);
        return this;
    }

    public ApplePhoneBuilder addSystemVersion(String systemVersion) {
        iphone.setSystemVersion(systemVersion);
        return this;
    }

    public ApplePhoneBuilder addCameraNum(Integer cameraNum) {
        iphone.setCameraNum(cameraNum);
        return this;
    }

    public ApplePhoneBuilder addYear(Integer year) {
        iphone.setYear(year);
        return this;
    }


    public Iphone builder() {
        return this.iphone;
    }


}
