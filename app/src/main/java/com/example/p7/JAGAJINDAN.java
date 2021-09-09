package com.example.p7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class JAGAJINDAN extends AppCompatActivity {

    private CheckBox chk1,chk2,chk3,chk4,chk5,chk6,chk7;
    private Button btn_result;
    private int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jagajindan);

        chk1 = findViewById(R.id.checkBox);
        chk2 = findViewById(R.id.checkBox2);
        chk3 = findViewById(R.id.checkBox3);
        chk4 = findViewById(R.id.checkBox4);
        chk5 = findViewById(R.id.checkBox5);
        chk6 = findViewById(R.id.checkBox6);
        chk7 = findViewById(R.id.checkBox7);
        btn_result = findViewById(R.id.button);

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chk1.isChecked()) {
                    a = a+1;
                }

                if(chk2.isChecked()) {
                    a = a+1;

                }

                if(chk3.isChecked()) {
                    a = a+1;
                }

                if(chk4.isChecked()) {
                    a = a+1;

                }

                if(chk5.isChecked()) {
                    a = a+1;
                }

                if(chk6.isChecked()) {
                    a = a+1;
                }

                if(chk7.isChecked()) {
                    a = a+1;
                }

                if( a > 0) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mohw.go.kr/react/popup_200128_3.html"));
                    startActivity(intent);
                }

                else if( a == 0){
                    Intent intent = new Intent(JAGAJINDAN.this, MainActivity.class);
                    startActivity(intent);
                }
            }



        });








    }
}