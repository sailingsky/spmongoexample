package com.beck.repository;

import com.beck.pojo.Departure;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * Created by shuangjian on 2017/4/27.
 */
public interface DepartureCustomRepository {

    public List<Departure> listDepartureByPageWithQuery(Query query);

}
