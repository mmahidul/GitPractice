package com.example.gitpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class BookList extends AppCompatActivity {
    ConstraintLayout constraintLayout;

    TextView booknametextView;
    TextView authornametextView;
    TextView booktypetextview;
    Button addbookbutton;
    Button  homebutton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Book book1 = new Book("The diary of a young girl", "Anna Frank", "Lend");
        Book book2 = new Book("Deyal", "Humayun Ahmed", "Lend");


        booknametextView=(TextView)findViewById(R.id.tv_bookname1);
        authornametextView=(TextView)findViewById(R.id.tv_authorname1);
        booktypetextview=(TextView)findViewById(R.id.tv_booktype1);

        booknametextView.setText(book1.getBookname());
        authornametextView.setText(book1.getAuthorname());
        booktypetextview.setText(book1.getBooktype());

        booknametextView=(TextView)findViewById(R.id.tv_bookname2);
        authornametextView=(TextView)findViewById(R.id.tv_authorname2);
        booktypetextview=(TextView)findViewById(R.id.tv_booktype2);

        booknametextView.setText(book2.getBookname());
        authornametextView.setText(book2.getAuthorname());
        booktypetextview.setText(book2.getBooktype());

        addbookbutton=findViewById(R.id.btn_addbook);
        homebutton=findViewById(R.id.btn_home);

        addbookbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   Intent intent=new Intent(getApplicationContext(),AddBook.class);
                //  int
            }
        });

        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
