package com.example.database;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Blob;


@Entity
@Table(name = "yolov8")
public class Yolov8 {
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
    @Column(name="vehicle")
    private int vehicle;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Blob getSaveimage() {
        return saveimage;
    }

    public void setSaveimage(Blob saveimage) {
        this.saveimage = saveimage;
    }

    public int getTrafficflowEast() {
        return trafficflowEast;
    }

    public void setTrafficflowEast(int trafficflowEast) {
        this.trafficflowEast = trafficflowEast;
    }

    public int getTrafficflowWest() {
        return trafficflowWest;
    }

    public void setTrafficflowWest(int trafficflowWest) {
        this.trafficflowWest = trafficflowWest;
    }

    public int getTrafficflowSouth() {
        return trafficflowSouth;
    }

    public void setTrafficflowSouth(int trafficflowSouth) {
        this.trafficflowSouth = trafficflowSouth;
    }

    public int getTrafficflowNorth() {
        return trafficflowNorth;
    }

    public void setTrafficflowNorth(int trafficflowNorth) {
        this.trafficflowNorth = trafficflowNorth;
    }

    public int getVehicle() {
        return vehicle;
    }

    public void setVehicle(int vehicle) {
        this.vehicle = vehicle;
    }
}
