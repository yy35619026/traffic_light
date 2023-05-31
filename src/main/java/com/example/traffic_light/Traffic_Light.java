package com.example.traffic_light;

import java.awt.*;


public class Traffic_Light {

    Traffic_Light_Controller traffic_light_controller = new Traffic_Light_Controller();

    public void changeLight(String lane,boolean bool,String color){

        traffic_light_controller.demermine_state(bool);

        if(lane =="vertical"  && bool == true && color=="Red"){

//            traffic_light.changeLight("Green");
            System.out.format("\033[0;31m更改--東西向車道--紅燈\033[0m%n");
            System.out.format("\033[0;31m延長紅燈--東西向車道--紅燈時間20秒\033[0m%n");


            System.out.format("\33[0;32m更改--南北向車道--綠燈\33[0m%n");
            System.out.format("\33[0;32m延長--南北向車道--綠燈時間20秒\33[0m%n");

        }else if(lane =="parallel"  && bool == true && color=="Red"){

//            traffic_light.changeLight("Green");
            System.out.format("\033[0;31m更改--南北向車道--紅燈\033[0m%n");
            System.out.format("\033[0;31m延長紅燈--南北向車道--紅燈時間20秒\033[0m%n");

            System.out.format("\33[0;32m更改--東西向車道--綠燈\33[0m%n");
            System.out.format("\33[0;32m延長--東西向車道--綠燈時間20秒\33[0m%n");

        }else if (lane =="vertical"  && bool == true && color=="Green"){

            System.out.format("\33[0;32m延長--南北向車道--綠燈時間20秒\33[0m%n");

        }else if(lane =="parallel"  && bool == true && color=="Green"){
            System.out.format("\33[0;32m延長--東西向車道--綠燈時間20秒\33[0m%n");
        }else {
            System.out.println("無緊急車輛通過,東西南北向燈號皆維持不變");
        }
    }
}
