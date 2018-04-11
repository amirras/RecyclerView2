package com.example.android.myapplicationrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.myapplicationrecyclerview.adapters.CarsAdapter;
import com.example.android.myapplicationrecyclerview.model.CarTO;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCars;
    CarsAdapter carsAdapter;
    List<CarTO> carTOS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carTOS = new ArrayList<>();
        setCarValues();

        rvCars = (RecyclerView) findViewById(R.id.rcCars);
        carsAdapter = new CarsAdapter(getApplicationContext(), carTOS);

        rvCars.setAdapter(carsAdapter);

        rvCars.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }

    public void setCarValues(){

        String[] names = getResources().getStringArray(R.array.names);
        String[] colors = getResources().getStringArray(R.array.colors);
        String[] models = getResources().getStringArray(R.array.models);
        carTOS.clear();

        for(int i=0;i<3;i++){
            CarTO carTO = new CarTO(names[i],colors[i],models[i]);
            carTOS.add(carTO);
        }

    }
}
