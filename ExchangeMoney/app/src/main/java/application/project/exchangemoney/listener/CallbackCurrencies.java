package application.project.exchangemoney.listener;

import java.util.List;

import application.project.exchangemoney.models.RateExchange;

/**
 * Created by dkkbg_000 on 13/03/2017.
 */

public interface CallbackCurrencies {
    void onSuccess(List<RateExchange> rateExchangeList, double default_rate);
    void onFailure();
}
