package com.mahmoud.zaher.mvvmwithlifedata.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mahmoud.zaher.mvvmwithlifedata.pojo.MovieModel;

public class MovieViewModel extends ViewModel {

    MutableLiveData<String> stringMutableLiveDataForMovieName = new MutableLiveData<>();

    public void getMovieName() {
        stringMutableLiveDataForMovieName.postValue(getMovieDataFromDB().getMovieName());
    }

    private MovieModel getMovieDataFromDB() {
        return new MovieModel(1, "Avengers", "Very Good Movie");
    }
}
