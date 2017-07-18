package com.example.dbm0204.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
/**
 * This class extends AppCompatActivity
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnResult(View view){
        EditText ed_TestingText =(EditText) findViewById(R.id.username);
        String actual = ed_TestingText.getText().toString();
        String expected = String.format("Hello, %s!", actual);

        TextView tv_ExpectingText =
                (TextView) findViewById(R.id.tv_password);

        tv_ExpectingText.setText(expected);
    }
}
