package com.example.app_radiobotton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private TextView ans;
    private RadioButton rb1;
    private RadioButton rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.et1);
        n2 = (EditText) findViewById(R.id.et2);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        ans = (TextView) findViewById(R.id.tv2);
    }

    //calcular
    public void Calcular(View view){
        String v1s = n1.getText().toString();
        String v2s = n2.getText().toString();
        int v1 = Integer.parseInt(v1s);
        int v2 = Integer.parseInt(v2s);

        if(rb1.isChecked()==true){
            int suma = v1 + v2;
            String sum = String.valueOf(suma);
            ans.setText(sum);
        }else if(rb2.isChecked()==true){
            int resta = v1 - v2;
            String res = String.valueOf(resta);
            ans.setText(res);
        }
    }
}