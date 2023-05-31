package com.example.traffic_light;


import java.awt.*;

public class Traffic_Light_Controller {

    private int light_time;
    public int getLight_time() {
        return light_time;
    }

    public Traffic_Light_Controller(){
        //這裡是 new Controller的流程要Controller做的事情都在這邊添加
        new AI();

        demermine_state("vertical",true,"Red");
        determine_Time("vertical");//南北向測試
        saveData();
    }
    public void demermine_state(String lane,boolean bool,String color){

//        Traffic_Light traffic_light = new Traffic_Light(color);

        if(lane =="vertical"  && bool == true && color=="Red"){

//            traffic_light.changeLight("Green");
            System.out.format("\033[0;31m更改--東西向車道--紅燈\033[0m%n");
            System.out.format("\033[0;31m延長紅燈--東西向車道--紅燈時間20秒\033[0m%n");


            System.out.format("\33[0;32m更改--南北向車道--綠燈\33[0m%n");
            System.out.format("\33[0;32m延長--南北向車道--綠燈時間20秒\33[0m%n");

        }else if(lane =="parallel"  && bool == true && color=="Red"){

//            traffic_light.changeLight("Green");
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

//第二段貼這邊
    public void determine_Time(String lane){

        if(lane == "vertical"){
            System.out.format("\33[0;32m增加下次--南北向車道--綠燈時間15秒\33[0m%n");
            System.out.format("\033[0;31m增加下次--東西向車道--紅燈時間15秒\033[0m%n");
        }else if(lane == "parallel"){
            System.out.format("\33[0;32m增加下次--東西向車道--綠燈時間15秒\33[0m%n");
            System.out.format("\033[0;31m增加下次--南北向車道--紅燈時間15秒\033[0m%n");
        }else{
            System.out.println("東西南北向燈號皆維持不變");
        }

        System.out.println("determine_Time is worked.");
    }


    public void saveData(){
        System.out.println("SaveData is worked.");
    }

}
