package com.example.database;

import jakarta.persistence.*;

@Entity
@Table(name = "traffic_light_controller")

public class Traffic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name="traffic_light_time")
    private String traffic_light_time;
    @Column(name= "traffic_light_color")
    private String traffic_light_color;
    public int getId() {
        return id;
    }
    public void setTraffic_light_time(String traffic_light_time) {
        this.traffic_light_time = traffic_light_time;
    }
    public String getTraffic_light_time() {
        return traffic_light_time;
    }
    public void setTraffic_light_color(String traffic_light_color) {
        this.traffic_light_color = traffic_light_color;
    }
    public String getTraffic_light_color() {
        return traffic_light_color;
    }
}
