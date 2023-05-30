package com.example.traffic_light;

import java.awt.*;

import java.awt.*;

public class Traffic_Light {
    private Color Red = new Color(255, 0, 0);
    private Color Green = new Color(0, 255, 0);

    private Color Yellow = new Color(255, 255, 0);
    Traffic_Light(String color){
        if(color == "Red"){
            changeLight("Yellow");
//            System.out.println("count down to 5 4 3 2 1...");
            changeLight("Red");
        }else if(color == "Green"){
            changeLight("Green");
        }else{
            System.out.println("Error");
        }
    }
    public void changeLight(String color){
        System.out.println("Traffic light is changing to " + color);
    }
}