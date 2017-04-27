package com.beck.repository;

import com.beck.pojo.Departure;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by shuangjian on 2017/4/25.
 */
public interface DepartureRepository extends MongoRepository<Departure,String>,DepartureCustomRepository {

}
