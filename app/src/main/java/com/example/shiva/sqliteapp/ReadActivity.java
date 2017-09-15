package com.example.shiva.sqliteapp;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ReadActivity extends AppCompatActivity {

    DatabaseHelper myDb1;
    TextView txtResult;
    Button btnClick1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        myDb1=new DatabaseHelper(this);
        txtResult=(TextView)findViewById(R.id.read_tv1);
        btnClick1=(Button)findViewById(R.id.readbtn);

        btnClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Click2();
            }
        });
    }

    private void Click2()
    {
        Cursor res=myDb1.getAllData();
        StringBuffer stringBuffer=new StringBuffer();
        if(res!=null && res.getCount()>0)
        {
            while (res.moveToNext())
            {
                stringBuffer.append("Id: " + res.getString(0) + "\n");
                stringBuffer.append("Name: " + res.getString(1) + "\n");
                stringBuffer.append("Surname: " + res.getString(2) + "\n");
                stringBuffer.append("Marks: " + res.getString(3) + "\n"+"\n");
            }
            txtResult.setText(stringBuffer.toString());
            Toast.makeText(this, "Data Retrieved Successfully", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "No Data to Retrieve", Toast.LENGTH_SHORT).show();
        }
    }
}
