/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.kevinthomas.jokes.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.gradle.builditbigger.JokeSmith;

/** An endpoint class we are exposing */
@Api(
  name = "myApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.jokes.kevinthomas.com",
    ownerName = "backend.jokes.kevinthomas.com",
    packagePath=""
  )
)
public class MyEndpoint {

    /**
     * When executed, retrieves a joke from a Java class and returns it to calling client
     * @return JokeBean object that contains the joke
     */
    @ApiMethod(name = "sayJoke")
    public JokeBean sayJoke() {
        JokeBean response = new JokeBean();
        JokeSmith joke = new JokeSmith();

        //Get joke from Java library and send it to app
        response.setData(joke.getJoke());

        return response;
    }

}
