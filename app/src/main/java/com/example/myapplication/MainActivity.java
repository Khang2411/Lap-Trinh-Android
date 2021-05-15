package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText hsa;
    EditText hsb;
    EditText nghiem;
    Button btn_giai, btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       hsa=(EditText)findViewById(R.id.hsa);
       hsb=(EditText)findViewById(R.id.hsb);
       nghiem=(EditText)findViewById(R.id.nghiem);
       btn_giai=(Button)findViewById(R.id.giai);
       btn_reset=(Button)findViewById(R.id.btn_reset);
//       nghiem.setEnabled(false);
       btn_giai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    float a=Float.parseFloat(hsa.getText().toString());
                    float b=Float.parseFloat(hsb.getText().toString());
                    float No=-b/a;
                    String x=String.valueOf(No);
                    if(a==0){
                        if(b==0){

                            nghiem.setText( "PTVSN");
                        }
                        else{
                            nghiem.setText( "PTVN");
                        }
                    }
                    else{

                        nghiem.setText(x);
                    }


                }catch(Exception e){
                    Toast.makeText(getApplicationContext(),"Lỗi nhập liệu",Toast.LENGTH_SHORT).show();
                }
            }

       });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                hsa.setText("");
                hsb.setText("");
                nghiem.setText("");

            }

        });




    }


}