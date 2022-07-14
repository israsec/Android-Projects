package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMethod (View view) {
        //define the input fields.
        EditText last = findViewById(R.id.lastName);
        EditText first = findViewById(R.id.firstName);
        EditText email = findViewById(R.id.emailAddress);

        //define the output fields
        TextView rlast = findViewById(R.id.regLast);
        TextView rfirst = findViewById(R.id.regFirst);
        TextView remail = findViewById(R.id.regEmail);

        //enter input data in output field
        rlast.setText(last.getText().toString());
        rfirst.setText(first.getText().toString());
        remail.setText(email.getText().toString());

    }
}