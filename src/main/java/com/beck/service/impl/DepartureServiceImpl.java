package com.beck.service.impl;

import com.beck.pojo.Departure;
import com.beck.repository.DepartureRepository;
import com.beck.service.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Query;
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

    public Page<Departure> findListByPage(Pageable pageable) {
        return departureRepository.findAll(pageable);
    }

    public List<Departure> listDepartureByPageWithQuery(Query query){
        return departureRepository.listDepartureByPageWithQuery(query);
    }
}
