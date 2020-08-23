package com.example.gitpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_home_welcome;
    Button btn_all_book,btn_add_book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_home_welcome = (TextView) findViewById(R.id.lay_tv_Home_welcome);
        btn_all_book = (Button) findViewById(R.id.lay_btn_all_book);
        btn_add_book = (Button)findViewById(R.id.lay_btn_add_book);

        btn_all_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_btn_all_book = new Intent(MainActivity.this,BookList.class);
                startActivity(intent_btn_all_book);
            }
        });

        btn_add_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_btn_add_book = new Intent(MainActivity.this,AddBook.class);
                startActivity(intent_btn_add_book);
            }
        });
    }
}