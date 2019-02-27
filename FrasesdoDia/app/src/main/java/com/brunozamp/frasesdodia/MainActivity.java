package com.brunozamp.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] listaFrases = {
                "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.",
                "Imagine uma nova história para sua vida e acredite nela.",
                "Ser feliz sem motivo é a mais autêntica forma de felicidade.",
                "Não permito que nenhuma reflexão filosófica me tire a alegria das coisas simples da vida.",
                "Não são as nossas ideias que nos fazem otimistas ou pessimistas, mas o otimismo e o pessimismo de origem fisiológica que fazem as nossas ideias",
                "O contrário do pessimismo raramente é o otimismo. O contrário do pessimismo, se não é a boa intenção de injetar força nos fracos, o que é bonito e faz bem, é quase sempre a idiota.",
                "Creio que tenho prova suficiente de que falo a verdade: a pobreza.",
                "Sim, sei de onde venho! Insatisfeito com a labareda ardo para me consumir! Aquilo em que toco torna-se luz. Carvão aquilo que abandono. Sou certamente labareda!",
                "Só sei que nada sei e por saber que nada sei, fico sabendo mais que os outros."
        };
        TextView texto = findViewById(R.id.text_resultado);
        texto.setText(listaFrases[new Random().nextInt(listaFrases.length)]);
    }

}
