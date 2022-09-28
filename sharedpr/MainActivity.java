package com.example.sharedprefrences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);

    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), "ON Pause..", Toast.LENGTH_SHORT).show();

        SharedPreferences sh = getSharedPreferences("Sha1",MODE_PRIVATE);
        SharedPreferences.Editor edit = sh.edit();

        edit.putString("nm",e1.getText().toString());
        edit.putString("ph",e2.getText().toString());
        edit.apply();

    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(), "ON RESUME..", Toast.LENGTH_SHORT).show();

        SharedPreferences sh = getSharedPreferences("Sha1",MODE_PRIVATE);

        String nm = sh.getString("nme","");
        String ph = sh.getString("phn","");

        e1.setText(nm);
        e2.setText(ph);
    }
}

