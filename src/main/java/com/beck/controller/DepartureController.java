package com.beck.controller;

import com.beck.pojo.Departure;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by shuangjian on 2017/4/25.
 */
@RestController
@RequestMapping("/departure")
public class DepartureController {

    @RequestMapping("/list")
//    @ResponseBody
    public List<Departure> list(){
        Departure departure = new Departure();
        departure.setBegintime(new Date());
        departure.setDepartureno("11111");
        departure.setTotalweight(11.3);
        List<Departure> departureList = new ArrayList<Departure>();
        departureList.add(departure);
        return departureList;
    }
}
