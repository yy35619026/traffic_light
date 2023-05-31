package com.example.traffic_light;

public class AI {
    //全部都暫定，必須修正！！！
    private int eastLane;
    private int westLane;
    private int northLane;
    private int southLane;
    private double ratio;//each lane's compare value
    private String state;
    public AI(){
        //這裡是 new AI的流程要AI做的事情都在這邊添加
        getTrafficFlow("");
        compareSameLevelTrafficFlow();
        compareVerticalTrafficFlow();
    }
    //get the traffic flow from yolov8
    public void getTrafficFlow(String filePath) {
        Yolov8 yolov8 = new Yolov8(filePath); // Create an instance of Yolov8 class
        eastLane = yolov8.getData("East"); // Get traffic volume for the East lane
        westLane = yolov8.getData("West"); // Get traffic volume for the West lane
        northLane = yolov8.getData("North"); // Get traffic volume for the North lane
        southLane = yolov8.getData("South"); // Get traffic volume for the South lane
    }

    public void compareSameLevelTrafficFlow() {
        int A = (eastLane > westLane) ? eastLane : westLane;
        int B = (northLane > southLane) ? northLane : southLane;
        ratio = (double) A / B;
    }

    public String compareVerticalTrafficFlow() {
        if (ratio == 1 || (ratio > 0.66 && ratio < 1.5)) {
            System.out.println("Remain the same.");
            state = "Stable";
        } else if (ratio > 0.11 && ratio < 0.42) {
            System.out.println("Increase green light time.");
            state = "Heavy";
        } else {
            System.out.println("Decrease green light time.");
            state = "Low";
        }
        return state;
    }
}