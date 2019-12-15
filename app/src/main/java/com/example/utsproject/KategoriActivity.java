package com.example.utsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KategoriActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    private Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        btnMove = findViewById(R.id.btn_indo);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.btn_malay);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.btn_pinoy);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.btn_thai);
        btnMove.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_indo:
                startActivity(new Intent(this, FifthActivity.class));
                break;
            case R.id.btn_malay:
                startActivity(new Intent(this, MalayActivity.class));
                break;
            case R.id.btn_pinoy:
                startActivity(new Intent(this, PinoyActivity.class));
                break;
            case R.id.btn_thai:
                startActivity(new Intent(this, ThaiActivity.class));
                break;
        }
    }

}
