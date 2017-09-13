package com.example.android.sunshine.RetrofitController;

import com.example.android.sunshine.APIInterface.InterfaceCalls;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SarahN on 9/14/2017.
 */
public class APICallController {
    static final String BASE_URL = "https://andfun-weather.udacity.com/staticweather/";

    public static final InterfaceCalls CreateRequest(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        InterfaceCalls calls = retrofit.create(InterfaceCalls.class);
        return calls;
    }
}
