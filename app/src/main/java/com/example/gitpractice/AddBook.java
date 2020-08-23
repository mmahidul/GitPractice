package com.example.gitpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddBook extends AppCompatActivity {
    Button btn_allbooks,btn_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addbook);

        btn_allbooks = (Button) findViewById(R.id.btn_allbooks);

        btn_allbooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AddBook.this,BookList.class);
                startActivity(i);
            }
        });

        btn_home = (Button) findViewById(R.id.btn_save);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AddBook.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}