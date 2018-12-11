package com.nocholla.localization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    // ButterKnife
    @BindView(R.id.btn_android)
    Button androidButton;
    @BindView(R.id.btn_ios)
    Button iosButton;
    @BindView(R.id.btn_windows)
    Button windowsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ButterKnife
        ButterKnife.bind(this);

        // Android
        androidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.toast_android), Toast.LENGTH_SHORT).show();
            }
        });

        // iOS
        iosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.toast_ios), Toast.LENGTH_SHORT).show();
            }
        });

        // Windows
        windowsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.toast_windows), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
