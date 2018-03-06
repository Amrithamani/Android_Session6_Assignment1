package com.amritha.acadgild.android_session6_assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //UI references
    EditText email;

    EditText password;

    Button login;

    String emailText;

    String passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Getting a reference to UI object of the main layout */

        email = findViewById(R.id.email);

        password = findViewById(R.id.password);

        login = findViewById(R.id.button_login);

        /** Defining a click  listener */

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //getting the text

                emailText = email.getText().toString();

                passwordText = password.getText().toString();

                CheckingPasswordAndEmail();//calling Method

            }
        });


    }

    public void CheckingPasswordAndEmail() {

        // Check for a valid password, if the user entered one.
        if (passwordText == null) {
            password.setError("Password Required");
        } else if (!isPasswordValid(passwordText)) {
            password.setError("InValid Password");
        }

        // Check for a valid email address.
        if (emailText == null) {
            email.setError("Email Required");

        } else if (!isEmailValid(emailText)) {
            email.setError("Invalid Email");
        } else {
            Toast.makeText(getApplicationContext(),
                    "Login Successful", Toast.LENGTH_LONG).show();
        }
    }

//Defining EmailValid Method

    public boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

//Defining PasswordValid Method

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }
}