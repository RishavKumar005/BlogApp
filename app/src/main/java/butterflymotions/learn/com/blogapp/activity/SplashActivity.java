package butterflymotions.learn.com.blogapp.activity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterflymotions.learn.com.blogapp.R;

public class SplashActivity extends AppCompatActivity {

    boolean isBackPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {


            }

            @Override
            public void onFinish() {
                if (!isBackPressed) {

                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();


                }
            }
        }.start();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        isBackPressed = true;

    }

}
