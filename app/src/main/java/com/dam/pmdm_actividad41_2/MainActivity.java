package com.dam.pmdm_actividad41_2;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editTextNumber);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dni = editText.getText().toString();

            if (!dni.isEmpty()){
                int numeroDni = Integer.parseInt(dni);
                char letraDni = calcularLetra(numeroDni);

                Toast.makeText(MainActivity.this, "Letra : "+letraDni, Toast.LENGTH_SHORT).show();
            }


            }
        });

    }

    private char calcularLetra(int numeroDni) {
        char[] letrasDni = {'T', 'R','W', 'A', 'G','M', 'Y', 'F','P', 'D', 'X','B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letrasDni[numeroDni % 23];
    }
}