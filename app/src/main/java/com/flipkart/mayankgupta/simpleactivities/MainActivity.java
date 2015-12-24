package com.flipkart.mayankgupta.simpleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userNameET;
    EditText passwordET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameET = (EditText) findViewById(R.id.editText);
        passwordET = (EditText) findViewById(R.id.editText2);
    }

    public void login(View view) {
        String userName = userNameET.getText().toString();
        String password = passwordET.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("USERNAME", userName);
        intent.putExtra("PASSWORD", password);

        startActivity(intent);
    }
}
