package com.lfj.springbootsecurity.builderpattern;

/**
 * 建造者模式:
 *
 *
 *
 * @author lfj
 * @date 2020/12/8 11:15
 */
public class BuilderTest {


    public static void main(String[] args) {

        ApplePhoneBuilder applePhoneBuilder = new ApplePhoneBuilder();
        applePhoneBuilder
                .addCpu("A14")
                .addRam("6G")
                .addRom("128G")
                .addBatterySize(2299)
                .addCameraNum(2)
                .addWeight(162)
                .addSystemVersion("IOS 13")
                .addScreenSize(6.2f)
                .addYear(2020);

        Iphone builder = applePhoneBuilder.builder();
        builder.setName("iPhone 12 128G版本");

        System.out.println(builder);


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sdf").append("sor").append(1).append(34.66).append(true);

        System.out.println(stringBuilder.toString());


    }

}
