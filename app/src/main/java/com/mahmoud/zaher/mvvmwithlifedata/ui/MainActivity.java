package com.mahmoud.zaher.mvvmwithlifedata.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.mahmoud.zaher.mvvmwithlifedata.R;
import com.mahmoud.zaher.mvvmwithlifedata.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MovieViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(MovieViewModel.class);

        binding.setMovieViewModel(viewModel);
        binding.setLifecycleOwner(this);

    }


}
