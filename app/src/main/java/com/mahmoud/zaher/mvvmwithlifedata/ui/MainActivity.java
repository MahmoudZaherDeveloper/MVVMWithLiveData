package com.mahmoud.zaher.mvvmwithlifedata.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.mahmoud.zaher.mvvmwithlifedata.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MovieViewModel viewModel;
    Button getMovieBtn;
    TextView movieNameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getMovieBtn = findViewById(R.id.button);
        movieNameTv = findViewById(R.id.textView);
        getMovieBtn.setOnClickListener(this);
        viewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        viewModel.stringMutableLiveDataForMovieName.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                movieNameTv.setText(s);
            }
        });

    }

    @Override
    public void onClick(View view) {
        viewModel.getMovieName();
    }
}
