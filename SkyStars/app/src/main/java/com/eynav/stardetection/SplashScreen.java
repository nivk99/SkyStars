package com.eynav.stardetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class SplashScreen extends AppCompatActivity {
    VideoView videoView;
    ImageView logo_view;
    TextView nameLogo;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE);

        videoView = findViewById(R.id.videoView);
        nameLogo = findViewById(R.id.nameLogo);
        Animation logo_animation = AnimationUtils.loadAnimation(this,R.anim.zoom_animation);



        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.twinkling_star_background);
        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });


        int SPLASH_SCREEN = 100;
//        new Handler().postDelayed(new Runnable() {
//
//            @Override
//            public void run() {
//                logo_view.setVisibility(View.VISIBLE);
//                logo_view.startAnimation(logo_animation);
//            }
//        }, SPLASH_SCREEN);

        nameLogo.setVisibility(View.VISIBLE);
        nameLogo.setText("");
        String text = "SkyStars";
        new CountDownTimer((text.length())*300,300){

            @Override
            public void onTick(long l) {
                nameLogo.setText(nameLogo.getText().toString()+text.charAt(count));
                count++;
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();

//        SPLASH_SCREEN = 3000;
//        new Handler().postDelayed(new Runnable() {
//
//            @Override
//            public void run() {
//                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        }, SPLASH_SCREEN);
    }
}





































