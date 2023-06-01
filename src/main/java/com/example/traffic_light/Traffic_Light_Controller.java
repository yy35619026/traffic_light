package com.example.traffic_light;


import java.awt.*;

public class Traffic_Light_Controller {

    private int light_time;

    Traffic_Light traffic_light = new Traffic_Light();
    Traffic_Light_time traffic_light_time = new Traffic_Light_time();
    public int getLight_time() {
        return light_time;
    }

    public Traffic_Light_Controller(){
        //這裡是 new Controller的流程要Controller做的事情都在這邊添加
//        new AI();
        boolean ar;
        traffic_light_time.restTime();
        ar = false; //模擬緊急車輛通過

        if(ar == false){
            //無緊急車輛通過就正常
            determine_Time("Vertical");
        }
        demermine_state("Vertical",ar,"Green");


    }

    public void demermine_state(String lane,boolean bool,String color){
        traffic_light.changeLight(lane,bool,color);
    }

//第二段貼這邊

    public void determine_Time(String lane){

        traffic_light_time.change_time(lane);

    }

    public void saveData(){
        System.out.println("SaveData is worked.");
    }
}
