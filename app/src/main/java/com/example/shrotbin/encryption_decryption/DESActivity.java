package com.example.shrotbin.encryption_decryption;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.shrotbin.encryption_decryption.util.DESUtil;

public class DESActivity extends AppCompatActivity {

    private static final String TAG = "DESActivity";

    private Button mEncryption,mDecryption;
    private TextView mTextView;
    private String mString="encryption and decryption";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des);
        mEncryption= (Button) findViewById(R.id.encryption);
        mDecryption= (Button) findViewById(R.id.decryption);
        mTextView= (TextView) findViewById(R.id.content);
        mTextView.setText(mString);
        mEncryption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Log.d(TAG, "onClick: "+DESUtil.initKey());
                    mTextView.setText(DESUtil.encrypt(mString,DESUtil.initKey()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        mDecryption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=mTextView.getText().toString();
                try {
                    Log.d(TAG, "onClick: "+DESUtil.initKey());
                    mTextView.setText(DESUtil.decrypt(str,DESUtil.initKey()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
