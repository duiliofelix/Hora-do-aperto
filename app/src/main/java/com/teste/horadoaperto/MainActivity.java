package com.teste.horadoaperto;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] itensMenuLateral;
    private DrawerLayout mDrawerLayout;
    private ListView listaMenuLateral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itensMenuLateral = getResources().getStringArray(R.array.itens_menu_lateral);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.controlador_menu_lateral);
        listaMenuLateral = (ListView) findViewById(R.id.lista_menu_lateral);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            itensMenuLateral
        );
        listaMenuLateral.setAdapter(adaptador);
        listaMenuLateral.setOnItemClickListener(new DrawerItemClickListener());

        Toolbar barraPrincipal = (Toolbar) findViewById(R.id.barra_principal);
        setSupportActionBar(barraPrincipal);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //
        }
    }
}
