package com.example.loginformm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name,password;
    Button b1,b2;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.name1);

        b1=(Button)findViewById(R.id.reset);
        b2=(Button)findViewById(R.id.submit);
        ;
        t1=(TextView)findViewById(R.id.txt1);
        t2=(TextView)findViewById(R.id.txt2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                password.setText("");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u=name.getText().toString();
                t1.setText(u);
                String p=password.getText().toString();
                t2.setText(p);

            }
        });
    }
}