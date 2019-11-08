package com.example.cyberknowledge;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class fourth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void daa(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214007&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void pdc(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214016&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void dbms(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214008&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void eco(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214009&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void math(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214015&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }

}

