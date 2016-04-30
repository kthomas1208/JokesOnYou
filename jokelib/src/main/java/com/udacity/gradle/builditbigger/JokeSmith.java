package com.udacity.gradle.builditbigger;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JokeSmith {

    private List<String> mJoke;

    public JokeSmith () {
        mJoke = Arrays.asList(
                "I haven't slept for 10 days, because that would be too long. -MH",
                "Why did the Integer drown? Because it couldn't Float.",
                "Why did the programmer quit her job? Because she couldn't get Arrays.",
                "I'm against picketing, but I don't know how to show it. -MH",
                "I wasn't originally going to get a brain transplant, but then I changed my mind.",
                "I wondered why the baseball was getting bigger. Then it hit me.",
                "Did you hear about the guy whose whole left side was cut off? He's all right now.",
                "I'd tell you a chemistry joke but I know I wouldn't get a reaction.",
                "I'm reading a book about anti-gravity. It's impossible to put down.",
                "Did you hear about the guy who got hit in the head with a can of soda? He was lucky it was a soft drink.",
                "I used to be a banker but I lost interest",
                "I don't trust these stairs because they're always up to something.");
    }

    public String getJoke() {
        Random rand = new Random();
        int randomInt = rand.nextInt(mJoke.size());
        return mJoke.get(randomInt).toString();
    }
}
