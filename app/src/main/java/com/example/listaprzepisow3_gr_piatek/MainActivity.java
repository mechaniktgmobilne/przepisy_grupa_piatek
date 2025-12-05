package com.example.listaprzepisow3_gr_piatek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listViewKategorie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewKategorie = findViewById(R.id.listViewKategorie);
        listViewKategorie.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        view.setBackgroundColor(Color.GRAY);
                        //Toast.makeText(MainActivity.this, "kliknięto element "+i, Toast.LENGTH_SHORT).show();
                        String wybranaKategoria = adapterView.getItemAtPosition(i).toString();

                        Intent intent = new Intent(MainActivity.this,ListaPrzepisowActivity.class);
                        intent.putExtra("KATEGORIA",wybranaKategoria);
                        startActivity(intent);
                    }
                }
        );
    }
}