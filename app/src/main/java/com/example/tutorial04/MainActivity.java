package com.example.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    EditText editemail,editpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.btnlogin);
        editemail = findViewById(R.id.editemail);
        editpassword = findViewById(R.id.editpassword);
    }

    public void btnLoginClick(View view) {
        String Valueusername = editemail.getText().toString();
        String Valuepassword = editpassword.getText().toString();
        if(Valueusername.equals(""))
        {
            Toast.makeText(this, "Username can not be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(Valuepassword.equals(""))
        {
            Toast.makeText(this, "password can not be empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(Valuepassword.length() < 6)
        {
            Toast.makeText(this, "password mus be maximum 6 size", Toast.LENGTH_SHORT).show();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(Valueusername).matches())
        {
            Toast.makeText(this, "user name must be Preper email Address", Toast.LENGTH_SHORT).show();
        }

        if (Valueusername.equals("kjivrajani728@rku.ac.in") && Valuepassword.equals("123456"))
        {
            Intent intent = new Intent(MainActivity.this,login.class);
            startActivity(intent);
            Toast.makeText(this, "Login Succesful", Toast.LENGTH_SHORT).show();
            finish();
        }
        else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }
    }