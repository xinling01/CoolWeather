package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：linger
 * 功能：
 * 创建日期：2021/3/5
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
