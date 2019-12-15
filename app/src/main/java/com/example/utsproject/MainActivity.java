package com.example.utsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.btn_about);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.btn_coffee);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.btn_bio);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.btn_news);
        btnMove.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_about:
                startActivity(new Intent(this, SecondActivity.class));
                break;
            case R.id.btn_coffee:
                startActivity(new Intent(this, ThirdActivity.class));
                break;
            case R.id.btn_bio:
                startActivity(new Intent(this, ForthActivity.class));
                break;
            case R.id.btn_news:
                startActivity(new Intent(this, KategoriActivity.class));
                break;
        }
    }

}
