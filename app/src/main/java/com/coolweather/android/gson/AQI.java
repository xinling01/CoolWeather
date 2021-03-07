package com.coolweather.android.gson;

/**
 * 作者：linger
 * 功能：
 * 创建日期：2021/3/5
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
