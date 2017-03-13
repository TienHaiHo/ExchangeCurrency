package application.project.exchangemoney.models;

/**
 * Created by dkkbg_000 on 13/03/2017.
 */

public class RateExchange {
    private String name;
    private String notation;
    private Double rate;

    public Double getRateUSD() {
        return rateUSD;
    }

    private Double rateUSD;

    public void setName(String name) {
        this.name = name;
    }

    public RateExchange(String notation, Double rate, Double rateUSD) {
        this(notation, rate, rateUSD, "");
    }

    public String getName() {
        return name;
    }

    public String getNotation() {
        return notation;
    }

    public Double getRate() {
        return rate;
    }

    public RateExchange(String notation, Double rate, Double rateUSD, String name) {
        this.name = name;
        this.notation = notation;
        this.rate = rate;
        this.rateUSD = rateUSD;
    }
}
