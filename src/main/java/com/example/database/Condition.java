package com.example.database;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Condition_Traffic")
public class Condition {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "totalFlow")
    private int totalFlow;
    @Column(name = "Date")
    private LocalDateTime date = LocalDateTime.now();

//    @PrePersist
//    public void prePersist() {
//        date = new Time();
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalFlow() {
        return totalFlow;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setTotalFlow(int totalFlow) {
        this.totalFlow = totalFlow;
    }
}
