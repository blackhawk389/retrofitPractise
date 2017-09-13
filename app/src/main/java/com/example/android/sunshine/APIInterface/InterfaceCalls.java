package com.example.android.sunshine.APIInterface;

import com.example.android.sunshine.retrofitmodel.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by SarahN on 9/14/2017.
 */
public interface InterfaceCalls {


    @GET("{location}/{format}/{units}/{days}")
    Call<WeatherData> getData(@Path("location") String location,
                               @Path("format") String format,
                               @Path("units") String units,
                               @Path("days") String days);
}
