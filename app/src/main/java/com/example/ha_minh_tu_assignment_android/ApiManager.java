package com.example.ha_minh_tu_assignment_android;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    String SERVER ="http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/";
    @GET("353412?apikey=wQ77JSlDmCs2WrjmRqmhA8bUetaeEl6Z&language=vi-vn&metric=true")
    Call<List<Item>> GetListData();
}
