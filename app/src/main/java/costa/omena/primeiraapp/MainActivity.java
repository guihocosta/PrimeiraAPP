package costa.omena.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Lê o arquivo de Layout e constrói a interface
        setContentView(R.layout.activity_main);

//        Procurar botão através do seu id
        Button btnEnviar = findViewById(R.id.btnEnviar);

//        Evento de click do botão -> cria um "ouvidor" de cliques
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override

//            Função do click
            public void onClick(View v) {

//                Procurar EditText através do seu id
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

//                Pega o texto da caixa de texto
                String textoDigitado = etDigiteAqui.getText().toString();

//                Cria uma intenção i para ter a mudança de uma tela para a outra
                Intent i = new Intent(MainActivity.this,NextActivity.class);

//                Envia o texto da caixa junto com a intent, para enviar para a outra tela
                i.putExtra("texto", textoDigitado);

//                Inicia a próxima tela
                startActivity(i);
            }
        });
    }
}

