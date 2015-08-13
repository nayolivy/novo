package com.example.xubuntu_developer.testando;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AtividadePrincipalNova extends ActionBarActivity {
    private ArrayAdapter mAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_principal_nova);
        String[] dados = new String[]{
                "NossaSala",

                "Angela",
                "Nayara",
                "Éder",
                "Lucas",
                "Ricardo",
                "fátima"
        };

        List<String> NossaSala = new ArrayList<>(Arrays.asList(dados));


        mAdaptador = new ArrayAdapter<>(
                getApplicationContext(), // Contexto atual
                R.layout.item_lista_principal, // Nome do ID do layout
                R.id.item_texto, // ID do TextView a ser preenchido
                NossaSala);

        ListView listView = (ListView) findViewById(R.id.lista_principal);
        listView.setAdapter(mAdaptador);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_atividade_principal_nova, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
