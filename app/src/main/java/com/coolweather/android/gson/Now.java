package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：linger
 * 功能：
 * 创建日期：2021/3/5
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
