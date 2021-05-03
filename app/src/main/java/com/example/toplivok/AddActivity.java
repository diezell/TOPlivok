package com.example.toplivok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.FirebaseDatabase;

public class AddActivity extends AppCompatActivity {

//    private FloatingActionButton addBtn;
    private Button addBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        EditText odometer = findViewById(R.id.odometerField);
        EditText price = findViewById(R.id.priceField);
        EditText totalCost = findViewById(R.id.totalCostField);
        odometer.setText("1535");
        price.setText("8965135");
        totalCost.setText("54648");

        addBtn = findViewById(R.id.addButton);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText odometer = findViewById(R.id.odometerField);
                EditText price = findViewById(R.id.priceField);
                EditText totalCost = findViewById(R.id.totalCostField);
                // здесь сделать проверку значений, и просто вернуть return; если что-то не так
                FirebaseDatabase.getInstance().getReference().push().setValue(
                        new Refueling(
                                Long.parseLong(odometer.getText().toString()),
                                Float.parseFloat(price.getText().toString()),
                                Float.parseFloat(totalCost.getText().toString()))
                );


                Intent intent = new Intent(AddActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
