package com.example.arrayadapter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listaItens;
    private String itens[]={"joao","jose","maria","edilena","pablo","natalia","francisco","igor"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaItens=findViewById(R.id.ListViewerItens);


        ArrayAdapter<String>adaptador= new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens

        );

        listaItens.setAdapter(adaptador);



    }
}
