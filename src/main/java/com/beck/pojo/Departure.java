package com.beck.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created by shuangjian on 2017/4/25.
 */
@Data
public class Departure {

    private String departureno;
    private Date begintime;
    private Double totalweight;
}
