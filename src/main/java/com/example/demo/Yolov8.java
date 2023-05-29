package com.example.demo;

public class Yolov8 {
    protected int trafficFlow;
    protected int getData(String lane){
        if (lane == "East"){
            System.out.println("File of East Loading...");

            System.out.println("Loading success！！！");
            //trafficFlow = 你抓取到的數值;
        }else if (lane == "West"){
            System.out.println("File of West Loading...");

            System.out.println("Loading success！！！");
            //trafficFlow = 你抓取到的數值;
        }else if (lane == "North"){
            System.out.println("File of North Loading...");

            System.out.println("Loading success！！！");
            //trafficFlow = 你抓取到的數值;
        }else if (lane == "South"){
            System.out.println("File of South Loading...");

            System.out.println("Loading success！！！");
            //trafficFlow = 你抓取到的數值;
        }
        return trafficFlow;
    }
}
