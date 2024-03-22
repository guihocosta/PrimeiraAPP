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

//        Le o arquivo de Layout e constroi a interface
        setContentView(R.layout.activity_main);

//        Obtem o botao enviar
        Button btnEnviar = findViewById(R.id.btnEnviar);

//        Evento de click do botao - cria um "ouvidor" de cliques
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override

//            Metodo chamado toda vez que tem um click no mouse
            public void onClick(View v) {

//                Obtem o EditText DigiteAqui
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

//                Obtem o texto que foi digitado pelo usuario
                String textoDigitado = etDigiteAqui.getText().toString();

//                Cria uma intenção para navegar para a proxima tela
                Intent i = new Intent(MainActivity.this,NextActivity.class);

//                Envia o texto da caixa junto com a intent, para enviar para a proxima tela
                i.putExtra("texto", textoDigitado);

//                Inicia a proxima tela
                startActivity(i);
            }
        });
    }
}

