package com.example.p7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_page extends AppCompatActivity {

    private Button btn_개인;
    private Button scanQRBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        scanQRBtn = (Button) findViewById(R.id.btn_가게);
        scanQRBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(First_page.this, ScanQR.class);
                startActivity(intent);
            }
        });

        btn_개인 = findViewById(R.id.btn_개인);
        btn_개인.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First_page.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}