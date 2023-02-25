package com.example.my1stapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.my1stapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText editText2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText n1 = (EditText) findViewById(R.id.num1);
        EditText n2 = (EditText) findViewById(R.id.num2);
        int a = Integer.parseInt( n1.getText().toString());
        int b = Integer.parseInt( n2.getText().toString());
        a += b;
        String message = editText1.getText().toString() + " " + editText2.getText().toString();
        String sum = Integer.toString(a);
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra("sum",sum);
        startActivity(intent);
    }
}