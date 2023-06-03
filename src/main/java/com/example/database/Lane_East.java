package com.example.database;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "EastLane")
public class Lane_East {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="trafficflowEast")
    private int trafficflowEast;
    @Column(name="Energency_vehicle")
    private boolean Emergency_vehicle;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date date;

    public int getId() {
        return id;
    }

    public int getTrafficflowEast() {
        return trafficflowEast;
    }

    public boolean isEmergency_vehicle() {
        return Emergency_vehicle;
    }

    public Date getDate() {
        return date;
    }

    public void setTrafficflowEast(int trafficflowEast) {
        this.trafficflowEast = trafficflowEast;
    }

    public void setEmergency_vehicle(boolean emergency_vehicle) {
        Emergency_vehicle = emergency_vehicle;
    }
}
