package com.example.ron.myapplication.backend;

import com.example.Joke;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyJokeBean {

    private Joke joke;
    private String randomJoke;

    public MyJokeBean() {
        joke = new Joke();
    }

    public void setJoke(){
        randomJoke = joke.tellMeAJoke();
    }

    public String getJoke(){
        return randomJoke;
    }
}