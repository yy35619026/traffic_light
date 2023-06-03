package com.example.database;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Blob;
import java.sql.Date;


@Entity
@Table(name = "yolov8")
public class Yolov8 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="saveimage")
    private Blob saveimage;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date date;

    public int getId() {
        return id;
    }

    public Blob getSaveimage() {
        return saveimage;
    }

    public Date getDate() {
        return date;
    }

    public void setSaveimage(Blob saveimage) {
        this.saveimage = saveimage;
    }
}
