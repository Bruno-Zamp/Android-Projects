package com.brunozamp.pedrapapeltesoura;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionarTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void selecionarPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void opcaoSelecionada(String escolhaUsuario){

        ImageView imagemResultado = findViewById(R.id.imageResultado);
        TextView textoResultado = findViewById(R.id.textResultado);

        //Gerar número aleatório
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int numeroAleatorio = new Random().nextInt(3);
        String escolhaApp = opcoes[numeroAleatorio];

        switch (escolhaApp){
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;

        }
        //App ganhador
        if(     escolhaApp=="pedra" && escolhaUsuario=="tesoura" ||
                escolhaApp=="papel" && escolhaUsuario=="pedra" ||
                escolhaApp=="tesoura" && escolhaUsuario=="papel"
        ){
            textoResultado.setText("A máquina venceu!");
        }
        //Empate
        else if( escolhaApp == escolhaUsuario ){
            textoResultado.setText("Empatou!");
        }
        //Usuário ganhador
        else{
            textoResultado.setText("Você ganhou!!");
        }


    }

}
