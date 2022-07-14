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

 //Until here is default Android creation. From here on I wrote.   
    
    //defining a method called "clickMethod". In the Activity_Main.xml there is a button element with "onClick" linked to this method here.
    public void clickMethod (View view) {
        
        //define the input fields. Using "EditText" because this field is being changed by user input.
        // Syntax explanation: R - resources, all resources that exist. id - select from R by using their idName
        EditText last = findViewById(R.id.lastName);
        EditText first = findViewById(R.id.firstName);
        EditText email = findViewById(R.id.emailAddress);

        //define the output fields
        TextView rlast = findViewById(R.id.regLast);
        TextView rfirst = findViewById(R.id.regFirst);
        TextView remail = findViewById(R.id.regEmail);

        //enter input data in output field. The "getText().toString()" part is needed to normify the output to string before printing it (i think).
        rlast.setText(last.getText().toString());
        rfirst.setText(first.getText().toString());
        remail.setText(email.getText().toString());

    }
}
