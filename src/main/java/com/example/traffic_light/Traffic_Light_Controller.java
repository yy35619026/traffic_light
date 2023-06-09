package com.example.traffic_light;
import com.example.database.*;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Scanner;

public class Traffic_Light_Controller {
    AI ai = new AI();
    Traffic_Light traffic_light = new Traffic_Light(new Traffic_Light_time());
    Traffic_Light_time traffic_light_time = new Traffic_Light_time();
    private int light_time;
    private String lane;
    private boolean emergency;
    public int getLight_time() {
        return light_time;
    }



    public Traffic_Light_Controller() {
        traffic_light_time.restTime();
        emergency = ai.getEmergencyVehicle(); //模擬緊急車輛通過
        if (emergency == true){
            lane = ai.getLane();
//            System.out.println(lane);
            demermineState(lane, emergency, "Red");
        }else{
            lane = ai.compareVerticalTrafficFlow();
            determineTime(Traffic_Light_time.LaneType.valueOf(lane));
        }
    }


    public void demermineState(String lane,boolean bool,String color){
        traffic_light.changeLight(lane,bool,color);
    }

//第二段貼這邊

    public void determineTime(Traffic_Light_time.LaneType lane){
        traffic_light_time.changeTime(lane);
    }

    public void saveData(){
        Lane_East lane_east = new Lane_East();
        lane_east.setTrafficflowEast(100);

    }
}
