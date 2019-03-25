package com.example.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import java.io.FileNotFoundException;

public class snapview extends AppCompatActivity{
    private Bitmap bitmap;
    private ImageView im;
    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snapview);

        if(getIntent() != null) {
            try {
                bitmap = BitmapFactory.decodeStream(openFileInput("myImage"));
                im = (ImageView)findViewById(R.id.snappPassed);
                im.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        dl = (DrawerLayout)findViewById(R.id.activitySnapview);
        abdt = new ActionBarDrawerToggle(this,dl,R.string.open,R.string.close);
        abdt.setDrawerIndicatorEnabled(true);
        dl.addDrawerListener(abdt);
        abdt.syncState();
    }

}
