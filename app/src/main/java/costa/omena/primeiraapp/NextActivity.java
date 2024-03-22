package costa.omena.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Lê o arquivo de Layout e constrói a interface
        setContentView(R.layout.activity_next);

//        Pega a intenção que foi criada
        Intent i = getIntent();

//        Procura TextView a partir do seu id
        TextView txtView = findViewById(R.id.tvTexto);

//        Pega o texto da intent
        String txt = i.getStringExtra("texto");

//        Seta o texto no TextView
        txtView.setText(txt);


    }
}