package com.example.toplivok;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseListAdapter<Refueling> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(this);

        displayAllFueling();
    }

    private void displayAllFueling() {
        ListView listOfFueling = findViewById(R.id.list_of_fueling);
        adapter = new FirebaseListAdapter<Refueling>(this, Refueling.class, R.layout.list_item, FirebaseDatabase.getInstance().getReference()) {
            @Override
            protected void populateView(View v, Refueling model, int position) {
                TextView odometer, price, totalCost;
                odometer = v.findViewById(R.id.odometerValue);
                price = v.findViewById(R.id.priceValue);
                totalCost = v.findViewById(R.id.totalCostValue);

                odometer.setText(String.valueOf(model.getOdometer()));
                price.setText(String.valueOf(model.getPrice()));
                totalCost.setText(String.valueOf(model.getCost()));
//                dateTime.setText(DateFormat.format("dd.mm.yyyy", model.getTime()));
            }
        };
        listOfFueling.setAdapter(adapter);
    }


    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(this, AddActivity.class);
        startActivity(i);
    }
}
