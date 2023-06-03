package com.example.database;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "Condition")
public class Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "totalFlow")
    private int totalFlow;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date date;

    public int getId() {
        return id;
    }

    public int getTotalFlow() {
        return totalFlow;
    }

    public Date getDate() {
        return date;
    }

    public void setTotalFlow(int totalFlow) {
        this.totalFlow = totalFlow;
    }
}
