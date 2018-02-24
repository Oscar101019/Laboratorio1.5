package com.example.oscar.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by oscar on 18/02/18.
 */

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    ArrayList<String> listNombres;
    ArrayList<String> listNum;
    ArrayList<String> listCarrera;


    public AdapterDatos(ArrayList<String> listNombres,ArrayList<String> listNum,ArrayList<String> listCarrera) {
        this.listNum = listNum;
        this.listNombres = listNombres;
        this.listCarrera = listCarrera;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_list,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.asignarNombres(listNombres.get(position));
        holder.asignarNumeros(listNum.get(position));
        holder.asignarCarrera(listCarrera.get(position));
    }

    @Override
    public int getItemCount() {
        return listNombres.size() + listCarrera.size() + listNum.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView Nombres;
        TextView Num;
        TextView Carr;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            Nombres=(TextView) itemView.findViewById(R.id.idNombre);
            Num=(TextView) itemView.findViewById(R.id.idNumero);
            Carr=(TextView) itemView.findViewById(R.id.idCarrera);


        }

        public void asignarNombres(String nombres) {
            Nombres.setText(nombres);
        }

        public void asignarNumeros(String numeros){
            Num.setText(numeros);
        }

        public void asignarCarrera(String carrera){
            Carr.setText(carrera);
        }

    }
}

