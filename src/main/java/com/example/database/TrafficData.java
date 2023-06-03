package com.example.database;

import jakarta.persistence.*;

import java.sql.Blob;
import java.sql.Date;

@Entity
@Table(name = "TrafficData")
public class TrafficData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="trafficflowEast")
    private int trafficflowEast;

    @Column(name="trafficflowWest")
    private int trafficflowWest;

    @Column(name="trafficflowSouth")
    private int trafficflowSouth;

    @Column(name="trafficflowNorth")
    private int trafficflowNorth;
    @Lob
    @Column(name="saveimage")
    private Blob saveimage;
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

    public int getTrafficflowWest() {
        return trafficflowWest;
    }

    public int getTrafficflowSouth() {
        return trafficflowSouth;
    }

    public int getTrafficflowNorth() {
        return trafficflowNorth;
    }

    public Blob getSaveimage() {
        return saveimage;
    }

//    public int getVehicle() {
//        return vehicle;
//    }

    public Date getDate() {
        return date;
    }
    public void setTrafficflowEast(int trafficflowEast) {
        this.trafficflowEast = trafficflowEast;
    }

    public void setTrafficflowWest(int trafficflowWest) {
        this.trafficflowWest = trafficflowWest;
    }

    public void setTrafficflowSouth(int trafficflowSouth) {
        this.trafficflowSouth = trafficflowSouth;
    }

    public void setTrafficflowNorth(int trafficflowNorth) {
        this.trafficflowNorth = trafficflowNorth;
    }

    public void setSaveimage(Blob saveimage) {
        this.saveimage = saveimage;
    }
}
