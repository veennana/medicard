package com.example.medicard;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpPage extends AppCompatActivity
{
    EditText Username,Password,Name,Birthday,Email;
    String UserText,PassText,NameText,BdayText,EmailText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Username = (EditText) findViewById(R.id.Username);
        Password = (EditText) findViewById(R.id.Password);
        Name = (EditText) findViewById(R.id.Name);
        Birthday = (EditText) findViewById(R.id.Birthday);
        Email = (EditText) findViewById(R.id.Email);

    }

    public void SignUpNow (View view)
    {
        UserText = Username.getText().toString();
        PassText = Password.getText().toString();
        NameText = Name.getText().toString();
        BdayText = Birthday.getText().toString();
        EmailText = Email.getText().toString();

        if ((UserText.equals("")) || (PassText.equals("")) || (NameText.equals("")) || (BdayText.equals("")) || (EmailText.equals("")))
        {
            Toast.makeText(this,"Cannot blank anything",Toast.LENGTH_SHORT).show();
        }
        else
        {

        }
    }

}
