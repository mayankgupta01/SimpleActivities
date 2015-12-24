package com.flipkart.mayankgupta.simpleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    // If we initialize textview = findViewById(R.id.textView); here, it will become null, as layout objects are loaded when setContentView is called.
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textview = (TextView) findViewById(R.id.textView);

        //get access to the launching intent
        Intent launchingIntent = getIntent();
        if (launchingIntent != null) {
            String userName = launchingIntent.getStringExtra("USERNAME");
            String password = launchingIntent.getStringExtra("PASSWORD");
            if(userName.equals("mayank") && password.equals("1234")) {
                //show success message
                textview.setText("Login Successful");
            } else {
                //show failure message
                textview.setText("Login Failed");
            }
        }
    }
}
