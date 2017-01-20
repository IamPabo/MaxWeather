package com.max.weather.mvvm.weather;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.max.weather.R;
import com.max.weather.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        new MainViewModel(this,mBinding);
    }
}
