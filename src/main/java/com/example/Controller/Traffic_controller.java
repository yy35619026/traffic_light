package com.example.Controller;

//import com.example.Repository.EmergencyRepository;
//import com.example.Repository.TrafficRepository;
import com.example.Repository.TrafficRepository;
import com.example.database.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Target;
import java.util.Date;

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
    public Condition getProduct(@PathVariable("id") String id) {
        Condition condition = new Condition();
        condition.getId();
        condition.getTotalFlow();
        condition.getDate();
        condition.setId((Integer.parseInt(id)));
        condition.setTotalFlow(100);

        trafficRepository.save(condition);

        return condition;
    }
}
