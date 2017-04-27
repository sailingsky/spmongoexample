package com.beck.controller;

import com.beck.pojo.Departure;
import com.beck.service.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by shuangjian on 2017/4/25.
 */
@RestController
@RequestMapping("/departure")
public class DepartureController {

    @Autowired
    private DepartureService departureService;

    @RequestMapping("/list")
    public List<Departure> list(){
//        Departure departure = new Departure();
//        departure.setBegintime(new Date());
//        departure.setDepartureno("11111");
//        departure.setTotalweight(11.3);
//        List<Departure> departureList = new ArrayList<Departure>();
//        departureList.add(departure);
        return departureService.findDepartureList();
    }

    @RequestMapping("/page")
    public Page<Departure> pageList() {
        Pageable pageable = new PageRequest(2, 3);
        return departureService.findListByPage(pageable);
    }

    @RequestMapping("/query")
    public List<Departure> pageWithQuery(){
        Query query = new Query();
        query.addCriteria(Criteria.where("begintime").lt(new Date()))
                .with(new PageRequest(1,2));
        return departureService.listDepartureByPageWithQuery(query);
    }
}
