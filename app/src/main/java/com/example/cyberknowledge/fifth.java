package com.example.cyberknowledge;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class fifth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }

    public void fla(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKWV18L%2DZrFNIp0&id=F83F867EC6DCFB6D%213498&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void hpca(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKWV18L%2DZrFNIp0&id=F83F867EC6DCFB6D%213256&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void os(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKWV18L%2DZrFNIp0&id=F83F867EC6DCFB6D%213366&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void cn(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKWV18L%2DZrFNIp0&id=F83F867EC6DCFB6D%213265&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }
    public void se(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://onedrive.live.com/?authkey=%21AKWV18L%2DZrFNIp0&id=F83F867EC6DCFB6D%213383&cid=F83F867EC6DCFB6D"));
        startActivity(intent);
    }


}

