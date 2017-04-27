package com.beck.repository;

import com.beck.pojo.Departure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * Created by shuangjian on 2017/4/27.
 */
public class DepartureRepositoryImpl implements DepartureCustomRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Departure> listDepartureByPageWithQuery(Query query) {
        return mongoTemplate.find(query,Departure.class);
    }
}
