package application.project.exchangemoney.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dkkbg_000 on 21/06/2016.
 */
public class RetrofitIml {
    public static Retrofit retrofit = null;
    public static Retrofit getRetrofit(String url){
        retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }
}
