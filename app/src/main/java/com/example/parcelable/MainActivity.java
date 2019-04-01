package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button go = findViewById(R.id.btGo);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText mBrand = findViewById(R.id.etBrand);
                EditText mKm = findViewById(R.id.etKilometers);

                String brand = mBrand.getText().toString();
                int km = Integer.parseInt(mKm.getText().toString());

                Vehicle car = new Vehicle(brand, km);

                Intent intent = new Intent(MainActivity.this, ParkingActivity.class);
                intent.putExtra("CAR", car);
                startActivity(intent);
            }
        });

    }
}
