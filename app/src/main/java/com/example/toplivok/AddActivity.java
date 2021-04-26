package com.example.toplivok;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.FirebaseDatabase;

public class AddActivity extends AppCompatActivity {

//    private FloatingActionButton addBtn;
    private Button addBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

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

//                odometer.setText("");
//                price.setText("");
//                totalCost.setText("");
            }
        });
    }


}