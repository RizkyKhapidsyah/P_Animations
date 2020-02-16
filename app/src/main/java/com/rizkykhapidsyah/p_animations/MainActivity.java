package com.rizkykhapidsyah.p_animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnZoomIn, btnZoomOut, btnBlink,
            btnFadeIn, btnFadeOut, btnCrossFade,
            btnRotate, btnMove, btnBounce,
            btnSlideUp, btnSlideDown, btnSequential;

    private Animation animZoomIn, animZoomOut, animBlink,
            animFadeIn, animFadeOut, animCrossFadeIn,
            animCrossFadeOut, animRotate, animMove,
            animBounce, animSlideUp, animSlideDown, animSequential;

    private TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnZoomIn = findViewById(R.id.btn_zoom_in);
        btnZoomOut = findViewById(R.id.btn_zoom_out);
        btnBlink = findViewById(R.id.btn_blink);
        btnFadeIn = findViewById(R.id.btn_fade_in);
        btnFadeOut = findViewById(R.id.btn_fade_out);
        btnCrossFade = findViewById(R.id.btn_cross_fade);
        btnRotate = findViewById(R.id.btn_rotate);
        btnMove = findViewById(R.id.btn_move);
        btnBounce = findViewById(R.id.btn_bounce);
        btnSlideUp = findViewById(R.id.btn_slide_up);
        btnSlideDown = findViewById(R.id.btn_slide_down);
        btnSequential = findViewById(R.id.btn_sequential);

        mainText = findViewById(R.id.mainText);

        btnZoomIn.setOnClickListener(this);
        btnZoomOut.setOnClickListener(this);
        btnBlink.setOnClickListener(this);
        btnFadeIn.setOnClickListener(this);
        btnFadeOut.setOnClickListener(this);
        btnCrossFade.setOnClickListener(this);
        btnRotate.setOnClickListener(this);
        btnMove.setOnClickListener(this);
        btnBounce.setOnClickListener(this);
        btnSlideUp.setOnClickListener(this);
        btnSlideDown.setOnClickListener(this);
        btnSequential.setOnClickListener(this);

        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        animCrossFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        animCrossFadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
        animBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blinking);
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
        animMove = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncing);
        animSlideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        animSlideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        animSequential = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_zoom_in:
                mainText.setVisibility(View.VISIBLE);
                mainText.startAnimation(animZoomIn);
                break;
            case R.id.btn_zoom_out:
                mainText.setVisibility(View.VISIBLE);
                mainText.startAnimation(animZoomOut);
                break;
            case R.id.btn_blink:
                mainText.setVisibility(View.VISIBLE);
                mainText.startAnimation(animBlink);
                break;
            case R.id.btn_fade_in:
                mainText.setVisibility(View.VISIBLE);
                mainText.startAnimation(animFadeIn);
                break;
            case R.id.btn_fade_out:
                mainText.setVisibility(View.VISIBLE);
                mainText.startAnimation(animFadeOut);
                break;
            case R.id.btn_cross_fade:
                mainText.setVisibility(View.VISIBLE);
                // start fade in animation
                mainText.startAnimation(animCrossFadeIn);
                // start fade out animation
                mainText.startAnimation(animCrossFadeOut);
                break;
            case R.id.btn_rotate:
                mainText.startAnimation(animRotate);
                break;
            case R.id.btn_move:
                mainText.startAnimation(animMove);
                break;
            case R.id.btn_bounce:
                mainText.startAnimation(animBounce);
                break;
            case R.id.btn_slide_up:
                mainText.startAnimation(animSlideUp);
                break;
            case R.id.btn_slide_down:
                mainText.startAnimation(animSlideDown);
                break;
            case R.id.btn_sequential:
                mainText.startAnimation(animSequential);
                break;
        }
    }
}
