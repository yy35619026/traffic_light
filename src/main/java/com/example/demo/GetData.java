package com.example.demo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetData {
    public GetData(){
        getEmergencyData();
        getTrafficflowData("East");
    }
    public void getEmergencyData(){
        try{
            File myfile = new File("demo.csv");
            Scanner readfile = new Scanner(myfile);

            while (readfile.hasNextLine()){
                String data = readfile.nextLine();
                System.out.println(data);
            }
            readfile.close();
        }catch (FileNotFoundException x){
            System.out.println("An error is occurred.");
            x.printStackTrace();
        }
    }
    public void getTrafficflowData(String lane){
        try{
            File myfile = new File("demo.csv");
            Scanner readfile = new Scanner(myfile);

            while (readfile.hasNextLine()){
                String data = readfile.nextLine();
                System.out.println(data);
            }
            readfile.close();
        }catch (FileNotFoundException x){
            System.out.println("An error is occurred.");
            x.printStackTrace();
        }
    }
}
