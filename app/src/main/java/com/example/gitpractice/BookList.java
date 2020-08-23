package com.example.gitpractice;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.List;

public class BookList extends AppCompatActivity {

    LinearLayout booklist;
    LinearLayout singlebook;
    Button  addbutton;
    Button  homebutton;

    TextView booknameview,authornameview,booktypeview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booklist);


        List<Book> list=new ArrayList<>();
        list.add(new Book("The diary of a young girl", "Anna Frank", "Lend"));
        list.add(new Book("Deyal", "Humayun Ahmed", "Lend"));
        list.add(new Book("Harry Potter", "J. K. Rowling", "Sell"));



        booklist=findViewById(R.id.ll_booklist);

        for(int i=0;i<list.size();i++) {

            singlebook=(LinearLayout)getLayoutInflater().inflate(R.layout.single_book,booklist,false);
            singlebook.setShowDividers(LinearLayout.SHOW_DIVIDER_END);
            singlebook.setDividerDrawable(getDrawable(R.drawable.divider));
            TextView bookname=(TextView)singlebook.findViewById(R.id.tv_bookname);
            TextView authorname=(TextView)singlebook.findViewById(R.id.tv_authorname);
            TextView booktype=(TextView)singlebook.findViewById(R.id.tv_booktype);
            bookname.setText(list.get(i).getBookname());
            authorname.setText("By "+list.get(i).getAuthorname());
            booktype.setText(list.get(i).getBooktype());
            booklist.addView(singlebook);


        }

        addbutton=(Button)findViewById(R.id.btn_addbook);
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   Intent intent=new Intent(getApplicationContext(),AddBook.class);
                   startActivity(intent);
            }
        });

        homebutton=(Button)findViewById(R.id.btn_home);
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),BookList.class);
                startActivity(intent);
            }
        });



    }
}

