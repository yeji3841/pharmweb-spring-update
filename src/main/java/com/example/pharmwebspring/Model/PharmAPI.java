package com.example.pharmwebspring.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PharmAPI {
    private String dutyAddr;
    private String dutyEtc;
    private String dutyMaping;
    private String dutyName;
    private String dutyTell;
    private Integer dutyTime1c;
    private Integer dutyTime1s;
    private Integer dutyTime2c;
    private Integer dutyTime2s;
    private Integer dutyTime3c;
    private Integer dutyTime3s;
    private Integer dutyTime4c;
    private Integer dutyTime4s;
    private Integer dutyTime5c;
    private Integer dutyTime5s;
    private Integer dutyTime6c;
    private Integer dutyTime6s;
    private Integer dutyTime7c;
    private Integer dutyTime7s;
    private Integer dutyTime8c;
    private Integer dutyTime8s;
    private String hpid;
    private Integer postCdn1;
    private Integer PostCdn2;
    private Integer rnum;
    private Float wgs84Lat;
    private Float wgs84Lon;

    public void getlat(Float wgs84Lat){

    }
    /*public PharmAPI(String dutyAddr, String dutyEtc, String dutyMaping, String dutyName, String dutyTell, Integer rnum,
                    Float wgs84Lat, Float wgs84Lon){
        this.dutyAddr = dutyAddr;
        this.dutyEtc = dutyEtc;
        this.dutyMaping = dutyMaping;
        this.dutyName = dutyName;
        this.dutyTell = dutyTell;
        this.rnum = rnum;
        this.wgs84Lat = wgs84Lat;
        this.wgs84Lon = wgs84Lon;
    }

    public void setAddress(String dutyAddr){
        this.dutyAddr = dutyAddr;
    }
    public String getAddress(){
        return dutyAddr;
    }*/
}
