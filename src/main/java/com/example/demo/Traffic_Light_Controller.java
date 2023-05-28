package com.example.demo;

import java.awt.*;

public class Traffic_Light_Controller {
    private int light_time;
    public Traffic_Light_Controller(){
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
