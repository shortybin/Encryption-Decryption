package com.example.shrotbin.encryption_decryption;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.shrotbin.encryption_decryption.util.RSAUtil;

import java.security.KeyPair;

public class SRAActivity extends AppCompatActivity {

    private Button mEncryption,mDecryption;
    private TextView mTextView;
    private String mString="encryption and decryption";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base64);
        mEncryption= (Button) findViewById(R.id.encryption);
        mDecryption= (Button) findViewById(R.id.decryption);
        mTextView= (TextView) findViewById(R.id.content);
        mTextView.setText(mString);
        final KeyPair keyPair=RSAUtil.generateRSAKeyPair();
        mEncryption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText(new String(RSAUtil.encryptData(mString.getBytes(),keyPair.getPublic())));
            }
        });

        mDecryption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=mTextView.getText().toString();
                mTextView.setText(new String(RSAUtil.decryptData(str.getBytes(),keyPair.getPrivate())));
            }
        });
    }
}
