package com.beck.service;

import com.beck.pojo.Departure;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * Created by shuangjian on 2017/4/25.
 */
public interface DepartureService {

    public List<Departure> findDepartureList();

    public Page<Departure> findListByPage(Pageable pageable);

    public List<Departure> listDepartureByPageWithQuery(Query query);

}
