package com.example.Repository;

import com.example.database.Condition;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TrafficRepository extends JpaRepository<Condition, Long> {

}
