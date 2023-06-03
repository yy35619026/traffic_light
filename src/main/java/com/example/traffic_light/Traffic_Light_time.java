package com.example.traffic_light;

public class Traffic_Light_time {

    public int nsgreentime;
    public int nsredtime;
    public int ewgreentime;
    public int ewredtime;

    public void restTime(){
        nsgreentime = 30;
        nsredtime = 30;
        ewgreentime = 30;
        ewredtime = 30;
    }

    public void change_time(LaneType lane){

        if(lane == LaneType.Vertical){
            System.out.format("\33[0;32m增加下次--南北向車道--綠燈總時間 %d 秒\33[0m%n",nsgreentime+15);
//            System.out.format("\033[0;31m減少下次--南北向車道--紅燈總時間 %d 秒\033[0m%n",nsredtime-15);
//
//            System.out.format("\33[0;32m減少下次--東西向車道--綠燈總時間 %d 秒\33[0m%n",ewgreentime-15);
            System.out.format("\033[0;31m增加下次--東西向車道--紅燈總時間 %d 秒\033[0m%n",ewredtime+15);

        }else if(lane == LaneType.Parallel){

            System.out.format("\33[0;32m增加下次--東西向車道--綠燈總時間 %d 秒\33[0m%n",ewgreentime+15);
//            System.out.format("\033[0;31m減少下次--東西向車道--紅燈總時間 %d 秒\033[0m%n",ewredtime-15);
//
//            System.out.format("\33[0;32m增加下次--南北向車道--綠燈總時間 %d 秒\33[0m%n",nsgreentime-15);
            System.out.format("\033[0;31m減少下次--南北向車道--紅燈總時間 %d 秒\033[0m%n",nsredtime+15);
        }else{
            System.out.println("東西南北向時間皆維持不變");
        }
    }

    public enum LaneType {
        Vertical,
        Parallel
    }

}
