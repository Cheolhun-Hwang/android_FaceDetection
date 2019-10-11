package com.hooney.facedetectionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.HorizontalScrollView;

public class SelectorActivity extends AppCompatActivity {
    private final String TAG = SelectorActivity.class.getSimpleName();
    private boolean[][] testGrid;
    private HorizontalScrollView horizontalScrollView;
    private int testFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
        init();
        initView();
    }
    private void init(){
        testFlag = 1;
        testGrid = new boolean[20][20];
    }

    private void initView(){
        horizontalScrollView = findViewById(R.id.horizon_scroll);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            horizontalScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                    Log.i(TAG, "Scroll : " + scrollX + " : " + scrollY);
                }
            });
        }
        findViewById(R.id.next_scroll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(testFlag == 1){
                    testFlag = 2;
                    horizontalScrollView.scrollTo(375, 0);
                }else if(testFlag == 2){
                    testFlag = 3;
                    horizontalScrollView.scrollTo(0, 0);
                }else{
                    testFlag = 1;
                    horizontalScrollView.scrollTo(810, 0);
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void grindOnClick(View view){
        switch (view.getId()){
            case R.id.grid_index_0_0:
                selectIndex(0,0, view);
                break;
            case R.id.grid_index_0_1:
                selectIndex(0,1, view);
                break;
            case R.id.grid_index_0_2:
                selectIndex(0,2, view);
                break;
            case R.id.grid_index_0_3:
                selectIndex(0,3, view);
                break;
            case R.id.grid_index_0_4:
                selectIndex(0,4, view);
                break;
            case R.id.grid_index_0_5:
                selectIndex(0,5, view);
                break;
            case R.id.grid_index_0_6:
                selectIndex(0,6, view);
                break;
            case R.id.grid_index_0_7:
                selectIndex(0,7, view);
                break;
            case R.id.grid_index_0_8:
                selectIndex(0,8, view);
                break;
            case R.id.grid_index_0_9:
                selectIndex(0,9, view);
                break;
            case R.id.grid_index_0_10:
                selectIndex(0,10, view);
                break;
            case R.id.grid_index_0_11:
                selectIndex(0,11, view);
                break;
            case R.id.grid_index_0_12:
                selectIndex(0,12, view);
                break;
            case R.id.grid_index_0_13:
                selectIndex(0,13, view);
                break;
            case R.id.grid_index_0_14:
                selectIndex(0,14, view);
                break;
            case R.id.grid_index_0_15:
                selectIndex(0,15, view);
                break;
            case R.id.grid_index_0_16:
                selectIndex(0,16, view);
                break;
            case R.id.grid_index_0_17:
                selectIndex(0,17, view);
                break;
            case R.id.grid_index_0_18:
                selectIndex(0,18, view);
                break;
            case R.id.grid_index_0_19:
                selectIndex(0,19, view);
                break;
            case R.id.grid_index_1_0:
                selectIndex(1,0, view);
                break;
            case R.id.grid_index_1_1:
                selectIndex(1,1, view);
                break;
            case R.id.grid_index_1_2:
                selectIndex(1,2, view);
                break;
            case R.id.grid_index_1_3:
                selectIndex(1,3, view);
                break;
            case R.id.grid_index_1_4:
                selectIndex(1,4, view);
                break;
            case R.id.grid_index_1_5:
                selectIndex(1,5, view);
                break;
            case R.id.grid_index_1_6:
                selectIndex(1,6, view);
                break;
            case R.id.grid_index_1_7:
                selectIndex(1,7, view);
                break;
            case R.id.grid_index_1_8:
                selectIndex(1,8, view);
                break;
            case R.id.grid_index_1_9:
                selectIndex(1,9, view);
                break;
            case R.id.grid_index_1_10:
                selectIndex(1,10, view);
                break;
            case R.id.grid_index_1_11:
                selectIndex(1,11, view);
                break;
            case R.id.grid_index_1_12:
                selectIndex(1,12, view);
                break;
            case R.id.grid_index_1_13:
                selectIndex(1,13, view);
                break;
            case R.id.grid_index_1_14:
                selectIndex(1,14, view);
                break;
            case R.id.grid_index_1_15:
                selectIndex(1,15, view);
                break;
            case R.id.grid_index_1_16:
                selectIndex(1,16, view);
                break;
            case R.id.grid_index_1_17:
                selectIndex(1,17, view);
                break;
            case R.id.grid_index_1_18:
                selectIndex(1,18, view);
                break;
            case R.id.grid_index_1_19:
                selectIndex(1,19, view);
                break;
            case R.id.grid_index_2_0:
                selectIndex(2,0, view);
                break;
            case R.id.grid_index_2_1:
                selectIndex(2,1, view);
                break;
            case R.id.grid_index_2_2:
                selectIndex(2,2, view);
                break;
            case R.id.grid_index_2_3:
                selectIndex(2,3, view);
                break;
            case R.id.grid_index_2_4:
                selectIndex(2,4, view);
                break;
            case R.id.grid_index_2_5:
                selectIndex(2,5, view);
                break;
            case R.id.grid_index_2_6:
                selectIndex(2,6, view);
                break;
            case R.id.grid_index_2_7:
                selectIndex(2,7, view);
                break;
            case R.id.grid_index_2_8:
                selectIndex(2,8, view);
                break;
            case R.id.grid_index_2_9:
                selectIndex(2,9, view);
                break;
            case R.id.grid_index_2_10:
                selectIndex(2,10, view);
                break;
            case R.id.grid_index_2_11:
                selectIndex(2,11, view);
                break;
            case R.id.grid_index_2_12:
                selectIndex(2,12, view);
                break;
            case R.id.grid_index_2_13:
                selectIndex(2,13, view);
                break;
            case R.id.grid_index_2_14:
                selectIndex(2,14, view);
                break;
            case R.id.grid_index_2_15:
                selectIndex(2,15, view);
                break;
            case R.id.grid_index_2_16:
                selectIndex(2,16, view);
                break;
            case R.id.grid_index_2_17:
                selectIndex(2,17, view);
                break;
            case R.id.grid_index_2_18:
                selectIndex(2,18, view);
                break;
            case R.id.grid_index_2_19:
                selectIndex(2,19, view);
                break;
            case R.id.grid_index_3_0:
                selectIndex(3,0, view);
                break;
            case R.id.grid_index_3_1:
                selectIndex(3,1, view);
                break;
            case R.id.grid_index_3_2:
                selectIndex(3,2, view);
                break;
            case R.id.grid_index_3_3:
                selectIndex(3,3, view);
                break;
            case R.id.grid_index_3_4:
                selectIndex(3,4, view);
                break;
            case R.id.grid_index_3_5:
                selectIndex(3,5, view);
                break;
            case R.id.grid_index_3_6:
                selectIndex(3,6, view);
                break;
            case R.id.grid_index_3_7:
                selectIndex(3,7, view);
                break;
            case R.id.grid_index_3_8:
                selectIndex(3,8, view);
                break;
            case R.id.grid_index_3_9:
                selectIndex(3,9, view);
                break;
            case R.id.grid_index_3_10:
                selectIndex(3,10, view);
                break;
            case R.id.grid_index_3_11:
                selectIndex(3,11, view);
                break;
            case R.id.grid_index_3_12:
                selectIndex(3,12, view);
                break;
            case R.id.grid_index_3_13:
                selectIndex(3,13, view);
                break;
            case R.id.grid_index_3_14:
                selectIndex(3,14, view);
                break;
            case R.id.grid_index_3_15:
                selectIndex(3,15, view);
                break;
            case R.id.grid_index_3_16:
                selectIndex(3,16, view);
                break;
            case R.id.grid_index_3_17:
                selectIndex(3,17, view);
                break;
            case R.id.grid_index_3_18:
                selectIndex(3,18, view);
                break;
            case R.id.grid_index_3_19:
                selectIndex(3,19, view);
                break;
            case R.id.grid_index_4_0:
                selectIndex(4,0, view);
                break;
            case R.id.grid_index_4_1:
                selectIndex(4,1, view);
                break;
            case R.id.grid_index_4_2:
                selectIndex(4,2, view);
                break;
            case R.id.grid_index_4_3:
                selectIndex(4,3, view);
                break;
            case R.id.grid_index_4_4:
                selectIndex(4,4, view);
                break;
            case R.id.grid_index_4_5:
                selectIndex(4,5, view);
                break;
            case R.id.grid_index_4_6:
                selectIndex(4,6, view);
                break;
            case R.id.grid_index_4_7:
                selectIndex(4,7, view);
                break;
            case R.id.grid_index_4_8:
                selectIndex(4,8, view);
                break;
            case R.id.grid_index_4_9:
                selectIndex(4,9, view);
                break;
            case R.id.grid_index_4_10:
                selectIndex(4,10, view);
                break;
            case R.id.grid_index_4_11:
                selectIndex(4,11, view);
                break;
            case R.id.grid_index_4_12:
                selectIndex(4,12, view);
                break;
            case R.id.grid_index_4_13:
                selectIndex(4,13, view);
                break;
            case R.id.grid_index_4_14:
                selectIndex(4,14, view);
                break;
            case R.id.grid_index_4_15:
                selectIndex(4,15, view);
                break;
            case R.id.grid_index_4_16:
                selectIndex(4,16, view);
                break;
            case R.id.grid_index_4_17:
                selectIndex(4,17, view);
                break;
            case R.id.grid_index_4_18:
                selectIndex(4,18, view);
                break;
            case R.id.grid_index_4_19:
                selectIndex(4,19, view);
                break;
            case R.id.grid_index_5_0:
                selectIndex(5,0, view);
                break;
            case R.id.grid_index_5_1:
                selectIndex(5,1, view);
                break;
            case R.id.grid_index_5_2:
                selectIndex(5,2, view);
                break;
            case R.id.grid_index_5_3:
                selectIndex(5,3, view);
                break;
            case R.id.grid_index_5_4:
                selectIndex(5,4, view);
                break;
            case R.id.grid_index_5_5:
                selectIndex(5,5, view);
                break;
            case R.id.grid_index_5_6:
                selectIndex(5,6, view);
                break;
            case R.id.grid_index_5_7:
                selectIndex(5,7, view);
                break;
            case R.id.grid_index_5_8:
                selectIndex(5,8, view);
                break;
            case R.id.grid_index_5_9:
                selectIndex(5,9, view);
                break;
            case R.id.grid_index_5_10:
                selectIndex(5,10, view);
                break;
            case R.id.grid_index_5_11:
                selectIndex(5,11, view);
                break;
            case R.id.grid_index_5_12:
                selectIndex(5,12, view);
                break;
            case R.id.grid_index_5_13:
                selectIndex(5,13, view);
                break;
            case R.id.grid_index_5_14:
                selectIndex(5,14, view);
                break;
            case R.id.grid_index_5_15:
                selectIndex(5,15, view);
                break;
            case R.id.grid_index_5_16:
                selectIndex(5,16, view);
                break;
            case R.id.grid_index_5_17:
                selectIndex(5,17, view);
                break;
            case R.id.grid_index_5_18:
                selectIndex(5,18, view);
                break;
            case R.id.grid_index_5_19:
                selectIndex(5,19, view);
                break;
            case R.id.grid_index_6_0:
                selectIndex(6,0, view);
                break;
            case R.id.grid_index_6_1:
                selectIndex(6,1, view);
                break;
            case R.id.grid_index_6_2:
                selectIndex(6,2, view);
                break;
            case R.id.grid_index_6_3:
                selectIndex(6,3, view);
                break;
            case R.id.grid_index_6_4:
                selectIndex(6,4, view);
                break;
            case R.id.grid_index_6_5:
                selectIndex(6,5, view);
                break;
            case R.id.grid_index_6_6:
                selectIndex(6,6, view);
                break;
            case R.id.grid_index_6_7:
                selectIndex(6,7, view);
                break;
            case R.id.grid_index_6_8:
                selectIndex(6,8, view);
                break;
            case R.id.grid_index_6_9:
                selectIndex(6,9, view);
                break;
            case R.id.grid_index_6_10:
                selectIndex(6,10, view);
                break;
            case R.id.grid_index_6_11:
                selectIndex(6,11, view);
                break;
            case R.id.grid_index_6_12:
                selectIndex(6,12, view);
                break;
            case R.id.grid_index_6_13:
                selectIndex(6,13, view);
                break;
            case R.id.grid_index_6_14:
                selectIndex(6,14, view);
                break;
            case R.id.grid_index_6_15:
                selectIndex(6,15, view);
                break;
            case R.id.grid_index_6_16:
                selectIndex(6,16, view);
                break;
            case R.id.grid_index_6_17:
                selectIndex(6,17, view);
                break;
            case R.id.grid_index_6_18:
                selectIndex(6,18, view);
                break;
            case R.id.grid_index_6_19:
                selectIndex(6,19, view);
                break;
            case R.id.grid_index_7_0:
                selectIndex(7,0, view);
                break;
            case R.id.grid_index_7_1:
                selectIndex(7,1, view);
                break;
            case R.id.grid_index_7_2:
                selectIndex(7,2, view);
                break;
            case R.id.grid_index_7_3:
                selectIndex(7,3, view);
                break;
            case R.id.grid_index_7_4:
                selectIndex(7,4, view);
                break;
            case R.id.grid_index_7_5:
                selectIndex(7,5, view);
                break;
            case R.id.grid_index_7_6:
                selectIndex(7,6, view);
                break;
            case R.id.grid_index_7_7:
                selectIndex(7,7, view);
                break;
            case R.id.grid_index_7_8:
                selectIndex(7,8, view);
                break;
            case R.id.grid_index_7_9:
                selectIndex(7,9, view);
                break;
            case R.id.grid_index_7_10:
                selectIndex(7,10, view);
                break;
            case R.id.grid_index_7_11:
                selectIndex(7,11, view);
                break;
            case R.id.grid_index_7_12:
                selectIndex(7,12, view);
                break;
            case R.id.grid_index_7_13:
                selectIndex(7,13, view);
                break;
            case R.id.grid_index_7_14:
                selectIndex(7,14, view);
                break;
            case R.id.grid_index_7_15:
                selectIndex(7,15, view);
                break;
            case R.id.grid_index_7_16:
                selectIndex(7,16, view);
                break;
            case R.id.grid_index_7_17:
                selectIndex(7,17, view);
                break;
            case R.id.grid_index_7_18:
                selectIndex(7,18, view);
                break;
            case R.id.grid_index_7_19:
                selectIndex(7,19, view);
                break;
            case R.id.grid_index_8_0:
                selectIndex(8,0, view);
                break;
            case R.id.grid_index_8_1:
                selectIndex(8,1, view);
                break;
            case R.id.grid_index_8_2:
                selectIndex(8,2, view);
                break;
            case R.id.grid_index_8_3:
                selectIndex(8,3, view);
                break;
            case R.id.grid_index_8_4:
                selectIndex(8,4, view);
                break;
            case R.id.grid_index_8_5:
                selectIndex(8,5, view);
                break;
            case R.id.grid_index_8_6:
                selectIndex(8,6, view);
                break;
            case R.id.grid_index_8_7:
                selectIndex(8,7, view);
                break;
            case R.id.grid_index_8_8:
                selectIndex(8,8, view);
                break;
            case R.id.grid_index_8_9:
                selectIndex(8,9, view);
                break;
            case R.id.grid_index_8_10:
                selectIndex(8,10, view);
                break;
            case R.id.grid_index_8_11:
                selectIndex(8,11, view);
                break;
            case R.id.grid_index_8_12:
                selectIndex(8,12, view);
                break;
            case R.id.grid_index_8_13:
                selectIndex(8,13, view);
                break;
            case R.id.grid_index_8_14:
                selectIndex(8,14, view);
                break;
            case R.id.grid_index_8_15:
                selectIndex(8,15, view);
                break;
            case R.id.grid_index_8_16:
                selectIndex(8,16, view);
                break;
            case R.id.grid_index_8_17:
                selectIndex(8,17, view);
                break;
            case R.id.grid_index_8_18:
                selectIndex(8,18, view);
                break;
            case R.id.grid_index_8_19:
                selectIndex(8,19, view);
                break;
            case R.id.grid_index_9_0:
                selectIndex(9,0, view);
                break;
            case R.id.grid_index_9_1:
                selectIndex(9,1, view);
                break;
            case R.id.grid_index_9_2:
                selectIndex(9,2, view);
                break;
            case R.id.grid_index_9_3:
                selectIndex(9,3, view);
                break;
            case R.id.grid_index_9_4:
                selectIndex(9,4, view);
                break;
            case R.id.grid_index_9_5:
                selectIndex(9,5, view);
                break;
            case R.id.grid_index_9_6:
                selectIndex(9,6, view);
                break;
            case R.id.grid_index_9_7:
                selectIndex(9,7, view);
                break;
            case R.id.grid_index_9_8:
                selectIndex(9,8, view);
                break;
            case R.id.grid_index_9_9:
                selectIndex(9,9, view);
                break;
            case R.id.grid_index_9_10:
                selectIndex(9,10, view);
                break;
            case R.id.grid_index_9_11:
                selectIndex(9,11, view);
                break;
            case R.id.grid_index_9_12:
                selectIndex(9,12, view);
                break;
            case R.id.grid_index_9_13:
                selectIndex(9,13, view);
                break;
            case R.id.grid_index_9_14:
                selectIndex(9,14, view);
                break;
            case R.id.grid_index_9_15:
                selectIndex(9,15, view);
                break;
            case R.id.grid_index_9_16:
                selectIndex(9,16, view);
                break;
            case R.id.grid_index_9_17:
                selectIndex(9,17, view);
                break;
            case R.id.grid_index_9_18:
                selectIndex(9,18, view);
                break;
            case R.id.grid_index_9_19:
                selectIndex(9,19, view);
                break;
            case R.id.grid_index_10_0:
                selectIndex(10,0, view);
                break;
            case R.id.grid_index_10_1:
                selectIndex(10,1, view);
                break;
            case R.id.grid_index_10_2:
                selectIndex(10,2, view);
                break;
            case R.id.grid_index_10_3:
                selectIndex(10,3, view);
                break;
            case R.id.grid_index_10_4:
                selectIndex(10,4, view);
                break;
            case R.id.grid_index_10_5:
                selectIndex(10,5, view);
                break;
            case R.id.grid_index_10_6:
                selectIndex(10,6, view);
                break;
            case R.id.grid_index_10_7:
                selectIndex(10,7, view);
                break;
            case R.id.grid_index_10_8:
                selectIndex(10,8, view);
                break;
            case R.id.grid_index_10_9:
                selectIndex(10,9, view);
                break;
            case R.id.grid_index_10_10:
                selectIndex(10,10, view);
                break;
            case R.id.grid_index_10_11:
                selectIndex(10,11, view);
                break;
            case R.id.grid_index_10_12:
                selectIndex(10,12, view);
                break;
            case R.id.grid_index_10_13:
                selectIndex(10,13, view);
                break;
            case R.id.grid_index_10_14:
                selectIndex(10,14, view);
                break;
            case R.id.grid_index_10_15:
                selectIndex(10,15, view);
                break;
            case R.id.grid_index_10_16:
                selectIndex(10,16, view);
                break;
            case R.id.grid_index_10_17:
                selectIndex(10,17, view);
                break;
            case R.id.grid_index_10_18:
                selectIndex(10,18, view);
                break;
            case R.id.grid_index_10_19:
                selectIndex(10,19, view);
                break;
            case R.id.grid_index_11_0:
                selectIndex(11,0, view);
                break;
            case R.id.grid_index_11_1:
                selectIndex(11,1, view);
                break;
            case R.id.grid_index_11_2:
                selectIndex(11,2, view);
                break;
            case R.id.grid_index_11_3:
                selectIndex(11,3, view);
                break;
            case R.id.grid_index_11_4:
                selectIndex(11,4, view);
                break;
            case R.id.grid_index_11_5:
                selectIndex(11,5, view);
                break;
            case R.id.grid_index_11_6:
                selectIndex(11,6, view);
                break;
            case R.id.grid_index_11_7:
                selectIndex(11,7, view);
                break;
            case R.id.grid_index_11_8:
                selectIndex(11,8, view);
                break;
            case R.id.grid_index_11_9:
                selectIndex(11,9, view);
                break;
            case R.id.grid_index_11_10:
                selectIndex(11,10, view);
                break;
            case R.id.grid_index_11_11:
                selectIndex(11,11, view);
                break;
            case R.id.grid_index_11_12:
                selectIndex(11,12, view);
                break;
            case R.id.grid_index_11_13:
                selectIndex(11,13, view);
                break;
            case R.id.grid_index_11_14:
                selectIndex(11,14, view);
                break;
            case R.id.grid_index_11_15:
                selectIndex(11,15, view);
                break;
            case R.id.grid_index_11_16:
                selectIndex(11,16, view);
                break;
            case R.id.grid_index_11_17:
                selectIndex(11,17, view);
                break;
            case R.id.grid_index_11_18:
                selectIndex(11,18, view);
                break;
            case R.id.grid_index_11_19:
                selectIndex(11,19, view);
                break;
            case R.id.grid_index_12_0:
                selectIndex(12,0, view);
                break;
            case R.id.grid_index_12_1:
                selectIndex(12,1, view);
                break;
            case R.id.grid_index_12_2:
                selectIndex(12,2, view);
                break;
            case R.id.grid_index_12_3:
                selectIndex(12,3, view);
                break;
            case R.id.grid_index_12_4:
                selectIndex(12,4, view);
                break;
            case R.id.grid_index_12_5:
                selectIndex(12,5, view);
                break;
            case R.id.grid_index_12_6:
                selectIndex(12,6, view);
                break;
            case R.id.grid_index_12_7:
                selectIndex(12,7, view);
                break;
            case R.id.grid_index_12_8:
                selectIndex(12,8, view);
                break;
            case R.id.grid_index_12_9:
                selectIndex(12,9, view);
                break;
            case R.id.grid_index_12_10:
                selectIndex(12,10, view);
                break;
            case R.id.grid_index_12_11:
                selectIndex(12,11, view);
                break;
            case R.id.grid_index_12_12:
                selectIndex(12,12, view);
                break;
            case R.id.grid_index_12_13:
                selectIndex(12,13, view);
                break;
            case R.id.grid_index_12_14:
                selectIndex(12,14, view);
                break;
            case R.id.grid_index_12_15:
                selectIndex(12,15, view);
                break;
            case R.id.grid_index_12_16:
                selectIndex(12,16, view);
                break;
            case R.id.grid_index_12_17:
                selectIndex(12,17, view);
                break;
            case R.id.grid_index_12_18:
                selectIndex(12,18, view);
                break;
            case R.id.grid_index_12_19:
                selectIndex(12,19, view);
                break;
            case R.id.grid_index_13_0:
                selectIndex(13,0, view);
                break;
            case R.id.grid_index_13_1:
                selectIndex(13,1, view);
                break;
            case R.id.grid_index_13_2:
                selectIndex(13,2, view);
                break;
            case R.id.grid_index_13_3:
                selectIndex(13,3, view);
                break;
            case R.id.grid_index_13_4:
                selectIndex(13,4, view);
                break;
            case R.id.grid_index_13_5:
                selectIndex(13,5, view);
                break;
            case R.id.grid_index_13_6:
                selectIndex(13,6, view);
                break;
            case R.id.grid_index_13_7:
                selectIndex(13,7, view);
                break;
            case R.id.grid_index_13_8:
                selectIndex(13,8, view);
                break;
            case R.id.grid_index_13_9:
                selectIndex(13,9, view);
                break;
            case R.id.grid_index_13_10:
                selectIndex(13,10, view);
                break;
            case R.id.grid_index_13_11:
                selectIndex(13,11, view);
                break;
            case R.id.grid_index_13_12:
                selectIndex(13,12, view);
                break;
            case R.id.grid_index_13_13:
                selectIndex(13,13, view);
                break;
            case R.id.grid_index_13_14:
                selectIndex(13,14, view);
                break;
            case R.id.grid_index_13_15:
                selectIndex(13,15, view);
                break;
            case R.id.grid_index_13_16:
                selectIndex(13,16, view);
                break;
            case R.id.grid_index_13_17:
                selectIndex(13,17, view);
                break;
            case R.id.grid_index_13_18:
                selectIndex(13,18, view);
                break;
            case R.id.grid_index_13_19:
                selectIndex(13,19, view);
                break;
            case R.id.grid_index_14_0:
                selectIndex(14,0, view);
                break;
            case R.id.grid_index_14_1:
                selectIndex(14,1, view);
                break;
            case R.id.grid_index_14_2:
                selectIndex(14,2, view);
                break;
            case R.id.grid_index_14_3:
                selectIndex(14,3, view);
                break;
            case R.id.grid_index_14_4:
                selectIndex(14,4, view);
                break;
            case R.id.grid_index_14_5:
                selectIndex(14,5, view);
                break;
            case R.id.grid_index_14_6:
                selectIndex(14,6, view);
                break;
            case R.id.grid_index_14_7:
                selectIndex(14,7, view);
                break;
            case R.id.grid_index_14_8:
                selectIndex(14,8, view);
                break;
            case R.id.grid_index_14_9:
                selectIndex(14,9, view);
                break;
            case R.id.grid_index_14_10:
                selectIndex(14,10, view);
                break;
            case R.id.grid_index_14_11:
                selectIndex(14,11, view);
                break;
            case R.id.grid_index_14_12:
                selectIndex(14, 12, view);
                break;
            case R.id.grid_index_14_13:
                selectIndex(14,13, view);
                break;
            case R.id.grid_index_14_14:
                selectIndex(14,14, view);
                break;
            case R.id.grid_index_14_15:
                selectIndex(14,15, view);
                break;
            case R.id.grid_index_14_16:
                selectIndex(14,16, view);
                break;
            case R.id.grid_index_14_17:
                selectIndex(14,17, view);
                break;
            case R.id.grid_index_14_18:
                selectIndex(14,18, view);
                break;
            case R.id.grid_index_14_19:
                selectIndex(14,19, view);
                break;
            case R.id.grid_index_15_0:
                selectIndex(15,0, view);
                break;
            case R.id.grid_index_15_1:
                selectIndex(15,1, view);
                break;
            case R.id.grid_index_15_2:
                selectIndex(15,2, view);
                break;
            case R.id.grid_index_15_3:
                selectIndex(15,3, view);
                break;
            case R.id.grid_index_15_4:
                selectIndex(15,4, view);
                break;
            case R.id.grid_index_15_5:
                selectIndex(15,5, view);
                break;
            case R.id.grid_index_15_6:
                selectIndex(15,6, view);
                break;
            case R.id.grid_index_15_7:
                selectIndex(15,7, view);
                break;
            case R.id.grid_index_15_8:
                selectIndex(15,8, view);
                break;
            case R.id.grid_index_15_9:
                selectIndex(15,9, view);
                break;
            case R.id.grid_index_15_10:
                selectIndex(15,10, view);
                break;
            case R.id.grid_index_15_11:
                selectIndex(15,11, view);
                break;
            case R.id.grid_index_15_12:
                selectIndex(15,12, view);
                break;
            case R.id.grid_index_15_13:
                selectIndex(15,13, view);
                break;
            case R.id.grid_index_15_14:
                selectIndex(15,14, view);
                break;
            case R.id.grid_index_15_15:
                selectIndex(15,15, view);
                break;
            case R.id.grid_index_15_16:
                selectIndex(15,16, view);
                break;
            case R.id.grid_index_15_17:
                selectIndex(15,17, view);
                break;
            case R.id.grid_index_15_18:
                selectIndex(15,18, view);
                break;
            case R.id.grid_index_15_19:
                selectIndex(15,19, view);
                break;
            case R.id.grid_index_16_0:
                selectIndex(16,0, view);
                break;
            case R.id.grid_index_16_1:
                selectIndex(16,1, view);
                break;
            case R.id.grid_index_16_2:
                selectIndex(16,2, view);
                break;
            case R.id.grid_index_16_3:
                selectIndex(16,3, view);
                break;
            case R.id.grid_index_16_4:
                selectIndex(16,4, view);
                break;
            case R.id.grid_index_16_5:
                selectIndex(16,5, view);
                break;
            case R.id.grid_index_16_6:
                selectIndex(16,6, view);
                break;
            case R.id.grid_index_16_7:
                selectIndex(16,7, view);
                break;
            case R.id.grid_index_16_8:
                selectIndex(16,8, view);
                break;
            case R.id.grid_index_16_9:
                selectIndex(16,9, view);
                break;
            case R.id.grid_index_16_10:
                selectIndex(16,10, view);
                break;
            case R.id.grid_index_16_11:
                selectIndex(16,11, view);
                break;
            case R.id.grid_index_16_12:
                selectIndex(16,12, view);
                break;
            case R.id.grid_index_16_13:
                selectIndex(16,13, view);
                break;
            case R.id.grid_index_16_14:
                selectIndex(16,14, view);
                break;
            case R.id.grid_index_16_15:
                selectIndex(16,15, view);
                break;
            case R.id.grid_index_16_16:
                selectIndex(16,16, view);
                break;
            case R.id.grid_index_16_17:
                selectIndex(16,17, view);
                break;
            case R.id.grid_index_16_18:
                selectIndex(16,18, view);
                break;
            case R.id.grid_index_16_19:
                selectIndex(16,19, view);
                break;
            case R.id.grid_index_17_0:
                selectIndex(17,0, view);
                break;
            case R.id.grid_index_17_1:
                selectIndex(17,1, view);
                break;
            case R.id.grid_index_17_2:
                selectIndex(17,2, view);
                break;
            case R.id.grid_index_17_3:
                selectIndex(17,3, view);
                break;
            case R.id.grid_index_17_4:
                selectIndex(17,4, view);
                break;
            case R.id.grid_index_17_5:
                selectIndex(17,5, view);
                break;
            case R.id.grid_index_17_6:
                selectIndex(17,6, view);
                break;
            case R.id.grid_index_17_7:
                selectIndex(17,7, view);
                break;
            case R.id.grid_index_17_8:
                selectIndex(17,8, view);
                break;
            case R.id.grid_index_17_9:
                selectIndex(17,9, view);
                break;
            case R.id.grid_index_17_10:
                selectIndex(17,10, view);
                break;
            case R.id.grid_index_17_11:
                selectIndex(17,11, view);
                break;
            case R.id.grid_index_17_12:
                selectIndex(17,12, view);
                break;
            case R.id.grid_index_17_13:
                selectIndex(17,13, view);
                break;
            case R.id.grid_index_17_14:
                selectIndex(17,14, view);
                break;
            case R.id.grid_index_17_15:
                selectIndex(17,15, view);
                break;
            case R.id.grid_index_17_16:
                selectIndex(17,16, view);
                break;
            case R.id.grid_index_17_17:
                selectIndex(17,17, view);
                break;
            case R.id.grid_index_17_18:
                selectIndex(17,18, view);
                break;
            case R.id.grid_index_17_19:
                selectIndex(17,19, view);
                break;
            case R.id.grid_index_18_0:
                selectIndex(18,0, view);
                break;
            case R.id.grid_index_18_1:
                selectIndex(18,1, view);
                break;
            case R.id.grid_index_18_2:
                selectIndex(18,2, view);
                break;
            case R.id.grid_index_18_3:
                selectIndex(18,3, view);
                break;
            case R.id.grid_index_18_4:
                selectIndex(18,4, view);
                break;
            case R.id.grid_index_18_5:
                selectIndex(18,5, view);
                break;
            case R.id.grid_index_18_6:
                selectIndex(18,6, view);
                break;
            case R.id.grid_index_18_7:
                selectIndex(18,7, view);
                break;
            case R.id.grid_index_18_8:
                selectIndex(18,8, view);
                break;
            case R.id.grid_index_18_9:
                selectIndex(18,9, view);
                break;
            case R.id.grid_index_18_10:
                selectIndex(18,10, view);
                break;
            case R.id.grid_index_18_11:
                selectIndex(18,11, view);
                break;
            case R.id.grid_index_18_12:
                selectIndex(18,12, view);
                break;
            case R.id.grid_index_18_13:
                selectIndex(18,13, view);
                break;
            case R.id.grid_index_18_14:
                selectIndex(18,14, view);
                break;
            case R.id.grid_index_18_15:
                selectIndex(18,15, view);
                break;
            case R.id.grid_index_18_16:
                selectIndex(18,16, view);
                break;
            case R.id.grid_index_18_17:
                selectIndex(18,17, view);
                break;
            case R.id.grid_index_18_18:
                selectIndex(18,18, view);
                break;
            case R.id.grid_index_18_19:
                selectIndex(18,19, view);
                break;
            case R.id.grid_index_19_0:
                selectIndex(19,0, view);
                break;
            case R.id.grid_index_19_1:
                selectIndex(19,1, view);
                break;
            case R.id.grid_index_19_2:
                selectIndex(19,2, view);
                break;
            case R.id.grid_index_19_3:
                selectIndex(19,3, view);
                break;
            case R.id.grid_index_19_4:
                selectIndex(19,4, view);
                break;
            case R.id.grid_index_19_5:
                selectIndex(19,5, view);
                break;
            case R.id.grid_index_19_6:
                selectIndex(19,6, view);
                break;
            case R.id.grid_index_19_7:
                selectIndex(19,7, view);
                break;
            case R.id.grid_index_19_8:
                selectIndex(19,8, view);
                break;
            case R.id.grid_index_19_9:
                selectIndex(19,9, view);
                break;
            case R.id.grid_index_19_10:
                selectIndex(19,10, view);
                break;
            case R.id.grid_index_19_11:
                selectIndex(19,11, view);
                break;
            case R.id.grid_index_19_12:
                selectIndex(19,12, view);
                break;
            case R.id.grid_index_19_13:
                selectIndex(19,13, view);
                break;
            case R.id.grid_index_19_14:
                selectIndex(19,14, view);
                break;
            case R.id.grid_index_19_15:
                selectIndex(19,15, view);
                break;
            case R.id.grid_index_19_16:
                selectIndex(19,16, view);
                break;
            case R.id.grid_index_19_17:
                selectIndex(19,17, view);
                break;
            case R.id.grid_index_19_18:
                selectIndex(19,18, view);
                break;
            case R.id.grid_index_19_19:
                selectIndex(19,19, view);
                break;
        }
    }

    private void selectIndex(int x, int y, View view){
        if (testGrid[x][y]){
            testGrid[x][y] = false;
            view.setBackground(getDrawable(R.drawable.test_grid_false_layout));
        }else{
            testGrid[x][y] = true;
            view.setBackground(getDrawable(R.drawable.test_grid_true_layout));
        }
    }
}
