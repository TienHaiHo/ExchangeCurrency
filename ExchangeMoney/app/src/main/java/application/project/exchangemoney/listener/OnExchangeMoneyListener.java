package application.project.exchangemoney.listener;

import application.project.exchangemoney.models.Currency;
import application.project.exchangemoney.models.ExchangeMoney;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dkkbg_000 on 13/03/2016.
 */
public interface OnExchangeMoneyListener {
//    @GET("movie/top_rated")
//    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("latest.json")
    Call<ExchangeMoney> exchange(@Query("app_id") String apiKey);

    //    http://apilayer.net/api/list?access_key=c3c1465cc1e66ac363da477d97f08a59
    @GET("list")
    Call<Currency> nationCurrency(@Query("access_key") String apiKey);
}
