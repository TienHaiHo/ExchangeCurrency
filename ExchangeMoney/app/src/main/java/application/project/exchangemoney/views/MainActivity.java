package application.project.exchangemoney.views;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import application.project.exchangemoney.DividerItemDecoration;
import application.project.exchangemoney.MoviesAdapter;
import application.project.exchangemoney.R;
import application.project.exchangemoney.RecyclerTouchListener;
import application.project.exchangemoney.listener.CallbackCurrencies;
import application.project.exchangemoney.listener.CallbackRates;
import application.project.exchangemoney.models.RateExchange;
import application.project.exchangemoney.models.Rates;
import application.project.exchangemoney.utils.Utils;
import application.project.exchangemoney.views.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity {
    private List<RateExchange> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;
    private MainPresenter presenter;
    private Dialog loading;
    private Button btnExchange;
    private EditText edtFrom, edtTo;
    private Spinner spnFrom, spnTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getControl();

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                RateExchange rateExchange = movieList.get(position);
                Toast.makeText(getApplicationContext(), rateExchange.getName() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        loading.show();
        presenter.getSatusBookingResponse(new CallbackRates() {
            @Override
            public void onSuccess(Rates rates) {
                presenter.getCurrency(rates, new CallbackCurrencies() {
                    @Override
                    public void onSuccess(List<RateExchange> rateExchangeList, double defaule_rate) {
                        for (int i =0; i<rateExchangeList.size(); i++){
                            movieList.add(rateExchangeList.get(i));
                        }
                        mAdapter.notifyDataSetChanged();
                        loading.dismiss();
                    }

                    @Override
                    public void onFailure() {
                        loading.dismiss();
                        Toast.makeText(MainActivity.this,MainActivity.this.getString(R.string.server_crash), Toast.LENGTH_LONG);
                    }
                });
            }

            @Override
            public void onFailure() {
                loading.dismiss();
                Toast.makeText(MainActivity.this, MainActivity.this.getString(R.string.server_crash), Toast.LENGTH_LONG);
            }
        });

        setClick();
    }

    private void setClick(){
        btnExchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String from = edtFrom.getText().toString();
                if(from.length() == 0){
                    Toast.makeText(MainActivity.this,MainActivity.this.getString(R.string.miss_from), Toast.LENGTH_LONG);
                } else {
                    double fromRate = presenter.getRate(spnFrom.getSelectedItem().toString(), movieList), toRate = presenter.getRate(spnTo.getSelectedItem().toString(), movieList);
                    double fromvalue = Double.parseDouble(from);
                    edtTo.setText((fromvalue*toRate/fromRate)+"");
                }
            }
        });
    }

    private void getControl(){
        loading = Utils.getWaitingDialog(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MoviesAdapter(movieList);

        presenter = new MainPresenter();

        btnExchange = (Button)findViewById(R.id.btn_exchange);
        edtFrom = (EditText)findViewById(R.id.edt_from);
        edtTo = (EditText)findViewById(R.id.edt_to);
        spnFrom = (Spinner)findViewById(R.id.spn_from);
        spnTo = (Spinner) findViewById(R.id.spn_to);
    }
}