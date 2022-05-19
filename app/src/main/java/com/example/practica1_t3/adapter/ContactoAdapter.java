package com.example.practica1_t3.adapter;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica1_t3.Contactos;
import com.example.practica1_t3.R;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class ContactoAdapter extends  RecyclerView.Adapter<ContactoAdapter.NameViewHolder>{



    private ArrayList<Contactos> item;

    public ContactoAdapter(ArrayList<Contactos> item) {
        this.item = item;
    }

    @Override
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contacto,parent,false);
        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NameViewHolder holder, int position) {
        Contactos cont = item.get(position);

        TextView ed1 = holder.itemView.findViewById(R.id.nameContacto);
        ed1.setText(cont.getNombre());

        TextView ed2 = holder.itemView.findViewById(R.id.numberContacto);
        ed2.setText(cont.getNumero());

        Button btclick = holder.itemView.findViewById(R.id.buttonLlamar);
        Button btclick2 = holder.itemView.findViewById(R.id.buttonMensaje);

        btclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAIN_APP", "clickboton llamar");
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", String.valueOf(cont.getNumero()), null));
                holder.itemView.getContext().startActivity(intent);
            }
        });

        btclick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAIN_APP", "clickboton Mensaje");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", String.valueOf(cont.getNumero()), null));
                holder.itemView.getContext().startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    class NameViewHolder extends RecyclerView.ViewHolder{

        public NameViewHolder( View itemView) {
            super(itemView);
        }
    }
}
