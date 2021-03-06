package com.example.part1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText fNumber = (EditText) findViewById(R.id.etFnumber);
        EditText sNumber = (EditText) findViewById(R.id.etSnumber);
        Button btnSum = (Button) findViewById(R.id.btnSum);
        TextView tvSum =(TextView) findViewById(R.id.tvSum);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(fNumber.getText().toString());
                int num2 = Integer.parseInt(sNumber.getText().toString());
                int sum = num1 + num2;
                tvSum.setText(sum + "");
            }
        });
    }
}