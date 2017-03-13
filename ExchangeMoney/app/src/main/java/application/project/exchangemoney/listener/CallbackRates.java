package application.project.exchangemoney.listener;

import application.project.exchangemoney.models.Rates;

/**
 * Created by dkkbg_000 on 13/03/2017.
 */

public interface CallbackRates {
    void onSuccess(Rates rates);
    void onFailure();
}
