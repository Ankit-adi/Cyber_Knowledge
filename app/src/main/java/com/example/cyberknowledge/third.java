package com.example.cyberknowledge;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void dsa(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%213925&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void dec(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%213923&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void math(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%213925&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void wt(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%213966&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void dms(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%213922&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }


}

