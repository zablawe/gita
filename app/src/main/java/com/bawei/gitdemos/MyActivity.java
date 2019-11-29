package com.bawei.gitdemos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my );
         textView = findViewById( R.id.names );
        String key = getIntent().getStringExtra( "key" );
        textView.setText( key );
    }
}
