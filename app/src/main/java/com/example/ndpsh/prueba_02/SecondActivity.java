package com.example.ndpsh.prueba_02;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private Button   btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //activar flecha ir atras
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);



        textView = (TextView) findViewById(R.id.textViewMain2);
        btnNext = (Button) findViewById(R.id.buttonNext);

        //tomar los datos del intent
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.getString("greeter") != null) {
            String greeder = bundle.getString("greeter");
            Toast.makeText(SecondActivity.this, greeder, Toast.LENGTH_LONG).show();
            textView.setText(greeder);
        } else{
            Toast.makeText(SecondActivity.this, "It is empty", Toast.LENGTH_LONG).show();
        }

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

    }
}
