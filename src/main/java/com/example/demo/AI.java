package com.example.demo;

public class AI {
    //全部都暫定，必須修正！！！
    private int eastLane;
    private int westLane;
    private int northLane;
    private int southLane;

    private double ratio;//each lane's compare value

    //get the traffic flow from Yolov8
    public int getTraffic() {
        Yolov8 yolo = new Yolov8();
        int lane = yolo.trafficFlow;
        //assume yolov8 already calculated the traffic flow
        //so created an instance of yolov8 then we can access the variable trafficFlow from yolov8
        return lane;
    }

    public double compareTrafficFlow(){
        Yolov8 yoloE = new Yolov8();
        int eastlane = yoloE.trafficFlow;

        Yolov8 yoloW = new Yolov8();
        int westlane = yoloW.trafficFlow;

        Yolov8 yoloN = new Yolov8();
        int northlane = yoloN.trafficFlow;

        Yolov8 yoloS = new Yolov8();
        int southlane = yoloS.trafficFlow;

        //compare same direction's traffic flow
        if(eastlane > westlane && northlane > southlane){
            ratio = eastlane/northlane;
        }else if(eastlane > westlane && northlane < southlane){
            ratio = eastlane/southlane;
        }else if(eastlane < westlane && northlane > southlane){
            ratio = westlane/northlane;
        }else{
            ratio = westlane/southlane;
        }

        //depends on the ratio to determine traffic light time
        if(ratio == 1 || (ratio > 0.66 && ratio < 1.5)){
            System.out.println();//remain the same
        }else if(ratio > 0.11 && ratio < 0.42){
            //increase eastlane gren light time
            //increase northlane red light time
            System.out.println();
        }else{
            //decrease eastlane green light time
            //decrease northlane red light time
            System.out.println();
        }
        //note:the timing of traffic lights in the same way is linked
        //which means EW is the same group, and NS too
        System.out.println();
        return ratio;
    }
}