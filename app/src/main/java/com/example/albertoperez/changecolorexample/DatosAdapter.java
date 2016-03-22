package com.example.albertoperez.changecolorexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Alberto Perez on 10/09/2015.
 */
//Esta clase es el adaptador
public class DatosAdapter extends ArrayAdapter<Datos>{
    Context context;
    int layoutResourceId;
    Datos datos[]=null;

    public DatosAdapter(Context context,int layoutResourceId,Datos[] datos){
        super(context,layoutResourceId,datos);

        this.context=context;
        this.layoutResourceId=layoutResourceId;
        this.datos=datos;
    }

    public View getView(int position,View convertView,ViewGroup parent){
        View row=convertView;
        DatosHolder holder=null;

        if (row==null){
            LayoutInflater inflater=((Activity)context).getLayoutInflater();
            row=inflater.inflate(layoutResourceId,parent,false);

            holder=new DatosHolder();

            holder.imagen=(ImageView)row.findViewById(R.id.imagen);
            holder.texto=(TextView)row.findViewById(R.id.tv);

            row.setTag(holder);

        }else {
            holder = (DatosHolder) row.getTag();
        }
        Datos datos1=datos[position];
        holder.texto.setText(datos1.nombre);
        holder.imagen.setImageResource(datos1.icon);

        return  row;
    }
//Esta clase debe ejecutarse desde el adaptador
    static  class  DatosHolder{
        ImageView imagen;
        TextView texto;
    }
}
