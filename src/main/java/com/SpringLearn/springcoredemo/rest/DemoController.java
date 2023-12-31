package com.SpringLearn.springcoredemo.rest;

import com.SpringLearn.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach myCoach;

    //define a constructor for a dependency injection
    @Autowired //this annotation tells Spring to inject a dependency
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }
    @GetMapping("/dailyworkout")

    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
