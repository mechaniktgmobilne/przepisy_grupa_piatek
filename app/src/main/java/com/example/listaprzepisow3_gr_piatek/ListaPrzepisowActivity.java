package com.example.listaprzepisow3_gr_piatek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {
    private ArrayList<Przepis> przepisyArrayList;
    private ListView listViewPrzepisy;
    private ArrayAdapter<Przepis> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);


        przepisyArrayList = RepozytoriumPrzepisow.zwrocPrzepisy();
        listViewPrzepisy = findViewById(R.id.listViewPrzepisy);
        arrayAdapter = new ArrayAdapter<>(
                ListaPrzepisowActivity.this,
                android.R.layout.simple_list_item_1,
                przepisyArrayList
        );
        listViewPrzepisy.setAdapter(arrayAdapter);
    }
}