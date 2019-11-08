package com.example.cyberknowledge;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    EditText u;
    EditText p;
    Button s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        u = (EditText) findViewById(R.id.login1);
        p = (EditText) findViewById(R.id.pass1);
        s = (Button) findViewById(R.id.butt1);
    }

    public void signass(View v) {

        String username = u.getText().toString();
        String password = p.getText().toString();
        //int user = Integer.parseInt(username);
        //int pass = Integer.parseInt(password);

        if (username.equals(password) && username.length()!=0 && password.length()!=0) {
            Toast.makeText(this, "You Signed In", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),Main3Activity.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show();
        }
    }
}
