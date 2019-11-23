package com.mahmoud.zaher.mvvmwithlifedata.pojo;

public class MovieModel {
    int id;
    String movieName;
    String movieDesc;

    public MovieModel(int id, String movieName, String movieDesc) {
        this.id = id;
        this.movieName = movieName;
        this.movieDesc = movieDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }
}
