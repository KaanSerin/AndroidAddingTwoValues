package com.example.testapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is how you reference the ui elements
        Button addBtn = findViewById(R.id.addBtn);
        final EditText firstNumEditText = findViewById(R.id.firstNumEditText);
        final EditText secondNumEditText = findViewById(R.id.secondNumEditText);
        final TextView resultTextView = findViewById(R.id.resultTextView);

        // making the button do stuff
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // All of the button functionality goes here
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                resultTextView.setText(Integer.toString(num1 + num2));
            }
        });
    }
}
