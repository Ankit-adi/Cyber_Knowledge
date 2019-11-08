package com.example.cyberknowledge;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class sixth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
    }

    public void cd(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214165&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void bd(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214164&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void oosd(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214167&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void cg(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKuIWnI6FZIGOos&id=F83F867EC6DCFB6D%214166&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }


}

