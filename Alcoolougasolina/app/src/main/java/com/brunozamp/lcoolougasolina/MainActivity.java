package com.brunozamp.lcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;

    public void calcularPreco(View view){
        editPrecoAlcool= findViewById(R.id.editTextAlcool);
        editPrecoGasolina = findViewById(R.id.editTextGasolina);
        textResultado = findViewById(R.id.textViewResultado);

        if (!validarCampos(editPrecoGasolina, editPrecoAlcool)) {
            calcularMelhorPreco(Double.parseDouble(editPrecoAlcool.getText().toString()), Double.parseDouble(editPrecoGasolina.getText().toString()));
        }
        else {
            textResultado.setText("Você deve preencher todos os campos primeiro");
        }
    }

    public Boolean validarCampos(EditText gasolina, EditText alcool){
        return gasolina.getText() == null || alcool.getText() == null || gasolina.getText().equals("") || alcool.getText().equals("");
    }

    public void calcularMelhorPreco(Double valorAlcool, Double valorGasolina){
        Double resultado = valorAlcool/valorGasolina;
        if( resultado >= 0.7){
            textResultado.setText("Melhor utilizar Gasolina");
        }
        else{
            textResultado.setText("Melhor utilizar Alcool");
        }
    }
}
