package com.example.demo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//這個Class是抓取動態數據
public class Yolov8 {
    String file = "src/trafficFlow.csv";
    BufferedReader reader = null;
    protected int trafficFlow;
    int FlowIndex = 33;
    int[] CsvＶalues = new int[4];
    int count = 0;
    public Yolov8() {
        try {
            String line;
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null && count <4) {
                String[] values = line.split(",");
                StoreCsv(values[FlowIndex],count);
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
    protected int getData(String lane){
        if (lane == "East"){
            System.out.println("File of East Loading...");

            System.out.println("Loading success！！！");
            trafficFlow = CsvＶalues[0];
        }else if (lane == "West"){
            System.out.println("File of West Loading...");

            System.out.println("Loading success！！！");
            trafficFlow = CsvＶalues[1];
        }else if (lane == "North"){
            System.out.println("File of North Loading...");

            System.out.println("Loading success！！！");
            trafficFlow = CsvＶalues[2];
        }else if (lane == "South"){
            System.out.println("File of South Loading...");

            System.out.println("Loading success！！！");
            trafficFlow = CsvＶalues[3];
        }
        return trafficFlow;
    }

    public void  StoreCsv(String values,int count){


        int value = Integer.parseInt(values);

        CsvＶalues[count] = value;
    }
}
