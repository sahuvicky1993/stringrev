package com.example.mysecondproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtword;
    TextView display;
    Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtword  =findViewById(R.id.word);
        display = findViewById(R.id.Reversedword);
        btnDisplay= findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String input= txtword.getText().toString();

                byte[] strAsByteArray = input.getBytes();

                byte[] result = new byte[strAsByteArray.length];
                for (int i = 0; i < strAsByteArray.length; i++)
                    result[i] = strAsByteArray[strAsByteArray.length - i - 1];

                display.setText(new String(result));

            }
        });




    }
}