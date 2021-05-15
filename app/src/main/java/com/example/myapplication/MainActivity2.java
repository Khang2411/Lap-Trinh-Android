package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.model.PTB2;

public class MainActivity2 extends AppCompatActivity {
    EditText txta;
    EditText txtb;
    EditText txtc;
    Button btn_giai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txta = (EditText) findViewById(R.id.txta);
        txtb = (EditText) findViewById(R.id.txtb);
        txtc = (EditText) findViewById(R.id.txtc);
        btn_giai = (Button) findViewById(R.id.btn_giai);
        btn_giai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float a = Float.parseFloat(txta.getText().toString());
                    float b = Float.parseFloat(txtb.getText().toString());
                    float c = Float.parseFloat(txtc.getText().toString());
                    PTB2 ptb2 = new PTB2(a, b, c);
                    Toast.makeText(getApplicationContext(), "" + ptb2.giaiPT(), Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Lỗi Nhập Liệu", Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}