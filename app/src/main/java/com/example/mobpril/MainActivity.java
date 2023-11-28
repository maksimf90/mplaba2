package com.example.mobpril;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void thirdActivity(View v) {
        Intent intent = new Intent(this, third.class);
        startActivity(intent);
    }

    public void secondActivity(View v) {
        Intent intent = new Intent(this, Second.class);
        startActivity(intent);
    }
    public void fourthActivity(View v) {
        Intent intent = new Intent(this, fourth.class);
        startActivity(intent);
    }

    public void Finish(View v){
        this.finish();
    }
}

