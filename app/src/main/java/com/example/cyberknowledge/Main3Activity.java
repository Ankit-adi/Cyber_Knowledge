package com.example.cyberknowledge;;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public  void first(View v){
        Intent intent=new Intent(Main3Activity.this,first.class);
        startActivity(intent);
    }
    public  void second(View v){
        Intent intent=new Intent(Main3Activity.this,second.class);
        startActivity(intent);
    }
    public  void third(View v){
        Intent intent=new Intent(Main3Activity.this,third.class);
        startActivity(intent);
    }
    public  void fourth(View v){
        Intent intent=new Intent(Main3Activity.this,fourth.class);

        startActivity(intent);
    }
    public  void fifth(View v){
        Intent intent=new Intent(Main3Activity.this,fifth.class);
        startActivity(intent);
    }
    public  void sixth(View v){

        Intent intent=new Intent(Main3Activity.this,sixth.class);
        startActivity(intent);
    }
    public  void clan(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214231&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void c_lan(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214224&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void data(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214225&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void gate(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214226&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void web(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214220&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void python(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214243&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
}
