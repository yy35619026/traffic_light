package com.example.traffic_light;

public class AI {
    //全部都暫定，必須修正！！！
    private int eastLane;
    private int westLane;
    private int northLane;
    private int southLane;
    private double ratio;//each lane's compare value
    private boolean Emergency;
    private String lane;
    public AI(){
        //這裡是 new AI的流程要AI做的事情都在這邊添加
//        getTrafficFlow("trafficFlow.csv");
        System.out.println("Connecting to Yolov8...");
        System.out.println("-----------------------");

        getTrafficFlow("trafficFlow.csv");
        getTrafficFlow("trafficFlow.csv");
        getTrafficFlow("trafficFlow.csv");
        getTrafficFlow("trafficFlow.csv");
        compareSameLevelTrafficFlow();
    }
    //get the traffic flow from yolov8
    public void getTrafficFlow(String filePath) {
        GetDynamicData getDynamicData = new GetDynamicData(filePath); // Create an instance of Yolov8 class

        eastLane = getDynamicData.getData("East"); // Get traffic volume for the East lane
        westLane = getDynamicData.getData("West"); // Get traffic volume for the West lane
        northLane = getDynamicData.getData("North"); // Get traffic volume for the North lane
        southLane = getDynamicData.getData("South"); // Get traffic volume for the South lane
        
        for(int i = 4 ; i < 8 ; i++){
            Emergency = getDynamicData.getEmergencyData(i);
            if(Emergency == true){
                lane = getDynamicData.getLane();
                break;
            }
        }
//        GetStaticData staticData = new GetStaticData(filePath);
//
//        eastLane = staticData.getData("East"); // Get traffic volume for the East lane
//        westLane = staticData.getData("West"); // Get traffic volume for the West lane
//        northLane = staticData.getData("North"); // Get traffic volume for the North lane
//        southLane = staticData.getData("South"); // Get traffic volume for the South lane
    }

    public void compareSameLevelTrafficFlow() {
        int A = (eastLane > westLane) ? eastLane : westLane;
        int B = (northLane > southLane) ? northLane : southLane;
        ratio = (double) A / B;
//        compareVerticalTrafficFlow();
    }

    public String compareVerticalTrafficFlow() {
        System.out.println("eastlane = " + eastLane);
        System.out.println("westlane = " + westLane);
        System.out.println("northlane = " + northLane);
        System.out.println("southlane = " + southLane);
        String lane;
        if (ratio >= 2.5) {
//            System.out.println("Increase green light time.");
            System.out.println("目前東西向車道堵塞！！！請疏通！！！");
            lane = "Parallel";
        } else if (ratio <= 0.4){
//            System.out.println("Decrease green light time.");
            System.out.println("目前南北向車道堵塞！！！請疏通！！！");
            lane = "Vertical";
        }else{
//            System.out.println("Remain the same.");
            System.out.println("目前車道流量穩定！！！");
            lane = "";
        }
        return lane;
    }
    public String getLane(){
        return lane;
    }
    public boolean getEmergencyVehicle(){
        return Emergency;
    }
}