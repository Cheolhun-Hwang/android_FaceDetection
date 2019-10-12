package com.hooney.facedetectionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.hooney.facedetectionproject.utils.TTS;

public class TextSpeechActivity extends AppCompatActivity {
    private EditText stringText;
    private TTS tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_speach);
        init();
        initView();
    }

    private void init(){
        tts = new TTS(TextSpeechActivity.this);
    }

    private void initView(){
        stringText = findViewById(R.id.typeString);
        findViewById(R.id.speach_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = stringText.getText().toString().trim();
                if(text.length()>0){
                    if(tts.isTTS()){
                        tts.speech(text);
                    }
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        tts.speachStop();
    }
}
