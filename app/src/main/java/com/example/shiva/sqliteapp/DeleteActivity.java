package com.example.shiva.sqliteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteActivity extends AppCompatActivity {

    DatabaseHelper myDb3;
    EditText textID;
    Button btnClick3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        myDb3=new DatabaseHelper(this);
        textID=(EditText)findViewById(R.id.delete_et);
        btnClick3=(Button)findViewById(R.id.delete_btn);

        btnClick3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Click4();
            }
        });
    }
    private void Click4()
    {
        String ID=textID.getText().toString();
        Integer result = myDb3.deleteData(ID);
        Toast.makeText(this, result+" :Rows Affected", Toast.LENGTH_SHORT).show();
    }
}
