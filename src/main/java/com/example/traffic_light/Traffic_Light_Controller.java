package com.example.traffic_light;

public class Traffic_Light_Controller {
    private int light_time;

    public Traffic_Light_Controller(){
        //這裡是 new Controller的流程要Controller做的事情都在這邊添加
        new AI();

        determine_Time();
        saveData();
        System.out.println("not good");

    }
//    public boolean demermine_state(){
//        //Sensor sensor
//    }
    public void determine_Time(){
        System.out.println("determine_Time is worked.");
    }
    public void saveData(){
        System.out.println("SaveData is worked.");
    }

}
