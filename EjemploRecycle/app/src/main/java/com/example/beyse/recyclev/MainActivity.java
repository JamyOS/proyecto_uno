package com.example.beyse.recyclev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> ListDatos;//lista que se envia a la clase adapter
    RecyclerView recycler;//Referencia al reclicer en xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = (RecyclerView) findViewById(R.id.recycleId);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        ListDatos = new ArrayList<String>();//instancia de la lista
        for (int i = 0; i <= 100; i++) {//llena los datos de esa lista
            ListDatos.add("Dato # " + i + "");
        }
        AdapterDatos adapter = new AdapterDatos(ListDatos);//Enviamos la lista en el adaptador para iniciar
        recycler.setAdapter(adapter);
    }
}