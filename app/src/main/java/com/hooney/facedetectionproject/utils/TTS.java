package com.hooney.facedetectionproject.utils;

import android.app.Activity;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.widget.Toast;

import java.util.Locale;

public class TTS implements TextToSpeech.OnInitListener {
    private Activity activity;
    private TextToSpeech textToSpeech;
    private float pitch;
    private float speechRate;
    private boolean isTTS;

    public TTS(final Activity activity){
        this.activity = activity;
        this.textToSpeech = new TextToSpeech(activity, this);
        this.pitch = 0.7f;
        this.speechRate=1.1f;
        this.isTTS = true;
    }

    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }

    public float getSpeechRate() {
        return speechRate;
    }

    public void setSpeechRate(float speechRate) {
        this.speechRate = speechRate;
    }

    public boolean isTTS() {
        return isTTS;
    }

    public void setTTS(boolean TTS) {
        isTTS = TTS;
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            //사용할 언어를 설정
            int result = textToSpeech.setLanguage(Locale.KOREA);
            //언어 데이터가 없거나 혹은 언어가 지원하지 않으면...
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Toast.makeText(activity, "이 언어는 지원하지 않습니다.", Toast.LENGTH_SHORT).show();
                this.isTTS = false;
            } else {
                //음성 톤
                textToSpeech.setPitch(this.pitch);
                //읽는 속도
                textToSpeech.setSpeechRate(this.speechRate);
                this.isTTS = true;
            }
        }
    }

    public void speech(String text) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
            // API 20
        else
            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }

    public void speachStop() {
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }
}
