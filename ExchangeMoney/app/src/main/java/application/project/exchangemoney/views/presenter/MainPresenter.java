package application.project.exchangemoney.views.presenter;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import application.project.exchangemoney.listener.CallbackCurrencies;
import application.project.exchangemoney.listener.CallbackRates;
import application.project.exchangemoney.listener.OnExchangeMoneyListener;
import application.project.exchangemoney.models.Currencies;
import application.project.exchangemoney.models.Currency;
import application.project.exchangemoney.models.ExchangeMoney;
import application.project.exchangemoney.models.RateExchange;
import application.project.exchangemoney.models.Rates;
import application.project.exchangemoney.utils.AppConstant;
import application.project.exchangemoney.utils.RetrofitIml;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by dkkbg_000 on 13/03/2017.
 */

public class MainPresenter {
    public double getRate(String name, List<RateExchange> rateExchangeList){
        for (int i =0; i<rateExchangeList.size(); i++){
            if (rateExchangeList.get(i).getNotation().equals(name)){
                return rateExchangeList.get(i).getRateUSD();
            }
        }
        return -1;
    }
    public List<RateExchange>convertToExchangeRate(Rates rates, Currencies currencies){
        List<RateExchange> rateExchangesList = new ArrayList<>();
        RateExchange rateExchangeAED = new RateExchange("AED",rates.getAED()/rates.getVND(),rates.getAED(), currencies.getAED());
        rateExchangesList.add(rateExchangeAED);
        RateExchange rateExchangeAFN = new RateExchange("AFN",rates.getAFN()/rates.getVND(),rates.getAFN(), currencies.getAFN());
        rateExchangesList.add(rateExchangeAFN);
        RateExchange rateExchangeALL = new RateExchange("ALL",rates.getALL()/rates.getVND(),rates.getALL(), currencies.getALL());
        rateExchangesList.add(rateExchangeALL);
        RateExchange rateExchangeAMD = new RateExchange("AMD",rates.getAMD()/rates.getVND(),rates.getAMD(), currencies.getAMD());
        rateExchangesList.add(rateExchangeAMD);
        RateExchange rateExchangeANG = new RateExchange("ANG",rates.getANG()/rates.getVND(),rates.getANG(), currencies.getANG());
        rateExchangesList.add(rateExchangeANG);
        RateExchange rateExchangeAOA = new RateExchange("AOA",rates.getAOA()/rates.getVND(),rates.getAOA(), currencies.getAOA());
        rateExchangesList.add(rateExchangeAOA);
        RateExchange rateExchangeARS = new RateExchange("ARS",rates.getARS()/rates.getVND(),rates.getARS(), currencies.getARS());
        rateExchangesList.add(rateExchangeARS);
        RateExchange rateExchangeAUD = new RateExchange("AUD",rates.getAUD()/rates.getVND(),rates.getAUD(), currencies.getAUD());
        rateExchangesList.add(rateExchangeAUD);
        RateExchange rateExchangeAZN = new RateExchange("AZN",rates.getAZN()/rates.getVND(),rates.getAZN(), currencies.getAZN());
        rateExchangesList.add(rateExchangeAZN);
        RateExchange rateExchangeBAM = new RateExchange("BAM",rates.getBAM()/rates.getVND(),rates.getBAM(), currencies.getBAM());
        rateExchangesList.add(rateExchangeBAM);
        RateExchange rateExchangeBBD = new RateExchange("BBD",rates.getBBD()/rates.getVND(),rates.getBBD(), currencies.getBBD());
        rateExchangesList.add(rateExchangeBBD);
        RateExchange rateExchangeBDT = new RateExchange("BDT",rates.getBDT()/rates.getVND(),rates.getBDT(), currencies.getBDT());
        rateExchangesList.add(rateExchangeBDT);
        RateExchange rateExchangeBGN = new RateExchange("BGN",rates.getBGN()/rates.getVND(),rates.getBGN(), currencies.getBGN());
        rateExchangesList.add(rateExchangeBGN);
        RateExchange rateExchangeBHD = new RateExchange("BHD",rates.getBHD()/rates.getVND(),rates.getBHD(), currencies.getBHD());
        rateExchangesList.add(rateExchangeBHD);
        RateExchange rateExchangeBIF = new RateExchange("BIF",rates.getBIF()/rates.getVND(),rates.getBIF(), currencies.getBIF());
        rateExchangesList.add(rateExchangeBIF);
        RateExchange rateExchangeBMD = new RateExchange("BMD",rates.getBMD()/rates.getVND(),rates.getBMD(), currencies.getBMD());
        rateExchangesList.add(rateExchangeBMD);
        RateExchange rateExchangeBND = new RateExchange("BND",rates.getBND()/rates.getVND(),rates.getBND(), currencies.getBND());
        rateExchangesList.add(rateExchangeBND);
        RateExchange rateExchangeBOB = new RateExchange("BOB",rates.getBOB()/rates.getVND(),rates.getBOB(), currencies.getBOB());
        rateExchangesList.add(rateExchangeBOB);
        RateExchange rateExchangeBRL = new RateExchange("BRL",rates.getBRL()/rates.getVND(),rates.getBRL(), currencies.getBRL());
        rateExchangesList.add(rateExchangeBRL);
        RateExchange rateExchangeBSD = new RateExchange("BSD",rates.getBSD()/rates.getVND(),rates.getBSD(), currencies.getBSD());
        rateExchangesList.add(rateExchangeBSD);
        RateExchange rateExchangeBTC = new RateExchange("BTC",rates.getBTC()/rates.getVND(),rates.getBTC(), currencies.getBTC());
        rateExchangesList.add(rateExchangeBTC);
        RateExchange rateExchangeBTN = new RateExchange("BTN",rates.getBTN()/rates.getVND(),rates.getBTN(), currencies.getBTN());
        rateExchangesList.add(rateExchangeBTN);
        RateExchange rateExchangeBWP = new RateExchange("BWP",rates.getBWP()/rates.getVND(),rates.getBWP(), currencies.getBWP());
        rateExchangesList.add(rateExchangeBWP);
        RateExchange rateExchangeBYN = new RateExchange("BYN",rates.getBYN()/rates.getVND(),rates.getBYN(), currencies.getBYN());
        rateExchangesList.add(rateExchangeBYN);
        RateExchange rateExchangeBYR = new RateExchange("BYR",rates.getBYR()/rates.getVND(),rates.getBYR(), currencies.getBYR());
        rateExchangesList.add(rateExchangeBYR);
        RateExchange rateExchangeCAD = new RateExchange("CAD",rates.getCAD()/rates.getVND(),rates.getCAD(), currencies.getCAD());
        rateExchangesList.add(rateExchangeCAD);
        RateExchange rateExchangeCDF = new RateExchange("CDF",rates.getCDF()/rates.getVND(),rates.getCDF(), currencies.getCDF());
        rateExchangesList.add(rateExchangeCDF);
        RateExchange rateExchangeCHF = new RateExchange("CHF",rates.getCHF()/rates.getVND(),rates.getCHF(), currencies.getCHF());
        rateExchangesList.add(rateExchangeCHF);
        RateExchange rateExchangeCLF = new RateExchange("CLF",rates.getCLF()/rates.getVND(),rates.getCLF(), currencies.getCLF());
        rateExchangesList.add(rateExchangeCLF);
        RateExchange rateExchangeCLP = new RateExchange("CLP",rates.getCLP()/rates.getVND(),rates.getCLP(), currencies.getCLP());
        rateExchangesList.add(rateExchangeCLP);
        RateExchange rateExchangeCNY = new RateExchange("CNY",rates.getCNY()/rates.getVND(),rates.getCNY(), currencies.getCNY());
        rateExchangesList.add(rateExchangeCNY);
        RateExchange rateExchangeCOP = new RateExchange("COP",rates.getCOP()/rates.getVND(),rates.getCOP(), currencies.getCOP());
        rateExchangesList.add(rateExchangeCOP);
        RateExchange rateExchangeCRC = new RateExchange("CRC",rates.getCRC()/rates.getVND(),rates.getCRC(), currencies.getCRC());
        rateExchangesList.add(rateExchangeCRC);
        RateExchange rateExchangeCUC = new RateExchange("CUC",rates.getCUC()/rates.getVND(),rates.getCUC(), currencies.getCUC());
        rateExchangesList.add(rateExchangeCUC);
        RateExchange rateExchangeCUP = new RateExchange("CUP",rates.getCUP()/rates.getVND(),rates.getCUP(), currencies.getCUP());
        rateExchangesList.add(rateExchangeCUP);
        RateExchange rateExchangeCVE = new RateExchange("CVE",rates.getCVE()/rates.getVND(),rates.getCVE(), currencies.getCVE());
        rateExchangesList.add(rateExchangeCVE);
        RateExchange rateExchangeCZK = new RateExchange("CZK",rates.getCZK()/rates.getVND(),rates.getCZK(), currencies.getCZK());
        rateExchangesList.add(rateExchangeCZK);
        RateExchange rateExchangeDJF = new RateExchange("DJF",rates.getDJF()/rates.getVND(),rates.getDJF(), currencies.getDJF());
        rateExchangesList.add(rateExchangeDJF);
        RateExchange rateExchangeDOP = new RateExchange("DOP",rates.getDOP()/rates.getVND(),rates.getDOP(), currencies.getDOP());
        rateExchangesList.add(rateExchangeDOP);
        RateExchange rateExchangeDZD = new RateExchange("DZD",rates.getDZD()/rates.getVND(),rates.getDZD(), currencies.getDZD());
        rateExchangesList.add(rateExchangeDZD);
        RateExchange rateExchangeEEK = new RateExchange("EEK",rates.getEEK()/rates.getVND(),rates.getEEK(), currencies.getEEK());
        rateExchangesList.add(rateExchangeEEK);
        RateExchange rateExchangeEGP = new RateExchange("EGP",rates.getEGP()/rates.getVND(),rates.getEGP(), currencies.getEGP());
        rateExchangesList.add(rateExchangeEGP);
        RateExchange rateExchangeERN = new RateExchange("ERN",rates.getERN()/rates.getVND(),rates.getERN(), currencies.getERN());
        rateExchangesList.add(rateExchangeERN);
        RateExchange rateExchangeETB = new RateExchange("ETB",rates.getETB()/rates.getVND(),rates.getETB(), currencies.getETB());
        rateExchangesList.add(rateExchangeETB);
        RateExchange rateExchangeEUR = new RateExchange("EUR",rates.getEUR()/rates.getVND(),rates.getEUR(), currencies.getEUR());
        rateExchangesList.add(rateExchangeEUR);
        RateExchange rateExchangeFJD = new RateExchange("FJD",rates.getFJD()/rates.getVND(),rates.getFJD(), currencies.getFJD());
        rateExchangesList.add(rateExchangeFJD);
        RateExchange rateExchangeFKP = new RateExchange("FKP",rates.getFKP()/rates.getVND(),rates.getFKP(), currencies.getFKP());
        rateExchangesList.add(rateExchangeFKP);
        RateExchange rateExchangeGBP = new RateExchange("GBP",rates.getGBP()/rates.getVND(),rates.getGBP(), currencies.getGBP());
        rateExchangesList.add(rateExchangeGBP);
        RateExchange rateExchangeGEL = new RateExchange("GEL",rates.getGEL()/rates.getVND(),rates.getGEL(), currencies.getGEL());
        rateExchangesList.add(rateExchangeGEL);
        RateExchange rateExchangeGGP = new RateExchange("GGP",rates.getGGP()/rates.getVND(),rates.getGGP(), currencies.getGEL());
        rateExchangesList.add(rateExchangeGGP);
        RateExchange rateExchangeGHS = new RateExchange("GHS",rates.getGHS()/rates.getVND(),rates.getGHS(), currencies.getGGP());
        rateExchangesList.add(rateExchangeGHS);
        RateExchange rateExchangeGIP = new RateExchange("GIP",rates.getGIP()/rates.getVND(),rates.getGIP(), currencies.getGHS());
        rateExchangesList.add(rateExchangeGIP);
        RateExchange rateExchangeGMD = new RateExchange("GMD",rates.getGMD()/rates.getVND(),rates.getGMD(), currencies.getGMD());
        rateExchangesList.add(rateExchangeGMD);
        RateExchange rateExchangeGNF = new RateExchange("GNF",rates.getGNF()/rates.getVND(),rates.getGNF(), currencies.getGNF());
        rateExchangesList.add(rateExchangeGNF);
        RateExchange rateExchangeGTQ = new RateExchange("GTQ",rates.getGTQ()/rates.getVND(),rates.getGTQ(), currencies.getGTQ());
        rateExchangesList.add(rateExchangeGTQ);
        RateExchange rateExchangeGYD = new RateExchange("GYD",rates.getGYD()/rates.getVND(),rates.getGYD(), currencies.getGYD());
        rateExchangesList.add(rateExchangeGYD);
        RateExchange rateExchangeHKD = new RateExchange("HKD",rates.getHKD()/rates.getVND(),rates.getHKD(), currencies.getHKD());
        rateExchangesList.add(rateExchangeHKD);
        RateExchange rateExchangeHNL = new RateExchange("HNL",rates.getHNL()/rates.getVND(),rates.getHNL(), currencies.getHNL());
        rateExchangesList.add(rateExchangeHNL);
        RateExchange rateExchangeHRK = new RateExchange("HRK",rates.getHRK()/rates.getVND(),rates.getHRK(), currencies.getHRK());
        rateExchangesList.add(rateExchangeHRK);
        RateExchange rateExchangeHTG = new RateExchange("HTG",rates.getHTG()/rates.getVND(),rates.getHTG(), currencies.getHTG());
        rateExchangesList.add(rateExchangeHTG);
        RateExchange rateExchangeHUF = new RateExchange("HUF",rates.getHUF()/rates.getVND(),rates.getHUF(), currencies.getHUF());
        rateExchangesList.add(rateExchangeHUF);
        RateExchange rateExchangeIDR = new RateExchange("IDR",rates.getIDR()/rates.getVND(),rates.getIDR(), currencies.getIDR());
        rateExchangesList.add(rateExchangeIDR);
        RateExchange rateExchangeILS = new RateExchange("ILS",rates.getILS()/rates.getVND(),rates.getILS(), currencies.getILS());
        rateExchangesList.add(rateExchangeILS);
        RateExchange rateExchangeIMP = new RateExchange("IMP",rates.getIMP()/rates.getVND(),rates.getIMP(), currencies.getIMP());
        rateExchangesList.add(rateExchangeIMP);
        RateExchange rateExchangeINR = new RateExchange("INR",rates.getINR()/rates.getVND(),rates.getINR(), currencies.getINR());
        rateExchangesList.add(rateExchangeINR);
        RateExchange rateExchangeIQD = new RateExchange("IQD",rates.getIQD()/rates.getVND(),rates.getIQD(), currencies.getIQD());
        rateExchangesList.add(rateExchangeIQD);
        RateExchange rateExchangeIRR = new RateExchange("IRR",rates.getIRR()/rates.getVND(),rates.getIRR(), currencies.getIRR());
        rateExchangesList.add(rateExchangeIRR);
        RateExchange rateExchangeISK = new RateExchange("ISK",rates.getISK()/rates.getVND(),rates.getISK(), currencies.getISK());
        rateExchangesList.add(rateExchangeISK);
        RateExchange rateExchangeJEP = new RateExchange("JEP",rates.getJEP()/rates.getVND(),rates.getJEP(), currencies.getJEP());
        rateExchangesList.add(rateExchangeJEP);
        RateExchange rateExchangeJMD = new RateExchange("JMD",rates.getJMD()/rates.getVND(),rates.getJMD(), currencies.getJMD());
        rateExchangesList.add(rateExchangeJMD);
        RateExchange rateExchangeJOD = new RateExchange("JOD",rates.getJOD()/rates.getVND(),rates.getJOD(), currencies.getJOD());
        rateExchangesList.add(rateExchangeJOD);
        RateExchange rateExchangeJPY = new RateExchange("JPY",rates.getJPY()/rates.getVND(),rates.getJPY(), currencies.getJPY());
        rateExchangesList.add(rateExchangeJPY);
        RateExchange rateExchangeZWL = new RateExchange("ZWL",rates.getZWL()/rates.getVND(),rates.getZWL(), currencies.getZWL());
        rateExchangesList.add(rateExchangeZWL);
        RateExchange rateExchangeZMW = new RateExchange("ZMW",rates.getZMW()/rates.getVND(),rates.getZMW(), currencies.getZMW());
        rateExchangesList.add(rateExchangeZMW);
        RateExchange rateExchangeZMK = new RateExchange("ZMK",rates.getZMK()/rates.getVND(),rates.getZMK(), currencies.getZMK());
        rateExchangesList.add(rateExchangeZMK);
        RateExchange rateExchangeZAR = new RateExchange("ZAR",rates.getZAR()/rates.getVND(),rates.getZAR(), currencies.getZAR());
        rateExchangesList.add(rateExchangeZAR);
        RateExchange rateExchangeYER = new RateExchange("YER",rates.getYER()/rates.getVND(),rates.getYER(), currencies.getYER());
        rateExchangesList.add(rateExchangeYER);
        RateExchange rateExchangeXPF = new RateExchange("XPF",rates.getXPF()/rates.getVND(),rates.getXPF(), currencies.getXPF());
        rateExchangesList.add(rateExchangeXPF);
        RateExchange rateExchangeXOF = new RateExchange("XOF",rates.getXOF()/rates.getVND(),rates.getXOF(), currencies.getXOF());
        rateExchangesList.add(rateExchangeXOF);
        RateExchange rateExchangeXDR = new RateExchange("XDR",rates.getXDR()/rates.getVND(),rates.getXDR(), currencies.getXDR());
        rateExchangesList.add(rateExchangeXDR);
        RateExchange rateExchangeXCD = new RateExchange("XCD",rates.getXCD()/rates.getVND(),rates.getXCD(), currencies.getXCD());
        rateExchangesList.add(rateExchangeXCD);
        RateExchange rateExchangeXAU = new RateExchange("XAU",rates.getXAU()/rates.getVND(),rates.getXAU(), currencies.getXAU());
        rateExchangesList.add(rateExchangeXAU);
        RateExchange rateExchangeXAG = new RateExchange("XAG",rates.getXAG()/rates.getVND(),rates.getXAG(), currencies.getXAG());
        rateExchangesList.add(rateExchangeXAG);
        RateExchange rateExchangeXAF = new RateExchange("XAF",rates.getXAF()/rates.getVND(),rates.getXAF(), currencies.getXAF());
        rateExchangesList.add(rateExchangeXAF);
        RateExchange rateExchangeWST = new RateExchange("WST",rates.getWST()/rates.getVND(),rates.getWST(), currencies.getWST());
        rateExchangesList.add(rateExchangeWST);
        RateExchange rateExchangeVUV = new RateExchange("VUV",rates.getVUV()/rates.getVND(),rates.getVUV(), currencies.getVUV());
        rateExchangesList.add(rateExchangeVUV);
        RateExchange rateExchangeVND = new RateExchange("VND",rates.getVND()/rates.getVND(),rates.getVND(), currencies.getVND());
        rateExchangesList.add(rateExchangeVND);
        RateExchange rateExchangeVEF = new RateExchange("VEF",rates.getVEF()/rates.getVEF(),rates.getVEF(), currencies.getVEF());
        rateExchangesList.add(rateExchangeVEF);
        RateExchange rateExchangeUZS = new RateExchange("UZS",rates.getUZS()/rates.getUZS(),rates.getUZS(), currencies.getUZS());
        rateExchangesList.add(rateExchangeUZS);
        RateExchange rateExchangeUYU = new RateExchange("UYU",rates.getUYU()/rates.getUYU(),rates.getUYU(), currencies.getUYU());
        rateExchangesList.add(rateExchangeUYU);
        RateExchange rateexchangeUSD = new RateExchange("USD",rates.getUSD()/rates.getUSD(),rates.getUSD(), currencies.getUSD());
        rateExchangesList.add(rateexchangeUSD);
        RateExchange rateexchangeUGX = new RateExchange("UGX",rates.getUGX()/rates.getUGX(),rates.getUGX(), currencies.getUGX());
        rateExchangesList.add(rateexchangeUGX);
        RateExchange rateexchangeUAH = new RateExchange("UAH",rates.getUAH()/rates.getUAH(),rates.getUAH(), currencies.getUAH());
        rateExchangesList.add(rateexchangeUAH);
        RateExchange rateexchangeTZS = new RateExchange("TZS",rates.getTZS()/rates.getTZS(),rates.getTZS(), currencies.getTZS());
        rateExchangesList.add(rateexchangeTZS);
        RateExchange rateexchangeTWD = new RateExchange("TWD",rates.getTWD()/rates.getTWD(),rates.getTWD(), currencies.getTWD());
        rateExchangesList.add(rateexchangeTWD);
        RateExchange rateexchangeTTD = new RateExchange("TTD",rates.getTTD()/rates.getTTD(),rates.getTTD(), currencies.getTTD());
        rateExchangesList.add(rateexchangeTTD);
        RateExchange rateexchangeTRY = new RateExchange("TRY",rates.getTRY()/rates.getTRY(),rates.getTRY(), currencies.getTRY());
        rateExchangesList.add(rateexchangeTRY);
        RateExchange rateexchangeTOP = new RateExchange("TOP",rates.getTOP()/rates.getTOP(),rates.getTOP(), currencies.getTOP());
        rateExchangesList.add(rateexchangeTOP);
        RateExchange rateexchangeTND = new RateExchange("TND",rates.getTND()/rates.getTND(),rates.getTND(), currencies.getTND());
        rateExchangesList.add(rateexchangeTND);
        RateExchange rateexchangeTMT = new RateExchange("TMT",rates.getTMT()/rates.getTMT(),rates.getTMT(), currencies.getTMT());
        rateExchangesList.add(rateexchangeTMT);
        RateExchange rateexchangeTJS = new RateExchange("TJS",rates.getTJS()/rates.getTJS(),rates.getTJS(), currencies.getTJS());
        rateExchangesList.add(rateexchangeTJS);
        RateExchange rateexchangeTHB = new RateExchange("THB",rates.getTHB()/rates.getTHB(),rates.getTHB(), currencies.getTHB());
        rateExchangesList.add(rateexchangeTHB);
        RateExchange rateexchangeSZL = new RateExchange("SZL",rates.getSZL()/rates.getSZL(),rates.getSZL(), currencies.getSZL());
        rateExchangesList.add(rateexchangeSZL);
        RateExchange rateexchangeSYP = new RateExchange("SYP",rates.getSYP()/rates.getSYP(),rates.getSYP(), currencies.getSYP());
        rateExchangesList.add(rateexchangeSYP);
        RateExchange rateexchangeSVC = new RateExchange("SVC",rates.getSVC()/rates.getSVC(),rates.getSVC(), currencies.getSVC());
        rateExchangesList.add(rateexchangeSVC);
        RateExchange rateexchangeSTD = new RateExchange("STD",rates.getSTD()/rates.getSTD(),rates.getSTD(), currencies.getSTD());
        rateExchangesList.add(rateexchangeSTD);
        RateExchange rateexchangeSOS = new RateExchange("SOS",rates.getSOS()/rates.getSOS(),rates.getSOS(), currencies.getSOS());
        rateExchangesList.add(rateexchangeSOS);
        RateExchange rateexchangeSRD = new RateExchange("SRD",rates.getSRD()/rates.getSRD(),rates.getSRD(), currencies.getSRD());
        rateExchangesList.add(rateexchangeSRD);
        RateExchange rateexchangeSLL = new RateExchange("SLL",rates.getSLL()/rates.getSLL(),rates.getSLL(), currencies.getSLL());
        rateExchangesList.add(rateexchangeSLL);
        RateExchange rateexchangeSHP = new RateExchange("SHP",rates.getSHP()/rates.getSHP(),rates.getSHP(), currencies.getSHP());
        rateExchangesList.add(rateexchangeSHP);
        RateExchange rateexchangeSGD = new RateExchange("SGD",rates.getSGD()/rates.getSGD(),rates.getSGD(), currencies.getSGD());
        rateExchangesList.add(rateexchangeSGD);
        RateExchange rateexchangeSEK = new RateExchange("SEK",rates.getSEK()/rates.getSEK(),rates.getSEK(), currencies.getSEK());
        rateExchangesList.add(rateexchangeSEK);
        RateExchange rateexchangeSDG = new RateExchange("SDG",rates.getSDG()/rates.getSDG(),rates.getSDG(), currencies.getSDG());
        rateExchangesList.add(rateexchangeSDG);
        RateExchange rateexchangeSCR = new RateExchange("SCR",rates.getSCR()/rates.getSCR(),rates.getSCR(), currencies.getSCR());
        rateExchangesList.add(rateexchangeSCR);
        RateExchange rateexchangeSBD = new RateExchange("SBD",rates.getSBD()/rates.getSBD(),rates.getSBD(), currencies.getSBD());
        rateExchangesList.add(rateexchangeSBD);

//                "KES": 102.549767,
//                "KGS": 69.185349,
//                "KHR": 4006.410256,
//                "KMF": 461.673114,
//                "KPW": 899.91,
//                "KRW": 1148.81,
//                "KWD": 0.305659,
//                "KYD": 0.828007,
//                "KZT": 315.050079,
//                "LAK": 8203,
//                "LBP": 1495.409225,
//                "LKR": 150.55039,
//                "LRD": 93.996255,
//                "LSL": 13.210719,
//                "LTL": 3.234754,
//                "LVL": 0.658416,
//                "LYD": 1.427482,
//                "MAD": 10.020634,
//                "MDL": 19.800105,
//                "MGA": 3171.6,
//                "MKD": 58.129603,
//                "MMK": 1365.8,
//                "MNT": 2452.663333,
//                "MOP": 7.948725,
//                "MRO": 357.345889,
//                "MTL": 0.683602,
//                "MUR": 35.509333,
//                "MVR": 15.500041,
//                "MWK": 719.663349,
//                "MXN": 19.6033,
//                "MYR": 4.453055,
//                "MZN": 68.986657,
//                "NAD": 13.210719,
//                "NGN": 312.527468,
//                "NIO": 29.372643,
//                "NOK": 8.5998,
//                "NPR": 105.955254,
//                "NZD": 1.444669,
//                "OMR": 0.38509,
//                "PAB": 1,
//                "PEN": 3.268198,
//                "PGK": 3.149255,
//                "PHP": 50.263,
//                "PKR": 104.179412,
//                "PLN": 4.06285,
//                "PYG": 5408.7,
//                "QAR": 3.641276,
//                "RON": 4.254601,
//                "RSD": 115.88,
//                "RUB": 58.9363,
//                "RWF": 833.39994,
//                "SAR": 3.7505,
//                "SBD": 7.763724,
//                "SCR": 13.627469,
//                "SDG": 6.382057,
//                "SEK": 9.009325,
//                "SGD": 1.4122,
//                "SHP": 0.822165,
//                "SLL": 7522,
//                "SOS": 575.31378,
//                "SRD": 7.544,
//                "STD": 22957.34961,
//                "SVC": 8.694267,
//                "SYP": 214.323333,
//                "SZL": 13.206298,
//                "THB": 35.358,
//                "TJS": 8.093611,
//                "TMT": 3.499986,
//                "TND": 2.2805,
//                "TOP": 2.28655,
//                "TRY": 3.730504,
//                "TTD": 6.687444,
//                "TWD": 31.046,
//                "TZS": 2220.9,
//                "UAH": 26.666035,
//                "UGX": 3582.25,
//                "USD": 1,
//                "UYU": 28.393693,
//                "UZS": 3292.1,
//                "VEF": 9.99001,
        return rateExchangesList;

    }

    ExchangeMoney dataExchange;

    public void getCurrency(final Rates rates, final CallbackCurrencies cb){
        OnExchangeMoneyListener apiService = RetrofitIml.getRetrofit(AppConstant.URL_NATION).create(OnExchangeMoneyListener.class);
        Call<Currency> callCurrency = apiService.nationCurrency(AppConstant.KEY_NATION);
        Log.d("checkxyzk: ", "here");
        callCurrency.enqueue(new Callback<Currency>() {
            @Override
            public void onResponse(Call<Currency> call, Response<Currency> response) {
//                List<Result> news = response.body().getResults();
                cb.onSuccess(convertToExchangeRate(rates, response.body().getCurrencies()), rates.getVND());
//                recyclerView.setAdapter(new adapter(news, R.layout.item_news, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<Currency> call, Throwable t) {
                Log.e("checkxyzk", t.toString());
                cb.onFailure();
            }
        });
    }

    public void getSatusBookingResponse(final CallbackRates cb) {
        Log.d("checkxyz: ", "start");
        OnExchangeMoneyListener apiService = RetrofitIml.getRetrofit(AppConstant.URL).create(OnExchangeMoneyListener.class);
        Call<ExchangeMoney> call = apiService.exchange(AppConstant.KEY);
        Log.d("checkxyz: ", "here");
        call.enqueue(new Callback<ExchangeMoney>() {
            @Override
            public void onResponse(Call<ExchangeMoney> call, Response<ExchangeMoney> response) {
                Log.d("checkxyz: ", response.body().getRates().getAED()+"");
                dataExchange = response.body();
                cb.onSuccess(response.body().getRates());
//                recyclerView.setAdapter(new adapter(news, R.layout.item_news, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<ExchangeMoney> call, Throwable t) {
                Log.e("checkxyz", t.toString());
                cb.onFailure();
            }
        });

    }
}
