package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("k82UuoxuYCKI2D0EhESDnQZYGYMuP8ceAN89aQyR")
                .clientKey("nmtGJyhvckLLm9qTN4JgCay0PIV0Gd8bpzK2C6Ik")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
