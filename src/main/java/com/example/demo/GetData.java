package com.example.demo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetData {
    private int trafficFlow;
    public GetData(){
        getEmergencyData();
        getData("East");
    }
    public void getEmergencyData(){
        System.out.println("File Loading...");

        System.out.println("Success");
    }
    public int getData(String lane){
        if (lane == "East"){
            System.out.println("File Loading...");

            System.out.println("Loading success！！！");
            //trafficFlow = 你抓取到的數值;
        }else if (lane == "West"){
            System.out.println("File Loading...");

            System.out.println("Loading success！！！");
            //trafficFlow = 你抓取到的數值;
        }else if (lane == "North"){
            System.out.println("File Loading...");

            System.out.println("Loading success！！！");
            //trafficFlow = 你抓取到的數值;
        }else if (lane == "South"){
            System.out.println("File Loading...");

            System.out.println("Loading success！！！");
            //trafficFlow = 你抓取到的數值;
        }
        return trafficFlow;
    }
}
