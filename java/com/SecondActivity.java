package com;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.helloappsti22a4.R;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY =
            "com.example.android.HelloAppsTI22A4.extra.REPLY";

    private EditText mReply;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_dua);

        mReply = findViewById(R.id.editText_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivityOne.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }

    public void returnReply(View view){

        String reply  = mReply.getText().toString();

        Intent replyIntent = new Intent();
        replyIntent.putExtra (EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

}
