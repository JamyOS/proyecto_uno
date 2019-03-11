package com.example.beyse.recyclev;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos>{
    ArrayList<String> ListDatos;

    public AdapterDatos(ArrayList<String> listDatos) {
        this.ListDatos = listDatos;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType){//nos enlazara este adaptador con el archivo intemlist
        View View=LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list,null,false);//se inflo el view
        return new ViewHolderDatos(View);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos viewHolderDatos, int i){//comunicacion entre el adaptador y la clase viewHolderdatos
        viewHolderDatos.AsignarDatos(ListDatos.get(i));//i es la posicion y se envia la informacion que se desea ver
    }

    @Override
    public int getItemCount(){
        return ListDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder{
        TextView dato;
        public ViewHolderDatos(@NonNull View itemView){
            super(itemView);
            dato=itemView.findViewById(R.id.idDato);
        }

        public void AsignarDatos(String datos){
            dato.setText(datos);
        }
    }
}
