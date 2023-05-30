package com.example.traffic_light;
import java.io.*;
import java.util.Scanner;
//這個Class是抓取靜態數據
public class GetData {
    private BufferedReader reader;
    private int trafficFlow;
    private int[] csvValues;
    public GetData(String filePath){
        csvValues = new int[4];

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            int count = 0;

            while ((line = reader.readLine()) != null && count < 4) {
                String[] values = line.split(",");
                storeCsvValue(values[33], count);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void getEmergencyData(){
        System.out.println("File Loading...");

        System.out.println("Success");
    }
    public int getData(String lane){
        switch (lane) {
            case "East":
                System.out.println("Loading traffic flow data for East lane...");
                trafficFlow = csvValues[0];
                break;
            case "West":
                System.out.println("Loading traffic flow data for West lane...");
                trafficFlow = csvValues[1];
                break;
            case "North":
                System.out.println("Loading traffic flow data for North lane...");
                trafficFlow = csvValues[2];
                break;
            case "South":
                System.out.println("Loading traffic flow data for South lane...");
                trafficFlow = csvValues[3];
                break;
            default:
                System.out.println("Invalid lane specified.");
        }
        System.out.println("Loading successful!");
        return trafficFlow;
    }
    private void storeCsvValue(String value, int index) {
        int parsedValue = Integer.parseInt(value);
        csvValues[index] = parsedValue;
    }
}
