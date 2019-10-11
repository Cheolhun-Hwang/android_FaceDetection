package com.hooney.facedetectionproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private final int SIG_PERMISSION = 901;
    private String[] permissions = {
            Manifest.permission.CAMERA
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.camera_api_2:
                if(checkPermission()){
                    intentCameraApi2();
                }else{
                    commitPermission(SIG_PERMISSION);
                }
                break;
            case R.id.selector_layout:
                intentSelectionLayout();
                break;
            default:
                return;
        }
    }

    private void intentCameraApi2() {
        startActivity(new Intent(getApplicationContext(), CameraActivity.class));
    }
    private void intentSelectionLayout() {
        startActivity(new Intent(getApplicationContext(), SelectorActivity.class));
    }
    public boolean checkPermission(){
        boolean isAll = true;
        int permissionCheck = PackageManager.PERMISSION_GRANTED;

        for (int i = 0; i < permissions.length; i++) {
            permissionCheck = ContextCompat.checkSelfPermission(MainActivity.this, permissions[i]);
            if (permissionCheck == PackageManager.PERMISSION_DENIED) {
                isAll = false;
                break;
            }
        }
        return isAll;
    }

    public void commitPermission(int SIG_PERMISSION){
        ActivityCompat.requestPermissions(MainActivity.this, permissions, SIG_PERMISSION);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == SIG_PERMISSION){
            boolean isALL = true;
            for(int grant : grantResults){
                if(grant == PackageManager.PERMISSION_DENIED){
                    isALL = false;
                    break;
                }
            }

            if(!isALL){
                Toast.makeText(getApplicationContext(), "모든 권한이 필요합니다.",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}
