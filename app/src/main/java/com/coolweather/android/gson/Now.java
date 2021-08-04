package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 今日天气信息
 */
public class Now {
    //JSON里的一些字段可能不太适合作为JAVA字段来命名，因此使用@SerializedName注释的方式让JSON字段和JAVA字段建立映射关系
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
