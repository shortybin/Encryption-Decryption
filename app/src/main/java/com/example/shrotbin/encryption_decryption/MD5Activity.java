package com.example.shrotbin.encryption_decryption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.shrotbin.encryption_decryption.util.MD5Util;

public class MD5Activity extends AppCompatActivity {

    private Button mEncryption;
    private TextView mContent;
    private String mString="encryption and decryption";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_md5);

        mEncryption= (Button) findViewById(R.id.encryption);
        mContent= (TextView) findViewById(R.id.content);
        mContent.setText(mString);
        mEncryption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContent.setText(MD5Util.base64AndMD5(mString));
            }
        });



    }
}
