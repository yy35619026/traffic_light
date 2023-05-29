package com.example.demo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//這個Class是抓取靜態數據
public class GetData {
    private int trafficFlow;
    public GetData(){
        Yolov8 yolo = new Yolov8();
        getEmergencyData();
        yolo.getData("East");
        yolo.getData("West");
        yolo.getData("North");
        yolo.getData("South");
    }
    public void getEmergencyData(){
        System.out.println("File Loading...");

        System.out.println("Success");
    }
//    public int getData(String lane){
//        if (lane == "East"){
//            System.out.println("File Loading...");
//
//            System.out.println("Loading success！！！");
//            //trafficFlow = 你抓取到的數值;
//        }else if (lane == "West"){
//            System.out.println("File Loading...");
//
//            System.out.println("Loading success！！！");
//            //trafficFlow = 你抓取到的數值;
//        }else if (lane == "North"){
//            System.out.println("File Loading...");
//
//            System.out.println("Loading success！！！");
//            //trafficFlow = 你抓取到的數值;
//        }else if (lane == "South"){
//            System.out.println("File Loading...");
//
//            System.out.println("Loading success！！！");
//            //trafficFlow = 你抓取到的數值;
//        }
//        return trafficFlow;
//    }
}
