package com.example.coinexchange;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.coinexchange.databinding.ActivityMainBinding;

public class CoinExchange extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        final Button firstCoin = findViewById(R.id.coin1);
        firstCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String initialAmount = ""+(((TextView) findViewById(R.id.AmountToConvert)).getText());
                final TextView resultAgain = (TextView) findViewById(R.id.result2);
                resultAgain.setText(Double.parseDouble(initialAmount) * 0.097 + "");
            }
        });
        final Button secondCoin = findViewById(R.id.coin2);
        secondCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String initialAmount = ""+(((TextView) findViewById(R.id.AmountToConvert)).getText());
                final TextView resultAgain = (TextView) findViewById(R.id.result2);
                resultAgain.setText(Double.parseDouble(initialAmount) * 0.091 + "");
            }
        });
        final Button thirdCoin = findViewById(R.id.coin3);
        thirdCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String initialAmount = ""+(((TextView) findViewById(R.id.AmountToConvert)).getText());
                final TextView resultAgain = (TextView) findViewById(R.id.result2);
                resultAgain.setText(Double.parseDouble(initialAmount) * 5.34 + "");
            }
        });

    }


}