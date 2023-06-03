package com.example.traffic_light;
import com.example.database.*;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Scanner;

public class Traffic_Light_Controller {

    private int light_time;
    private String lane;
    Traffic_Light traffic_light;
    Traffic_Light_time traffic_light_time;
    public int getLight_time() {
        return light_time;
    }



    public Traffic_Light_Controller(AI ai, Traffic_Light traffic_light, Traffic_Light_time traffic_light_time) {
        this.traffic_light = traffic_light;
        this.traffic_light_time = traffic_light_time;

        ai.compareSameLevelTrafficFlow();
        lane = ai.compareVerticalTrafficFlow();

        boolean emergency;
        traffic_light_time.restTime();
        emergency = false; //模擬緊急車輛通過

        if(emergency == false){
            //無緊急車輛通過就正常
            determine_Time(Traffic_Light_time.LaneType.valueOf(lane));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入目前紅綠燈信號為：");
        String signal = sc.nextLine();
        demermine_state(lane, emergency, signal);
    }


    public void demermine_state(String lane,boolean bool,String color){
        traffic_light.changeLight(lane,bool,color);
    }

//第二段貼這邊

    public void determine_Time(Traffic_Light_time.LaneType lane){
        traffic_light_time.change_time(lane);
    }

    public void saveData(){
        System.out.println("SaveData is worked.");
    }
}
