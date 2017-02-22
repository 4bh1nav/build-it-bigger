package com.example;

import java.util.Random;

public class Joke {

    private String[] jokes;
    private Random random;

    public Joke() {
        jokes = new String[3];
        jokes[0] = "A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"";
        jokes[1] = "Q: How many prolog programmers does it take to change a lightbulb? A: Yes.";
        jokes[2] = "Why do Java developers wear glasses? Because they can't C#";
        random = new Random();
    }

    public String tellMeAJoke(){
        return jokes[random.nextInt(jokes.length)];
    }
}
