package com.example.shrotbin.encryption_decryption;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBase64,mMD5,mSHA,mDES,mAES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBase64= (Button) findViewById(R.id.base64);
        mBase64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Base64Activity.class));
            }
        });

        mMD5= (Button) findViewById(R.id.md5);
        mMD5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MD5Activity.class));
            }
        });

        mSHA= (Button) findViewById(R.id.sha);
        mSHA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SHAActivity.class));
            }
        });

        mDES= (Button) findViewById(R.id.des);
        mDES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,DESActivity.class));
            }
        });

        mAES= (Button) findViewById(R.id.aes);
        mAES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AESActivity.class));
            }
        });

    }
}
