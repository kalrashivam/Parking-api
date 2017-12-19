package com.example.shivamkalra.shivam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SurfaceView camera;
    EditText result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    camera = (SurfaceView) findViewById(R.id.SurfaceView);
    result = (EditText) findViewById(R.id.Edit);

        Intent camera
    }
}
