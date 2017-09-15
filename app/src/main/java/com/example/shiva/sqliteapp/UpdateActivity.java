package com.example.shiva.sqliteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {

    DatabaseHelper myDb2;
    EditText textid,textname,textsurname,textmarks;
    Button btnClick2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        myDb2=new DatabaseHelper(this);
        textid=(EditText)findViewById(R.id.update_et1);
        textname=(EditText)findViewById(R.id.update_et2);
        textsurname=(EditText)findViewById(R.id.update_et3);
        textmarks=(EditText)findViewById(R.id.update_et4);
        btnClick2=(Button)findViewById(R.id.update_btn);

        btnClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Click3();
            }
        });
    }
    private void Click3()
    {
        String id=textid.getText().toString();
        String name=textname.getText().toString();
        String surname=textsurname.getText().toString();
        String marks=textmarks.getText().toString();
        boolean result = myDb2.updateData(id, name, surname, marks);
        if(result==true)
        {
            Toast.makeText(this, "Data Updated Successfully", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "No Rows Affected", Toast.LENGTH_SHORT).show();
        }

    }
}
