package com.hooney.facedetectionproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Penguin extends View {
    private int W,H;
    private Paint black,gray,white,pink,beard;
    private Bitmap bitmap = null;
    private Canvas incanvas;

    private void init() {
        black = new Paint();
        gray = new Paint();
        white = new Paint();
        pink = new Paint();
        beard = new Paint();
        incanvas = new Canvas();
        black.setColor(Color.BLACK);
        gray.setColor(Color.GRAY);
        white.setColor(Color.WHITE);
        pink.setColor(Color.rgb(0xff, 0xee, 0xee));
        beard.setColor(Color.WHITE);
        black.setAntiAlias(true);
        gray.setAntiAlias(true);
        white.setAntiAlias(true);
        pink.setAntiAlias(true);
        beard.setAntiAlias(true);
        beard.setStrokeWidth(10);
        beard.setStyle(Paint.Style.STROKE);
    }


    public Penguin(Context context) {
        super(context);
        init();
    }

    public Penguin(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Penguin(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void drawBase() {
        incanvas.drawCircle(W / 2, H - (W / 3), W / 5 * 2, white);
        incanvas.drawCircle(W / 2, H / 5 * 2, W / 15, pink);
        incanvas.drawLine(W / 10, H / 5 * 2, W / 5 * 2, H / 5 * 2, beard);
        incanvas.drawLine(W / 10 * 9, H / 5 * 2, W / 5 * 3, H / 5 * 2, beard);
        incanvas.drawLine(W / 10 + 5, H / 5 * 2 - 50, W / 5 * 2, H / 5 * 2 - 20, beard);
        incanvas.drawLine(W / 10 * 9 - 5, H / 5 * 2 - 50, W / 5 * 3, H / 5 * 2 - 20, beard);
        incanvas.drawLine(W / 10 + 5, H / 5 * 2 + 50, W / 5 * 2, H / 5 * 2 + 20, beard);
        incanvas.drawLine(W / 10 * 9 - 5, H / 5 * 2 + 50, W / 5 * 3, H / 5 * 2 + 20, beard);
    }

    public void drawEye(float y, float x) {
        int eyew,eyeh;

        x =  (x/1000)*(W/10);
        y = (y/1000)*(W/10);
        incanvas.drawColor(Color.GRAY);
        drawBase();
        eyew = (W / 4) - (int) x;
        eyeh = (W / 4) - (int) y;
        incanvas.drawCircle(eyew, eyeh, W / 15, black);
        incanvas.drawCircle((W / 4) * 3 - x, eyeh, W / 15, black);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        incanvas.setBitmap(bitmap);
        incanvas.drawColor(Color.GRAY);
        W = w;
        H = h;
        drawEye(0,0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0, 0, null);
        }
    }
}
