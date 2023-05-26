package com.example.demo;

public class AI {
    //全部都暫定，必須修正！！！
    private int trafficflowEast;
    private int trafficflowWest;
    private int trafficflowNorth;
    private int trafficflowSouth;

    private Yolov8 sensor = new Yolov8();
    AI(Yolov8 sensor){
        this.sensor = sensor;
    }
    public void getTrafficFlow(){

    }
    public int compareTraffic(int FlowA, int FlowB){
        if (FlowA > FlowB){
            return FlowA;
        }else{
            return FlowB;
        }
    }
    public double compareTraffic(int FlowA, int FlowB, double radio){
        if (FlowA > FlowB){
            radio = FlowA / FlowB;
        }else {
            radio = FlowB / FlowA;
        }
        return radio;
    }
}
