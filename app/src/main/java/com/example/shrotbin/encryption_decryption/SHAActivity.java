package com.example.shrotbin.encryption_decryption;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.shrotbin.encryption_decryption.util.SHAUtil;

public class SHAActivity extends AppCompatActivity {

    private Button mEncryption;
    private TextView mContent;
    private String mString="encryption and decryption";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sha);

        mEncryption= (Button) findViewById(R.id.encryption);
        mContent= (TextView) findViewById(R.id.content);
        mContent.setText(mString);
        mEncryption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContent.setText(SHAUtil.base64AndSHA(mString));
            }
        });


    }
}
