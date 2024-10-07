package com.majemase.estudiarinformatica;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView lblSol;
    Button btnBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] ciclo = {"Desarrollo de app web", "Desarrollo de app multiplataforma", "Administración de sistemas informaticos"};
        String[] poblacion = {"Tomares", "Bormujos", "Gines", "Castilleja de la Cuesta", "Camas", "San Juan", "Mairena del Aljarafe"};
        String[] tipo = {"Presencial", "On-line", "Mixto"};
        Spinner spCiclo = findViewById(R.id.spCiclo);
        spCiclo.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, ciclo));
        Spinner spPoblacion = findViewById(R.id.spPoblacion);
        spPoblacion.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, poblacion));
        Spinner spTipo = findViewById(R.id.spTipo);
        spTipo.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, tipo));
        lblSol = findViewById(R.id.lblSol);
        findViewById(R.id.btBorrar).setOnClickListener(v -> {
            spCiclo.setSelection(1);
            spPoblacion.setSelection(1);
            spTipo.setSelection(1);
            lblSol.setText("");
        });

        spCiclo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                lblSol.setText(spCiclo.getSelectedItem().toString() + " en " + spPoblacion.getSelectedItem().toString() + " de forma " + spTipo.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                lblSol.setText("");
            }
        });

        spPoblacion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                lblSol.setText(spCiclo.getSelectedItem().toString() + " en " + spPoblacion.getSelectedItem().toString() + " de forma " + spTipo.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                lblSol.setText("");
            }
        });

        spTipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                lblSol.setText(spCiclo.getSelectedItem().toString() + " en " + spPoblacion.getSelectedItem().toString() + " de forma " + spTipo.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                lblSol.setText("");
            }
        });
    }
}