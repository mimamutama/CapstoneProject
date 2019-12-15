package com.example.utsproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;


public class ThirdActivity extends AppCompatActivity {

    public void call (View view) {
        String nomor = "081904101999" ;
        Intent call = new Intent(Intent. ACTION_DIAL);
        call.setData(Uri. fromParts("tel",nomor,null));
        startActivity(call);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public void submitOrder(View view) {

        EditText nameField = (EditText)findViewById(R.id.name_field);
        String name = nameField.getText().toString();


        EditText phoneField = (EditText)findViewById(R.id.phone_field);
        String phone = phoneField.getText().toString();

        EditText messagesField = (EditText)findViewById(R.id.messages_field);
        String messages = messagesField.getText().toString();

        EditText subjekField = (EditText)findViewById(R.id.subjek_field);
        String subjek = subjekField.getText().toString();

        String sum = "Name : " + name + "\nPhone : " + phone + "\nMessages : " +messages;

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:m.imam.utama@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, subjek);
        intent.putExtra(Intent.EXTRA_TEXT, sum);


        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }

    }

}