package com.example.tp4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WelcomActivity extends AppCompatActivity {
    TextView txtwelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
        txtwelcome=findViewById(R.id.txtwelcome);
        String nom=getIntent().getStringExtra("name");
        String prenom=getIntent().getStringExtra("lastname");
        String mail=getIntent().getStringExtra("mymail");
        String message="Bienvenue"+ nom+""+prenom+ ",\n" + "c'est la deuxieme activite.\n"+ "vous serez bientot contacté sur :"+mail+"";
        txtwelcome.setText(message);
    }
}