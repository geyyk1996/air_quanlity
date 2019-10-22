package com.air.air.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Air {
    private Integer id;
    private Date time;
    private String co;
    private String nh3;
    private String co2;
    private String tvoc;
    private String tmep;
    private String humi;
}
