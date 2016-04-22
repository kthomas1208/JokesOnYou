package com.udacity.gradle.builditbigger;

public class JokeSmith {

    private String mJoke;

    public JokeSmith () {
        // TODO: 4/22/16 Create store of jokes
        mJoke = "I haven't slept for 10 days, because that would be too long";
    }

    public String getJoke() {
        // TODO: 4/22/16 retrieve random joke
        return mJoke;
    }
}
