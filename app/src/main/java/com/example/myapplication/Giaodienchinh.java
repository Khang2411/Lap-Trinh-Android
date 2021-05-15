package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Giaodienchinh extends AppCompatActivity {
    TextView ptb1,ptb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giaodienchinh);
        ptb1=(TextView)findViewById(R.id.ptb1);
        ptb2=(TextView)findViewById(R.id.ptb2);
        ptb1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
//        ptb2.setOnClickListener(new View.OnClickListener(){ // Đúng
//            @Override
//            public void onClick(View v){
//                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
//                startActivity(intent);
//            }
//        });
    }
// test onStart
// onStart chạy sau khi khởi tạo(onCreate) được giao diện
    @Override protected void onStart() {

        super.onStart();
        Log.d("onStart","onStart run sau onCreate");
        ptb2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}