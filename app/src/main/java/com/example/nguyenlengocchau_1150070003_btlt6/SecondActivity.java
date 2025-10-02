package com.example.nguyenlengocchau_1150070003_btlt6;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private ImageView ivUitLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Ánh xạ các view
        ivUitLogo = findViewById(R.id.iv_uit_logo);

        // Áp dụng animation khi chuyển sang SecondActivity
        Animation slideInRight = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        ivUitLogo.startAnimation(slideInRight);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        // Áp dụng animation slide ra phải khi quay lại MainActivity
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
