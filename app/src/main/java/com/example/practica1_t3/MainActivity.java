package com.example.practica1_t3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.practica1_t3.adapter.ContactoAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView rv = findViewById(R.id.rvLista);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        ArrayList<Contactos> it = new ArrayList<>();
        it.add(new Contactos("Piero", "924097775"));
        ContactoAdapter adapter = new ContactoAdapter(it);
        rv.setAdapter(adapter);
        it.add(new Contactos("Juan", "904234587"));
        ContactoAdapter adapter2 = new ContactoAdapter(it);
        rv.setAdapter(adapter2);
        it.add(new Contactos("Emerson", "90423564"));
        ContactoAdapter adapter3 = new ContactoAdapter(it);
        rv.setAdapter(adapter3);
        it.add(new Contactos("Roger", "921345522"));
        ContactoAdapter adapter4 = new ContactoAdapter(it);
        rv.setAdapter(adapter4);
        it.add(new Contactos("Pablo", "984236599"));
        ContactoAdapter adapter5 = new ContactoAdapter(it);
        rv.setAdapter(adapter5);
        it.add(new Contactos("Kary", "944678912"));
        ContactoAdapter adapter6 = new ContactoAdapter(it);
        rv.setAdapter(adapter6);
        it.add(new Contactos("Yan", "954761244"));
        ContactoAdapter adapter7 = new ContactoAdapter(it);
        rv.setAdapter(adapter7);
        it.add(new Contactos("Pedro", "911568700"));
        ContactoAdapter adapter8 = new ContactoAdapter(it);
        rv.setAdapter(adapter8);
        it.add(new Contactos("Elena", "923447734"));
        ContactoAdapter adapter9 = new ContactoAdapter(it);
        rv.setAdapter(adapter9);
        it.add(new Contactos("Ronald", "911678989"));
        ContactoAdapter adapter10 = new ContactoAdapter(it);
        rv.setAdapter(adapter10);


    }
}