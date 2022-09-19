package com.example.simplecalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    float sol=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.n1);
        number2=findViewById(R.id.n2);
        b1=findViewById(R.id.add);
        b2=findViewById(R.id.sub);
        b3=findViewById(R.id.mul);
        b4=findViewById(R.id.div);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(number1.getText().toString());
                float b = Float.parseFloat(number2.getText().toString());
                sol=a+b;
                Toast.makeText(MainActivity.this,"The sum is " +sol
                        ,Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(number1.getText().toString());
                float b = Float.parseFloat(number2.getText().toString());
                sol=a-b;
                Toast.makeText(MainActivity.this,"The difference is "
                        +sol,Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a =Float.parseFloat(number1.getText().toString());
                float b =Float.parseFloat(number2.getText().toString());
                sol=a*b;
                Toast.makeText(MainActivity.this,"The product is "
                        +sol,Toast.LENGTH_SHORT).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(number1.getText().toString());
                float b = Float.parseFloat(number2.getText().toString());
                sol=a/b;
                Toast.makeText(MainActivity.this,"The division is "
                        +sol,Toast.LENGTH_SHORT).show();
            }
        });
    }
}