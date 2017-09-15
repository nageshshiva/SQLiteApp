package com.example.shiva.sqliteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertActivity extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText txtName,txtSurName,txtMarks;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        myDb=new DatabaseHelper(this);
        txtName=(EditText)findViewById(R.id.et1);
        txtSurName=(EditText)findViewById(R.id.et2);
        txtMarks=(EditText)findViewById(R.id.et3);
        btnClick=(Button)findViewById(R.id.insertbtn);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Click1();
            }
        });

    }
    private void Click1()
    {
        String name=txtName.getText().toString();
        String surname=txtSurName.getText().toString();
        String marks=txtMarks.getText().toString();
        boolean result = myDb.insertData(name, surname, marks);
        if(result==true)
        {
            Toast.makeText(this, "Data Inserted successfully", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Data Insertion failed", Toast.LENGTH_SHORT).show();
        }
    }
}
