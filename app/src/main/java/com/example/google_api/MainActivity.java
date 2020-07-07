package com.example.google_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt1(View view) {

        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);//为Intent设置动
        String data="https://www.google.com/maps/dir/?api=1&origin=台中火車站&destination=台北";
        intent.setData(Uri.parse(data));//为Intent设置数据
        startActivity(intent);//将Intent传递给Activity


    }

    public void bt2(View view) {

        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);//为Intent设置动
        String data="https://www.google.com/maps/search/?api=1&query=";
        intent.setData(Uri.parse(data));//为Intent设置数据
        startActivity(intent);//将Intent传递给Activity

    }
}