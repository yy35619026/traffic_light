package com.example.Controller;

//import com.example.Repository.EmergencyRepository;
//import com.example.Repository.TrafficRepository;
import com.example.Repository.TrafficRepository;
import com.example.database.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Target;
import java.util.Date;
//http://localhost:8080/Condition/id
@RestController
@RequestMapping("/Condition")
public class Traffic_controller {

    @Autowired
    TrafficRepository trafficRepository;

//    @PostMapping("/create")
//    public ResponseEntity<Traffic> create_condition(@RequestBody Traffic traffic) {
//        Condition condition = conditionService.createCondition(traffic);
//        return new ResponseEntity<>(condition, HttpStatus.OK);
//    }
    @GetMapping("/{id}")
    public Condition saveData(@PathVariable("id") String id) {
        Condition condition = new Condition();

        condition.setId((Integer.parseInt(id)));
        condition.setTotalFlow(100);

        trafficRepository.save(condition);

        return condition;
    }
}
