package com.example.ndpsh.prueba_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btn;
    private final String GREETER = "Hello from the other side!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Forzar y cargar icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_mylauncher);


        btn = (Button) findViewById(R.id.buttonMain);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acceder al segundo activity y mandarle una string
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("greeter",GREETER);
                startActivity(intent);
            }
        });
    }
}
