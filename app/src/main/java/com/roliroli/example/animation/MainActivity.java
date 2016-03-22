package com.roliroli.example.animation;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.target_text);
        mButton = (Button) findViewById(R.id.action_button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnimation();
            }
        });
    }

    private void startAnimation() {
        // ALPHA
        // ObjectAnimator anim = ObjectAnimator.ofFloat(mTextView, View.ALPHA, 0f, 1f);

        // ROTATION
        //ObjectAnimator anim = ObjectAnimator.ofFloat(mTextView, View.ROTATION, 0f, 360f);

        // ROTATION_X
        // ObjectAnimator anim = ObjectAnimator.ofFloat(mTextView, View.ROTATION_X, 0f, 360f);

        // ROTATION_Y
        // ObjectAnimator anim = ObjectAnimator.ofFloat(mTextView, View.ROTATION_Y, 0f, 360f);

        // SCALE_X
        // ObjectAnimator anim = ObjectAnimator.ofFloat(mTextView, View.SCALE_X, 0f, 2f);

        // SCALE_Y
        // ObjectAnimator anim = ObjectAnimator.ofFloat(mTextView, View.SCALE_Y, 0f, 2f);

        // TRANSLATION_X (Start Moving from current position)
        // ObjectAnimator anim = ObjectAnimator.ofFloat(mTextView, View.TRANSLATION_X, 0f, 100f);

        // TRANSLATION_Y (Start Moving from current position)
        // ObjectAnimator anim = ObjectAnimator.ofFloat(mTextView, View.TRANSLATION_Y, 0f, 100f);

        // VIEW.X
        // ObjectAnimator anim = ObjectAnimator.ofFloat(mTextView, View.X, 0f, 100f);

        // VIEW.Y
        // ObjectAnimator anim = ObjectAnimator.ofFloat(mTextView, View.Y, 0f, 100f);

        // Combine two animation with AnimatorSet
        // ObjectAnimator animX = ObjectAnimator.ofFloat(mTextView, View.X, 50f);
        // ObjectAnimator animY = ObjectAnimator.ofFloat(mTextView, View.Y, 100f);
        // AnimatorSet anim = new AnimatorSet();
        // anim.playTogether(animX, animY);

        // Combine two animation with ObjectAnimator.ofPropertyValuesHolder
        //PropertyValuesHolder pvhX = PropertyValuesHolder.ofFloat("x", 50f);
        //PropertyValuesHolder pvhY = PropertyValuesHolder.ofFloat("y", 100f);
        //ObjectAnimator anim = ObjectAnimator.ofPropertyValuesHolder(mTextView, pvhX, pvhY);

        //anim.setDuration(1000);
        //anim.start();

        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.example);
        set.setTarget(mTextView);
        set.start();
    }
}
