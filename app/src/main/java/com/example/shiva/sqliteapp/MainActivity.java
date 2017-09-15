package com.example.shiva.sqliteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAddData,btnviewAll,btnDelete,btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddData=(Button)findViewById(R.id.button_add);
        btnviewAll=(Button)findViewById(R.id.button_viewAll);
        btnUpdate=(Button)findViewById(R.id.button_update);
        btnDelete=(Button)findViewById(R.id.button_delete);

        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i1=new Intent(MainActivity.this,InsertActivity.class);
                startActivity(i1);
            }
        });

        btnviewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i1=new Intent(MainActivity.this,ReadActivity.class);
                startActivity(i1);
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i1=new Intent(MainActivity.this,UpdateActivity.class);
                startActivity(i1);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i1=new Intent(MainActivity.this,DeleteActivity.class);
                startActivity(i1);
            }
        });
    }
}