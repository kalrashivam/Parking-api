package com.example.shivamkalra.shivam;

import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.Camera;
import android.media.VolumeShaper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    SurfaceView camera;
    EditText result;
    Camera cam;
    FrameLayout frame;
    ShowCamera showCamera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    camera = (SurfaceView) findViewById(R.id.SurfaceView);
    result = (EditText) findViewById(R.id.Edit);
    frame =(FrameLayout) findViewById(R.id.frame);
        showCamera = new ShowCamera(getApplicationContext(),camera);
     frame.addView();

        cam = switch_on_camera();
    }


    //For returning camera object to the cam View
    public Camera switch_on_camera(){
        Camera cam_obj = null;

        //For opening Camera
        cam_obj = Camera.open();
        Camera.Parameters parameters =cam_obj.getParameters();

        if(this.getResources().getConfiguration().orientation!= Configuration.ORIENTATION_LANDSCAPE){
            parameters.set("orientation","portrait");
            cam_obj.setDisplayOrientation(90);
            parameters.setRotation(90);
        }else{
            parameters.set("orientation","landscape");
            cam_obj.setDisplayOrientation(0);
            parameters.setRotation(0);
        }
     return cam_obj;
    }
}
