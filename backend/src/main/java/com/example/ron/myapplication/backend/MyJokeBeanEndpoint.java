package com.example.ron.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myJokeBeanApi",
        version = "v1",
        resource = "myJokeBean",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.ron.example.com",
                ownerName = "backend.myapplication.ron.example.com",
                packagePath = ""
        )
)
public class MyJokeBeanEndpoint {

    @ApiMethod(name = "getNewJoke")
    public MyJokeBean getNewJoke (){
        MyJokeBean myJokeBean = new MyJokeBean();
        myJokeBean.setJoke();
        return myJokeBean;
    }
}