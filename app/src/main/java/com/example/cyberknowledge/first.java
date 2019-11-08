package com.example.cyberknowledge;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void betc(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214388&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void cprog(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214385&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void chemist(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214389&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void math(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214362&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }


}

