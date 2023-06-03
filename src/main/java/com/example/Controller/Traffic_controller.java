package com.example.Controller;

import com.example.Repository.EmergencyRepository;
import com.example.Repository.TrafficRepository;
import com.example.database.Traffic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Target;

@RestController
@RequestMapping("/Traffic")
public class Traffic_controller {
    @Autowired
    TrafficRepository trafficRepository;
    @Autowired
    EmergencyRepository emergencyRepository;
//
//    @PostMapping("/create")
//    public ResponseEntity<Traffic> create_condition(@RequestBody Traffic traffic) {
//        Condition condition = conditionService.createCondition(traffic);
//        return new ResponseEntity<>(condition, HttpStatus.OK);
//    }
//    @GetMapping("/{id}")
//    public Traffic getProduct(@PathVariable("id") String id) {
//        Traffic traffic = new Traffic();
//        traffic.getId();
//        product.("Romantic Story");
//        .setPrice(200);
//
//        return product;
//    }
}
