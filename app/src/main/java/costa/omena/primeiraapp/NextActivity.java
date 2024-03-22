package costa.omena.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_next);

//        Obtem o intent que criou a sua tela
        Intent i = getIntent();

//        Obtem o TextView
        TextView txtView = findViewById(R.id.tvTexto);

//        Obter o texto que veio junto com intent
        String txt = i.getStringExtra("texto");

//        Seta o texto no TextView
        txtView.setText(txt);


    }
}