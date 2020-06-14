package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCalculate,btnReset;
    EditText etWeight, etDistance;
    TextView tvPrice;

    Integer strWeight,strDistance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init(){
        etWeight = findViewById(R.id.etWeight);
        etDistance = findViewById(R.id.etDistance);
        tvPrice = findViewById(R.id.tvPrice);
        btnCalculate = findViewById(R.id.btnCalculation);
        btnReset = findViewById(R.id.btnReset);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDistance.setText("");
                etWeight.setText("");
                tvPrice.setText("");
            }
        });

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
    }

    private void calculation(){
        strWeight = Integer.parseInt(etWeight.getText().toString().trim());
        strDistance = Integer.parseInt(etDistance.getText().toString().trim());


/*        double strWeight = Integer.parseInt(strWeight);
        double strDistance = Integer.parseInt(strDistance);*/

        if(strWeight < 15 && strDistance <= 100){
            tvPrice.setText("5dH for 1KG");
        }
        if(strWeight<15 && strDistance>100){
            tvPrice.setText("8dH for 1KG");
        }
        if(strWeight==15 && strWeight == 30 && strDistance <= 100){
            tvPrice.setText("7,50dH for 1KG");
        }
        if(strWeight==15 && strWeight == 30  && strDistance> 100){
            tvPrice.setText("9dH for 1KG");
        }
        if(strWeight>30 && strDistance<=100){
            tvPrice.setText("10dH for 1KG");
        }
        if(strWeight>30 && strDistance>100){
            tvPrice.setText("11dH for 1KG");
        }

    }

    private void reset(){
        etDistance.setText("");
        etWeight.setText("");
        tvPrice.setText("");

    }

}