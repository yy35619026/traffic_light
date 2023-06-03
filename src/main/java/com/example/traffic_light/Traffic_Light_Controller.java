package com.example.traffic_light;
import com.example.database.*;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Scanner;

public class Traffic_Light_Controller {
    AI ai = new AI();
    Traffic_Light traffic_light = new Traffic_Light();
    Traffic_Light_time traffic_light_time = new Traffic_Light_time();
    private int light_time;
    private String lane;
    public int getLight_time() {
        return light_time;
    }



    public Traffic_Light_Controller() {
        lane = ai.compareVerticalTrafficFlow();

        boolean emergency;
        traffic_light_time.restTime();
        emergency = ai.getEmergencyVehicle(); //模擬緊急車輛通過

        if(emergency == false){
            //無緊急車輛通過就正常
            determineTime(Traffic_Light_time.LaneType.valueOf(lane));
        }
        demermineState("Parallel", emergency, "Green");
    }


    public void demermineState(String lane,boolean bool,String color){
        traffic_light.changeLight(lane,bool,color);
    }

//第二段貼這邊

    public void determineTime(Traffic_Light_time.LaneType lane){
        traffic_light_time.changeTime(lane);
    }

    public void saveData(){
        System.out.println("SaveData is worked.");
    }
}
