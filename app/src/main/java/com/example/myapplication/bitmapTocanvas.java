package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class bitmapTocanvas extends View{
    private Bitmap bitmap;
    private Paint paint;

    public bitmapTocanvas(Context context) {
        super(context);
        bitmap = BitmapFactory.decodeResource(getResources(),R.id.snappPassed);
    }
}