package com.beck.service.impl;

import com.beck.pojo.Departure;
import com.beck.repository.DepartureRepository;
import com.beck.service.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shuangjian on 2017/4/25.
 */
@Service
public class DepartureServiceImpl implements DepartureService {
    @Autowired
    private DepartureRepository departureRepository;

    public List<Departure> findDepartureList() {
        return departureRepository.findAll();
    }
}
