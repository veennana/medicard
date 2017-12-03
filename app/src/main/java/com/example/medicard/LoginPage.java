package com.example.medicard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity
{
    EditText Username,Password;
    Button Login,SignUp;
    String UserText,PassText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Username = (EditText) findViewById(R.id.Username);
        Password = (EditText) findViewById(R.id.Password);

        Login = (Button) findViewById(R.id.Login);
        SignUp = (Button) findViewById(R.id.Sign_Up);
    }

    public void Login (View view)
    {
        UserText = Username.getText().toString();
        PassText = Password.getText().toString();

        //TODO: CHECK USER AND PASS SA INTERNET

        if ((UserText.equals("U")) && (PassText.equals("P")))
        {
            Username.setText("");
            Password.setText("");

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("ID","1234"); //TODO: AFTER LOGGING IN GET UNIQUE ID THEN SYNC NA WITH SERVER

            startActivity(intent);
        }

        else if ((UserText.equals("")) || (PassText.equals("")))
        {
            Toast.makeText(this,"Cannot Blank anything",Toast.LENGTH_SHORT).show();
        }

        else
        {
            Toast.makeText(this,"Credentials not found",Toast.LENGTH_SHORT).show();
        }
    }

    public void SignUp (View v)
    {
        Intent in = new Intent (this,SignUpPage.class);
        startActivity(in);
    }
}
