package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：linger
 * 功能：
 * 创建日期：2021/3/5
 */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
