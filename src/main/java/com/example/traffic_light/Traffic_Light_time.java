package com.example.traffic_light;

public class Traffic_Light_time {

    public int time;
    public Traffic_Light_time(int time){

    }

    public int changeTime(int time){
        return  time;



    }

    public void restTime(){

    }

    public void determine_Time(String lane, String degree){

        if(lane == "vertical" && degree == "High"){
            System.out.format("\33[0;32m增加下次--南北向車道--綠燈時間30秒\33[0m%n");
            System.out.format("\033[0;31m增加下次--東西向車道--紅燈時間30秒\033[0m%n");
        } else if (lane == "vertical" && degree == "Middle") {
            System.out.format("\33[0;32m增加下次--南北向車道--綠燈時間15秒\33[0m%n");
            System.out.format("\033[0;31m增加下次--東西向車道--紅燈時間15秒\033[0m%n");
        } else if(lane == "vertical" && degree == "Low"){
            System.out.format("\33[0;32m增加下次--南北向車道--綠燈時間10秒\33[0m%n");
            System.out.format("\033[0;31m增加下次--東西向車道--紅燈時間10秒\033[0m%n");
        } else if(lane == "parallel" && degree ==  "High"){
            System.out.format("\33[0;32m增加下次--東西向車道--綠燈時間30秒\33[0m%n");
            System.out.format("\033[0;31m增加下次--南北向車道--紅燈時間30秒\033[0m%n");
        } else if (lane == "parallel" && degree ==  "Middle") {
            System.out.format("\33[0;32m增加下次--東西向車道--綠燈時間15秒\33[0m%n");
            System.out.format("\033[0;31m增加下次--南北向車道--紅燈時間15秒\033[0m%n");
        } else if(lane == "parallel" && degree ==  "Low"){
            System.out.format("\33[0;32m增加下次--東西向車道--綠燈時間10秒\33[0m%n");
            System.out.format("\033[0;31m增加下次--南北向車道--紅燈時間10秒\033[0m%n");
        } else{
            System.out.println("維持不變");
        }
    }
}
