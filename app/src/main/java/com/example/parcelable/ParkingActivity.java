package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        Intent intent = getIntent();
        Vehicle car = intent.getParcelableExtra("CAR");

        TextView mBrand = findViewById(R.id.tvBrand);
        TextView mKm = findViewById(R.id.tvKm);

        mBrand.setText(car.getBrand());
        mKm.setText(Integer.toString(car.getKm(), 0));

    }
}
