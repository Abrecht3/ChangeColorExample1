package com.example.albertoperez.changecolorexample;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    ListView lvColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("Values",MODE_PRIVATE);
        int theme=sharedPreferences.getInt("Theme",1);
        switch(theme)
        {
            case 1: setTheme(R.style.AppTheme);break;
            case 2: setTheme(R.style.AppBlue);break;
            case 3: setTheme(R.style.AppRed);break;
            case 4: setTheme(R.style.AppGreen);break;
            case 5: setTheme(R.style.AppOrange);break;
            case 6: setTheme(R.style.AppViolet);break;
            case 7: setTheme(R.style.AppPink);break;
            case 8: setTheme(R.style.AppYellow);break;
            case 9: setTheme(R.style.AppBlack);break;

        }
        setContentView(R.layout.activity_main);
        //Relleno mi arreglo
        Datos iconoDatos[]=new Datos[]{

                new Datos(R.drawable.bg_azul,"Azul"),
                new Datos(R.drawable.bg_rojo,"Rojo"),
                new Datos(R.drawable.bg_verde,"Verde"),
                new Datos(R.drawable.bg_naranja,"Naranja"),
                new Datos(R.drawable.bg_morado,"Morado"),
                new Datos(R.drawable.bg_rosa,"Rosa"),
                new Datos(R.drawable.bg_amarillo,"Amarillo"),
                new Datos(R.drawable.bg_negro,"negro"),

        };

        //al adaptador le paso el contenido de mi array
        DatosAdapter adapter=new DatosAdapter(this,R.layout.listview_item_row,iconoDatos );

        //Traer la lista y enlazarla con su vista
        lvColor=(ListView)findViewById(R.id.lv);
        lvColor.setAdapter(adapter);

        lvColor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                switch (arg2) {
                    case 0:

                        sharedPreferences.edit().putInt("Theme", 2).apply();
                        finish();
                        startActivity(getIntent());
                        break;
                    case 1:
                        sharedPreferences.edit().putInt("Theme", 3).apply();
                        finish();
                        startActivity(getIntent());
                        break;
                    case 2:
                        sharedPreferences.edit().putInt("Theme", 4).apply();
                        finish();
                        startActivity(getIntent());
                        break;
                    case 3:
                        sharedPreferences.edit().putInt("Theme", 5).apply();
                        finish();
                        startActivity(getIntent());
                        break;
                    case 4:
                        sharedPreferences.edit().putInt("Theme", 6).apply();
                        finish();
                        startActivity(getIntent());
                        break;
                    case 5:
                        sharedPreferences.edit().putInt("Theme", 7).apply();
                        finish();
                        startActivity(getIntent());
                        break;
                    case 6:
                        sharedPreferences.edit().putInt("Theme", 8).apply();
                        finish();
                        startActivity(getIntent());
                        break;
                    case 7:
                        sharedPreferences.edit().putInt("Theme", 9).apply();
                        finish();
                        startActivity(getIntent());
                        break;
                }
            }
        });

    }
}
