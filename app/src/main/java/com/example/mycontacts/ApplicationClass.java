package com.example.mycontacts;

import android.app.Application;
import com.backendless.Backendless;
import com.backendless.BackendlessUser;

import java.util.List;

public class ApplicationClass extends Application {

    public static final String APPLICATION_ID = "89341975-9E6B-4FC3-A143-182E516EC528";
    public static final String API_KEY = "EE66252D-450D-4F0A-A01C-A96862F102F0";
    public static final String SERVER_URL = "https://api.backendless.com";

    public static BackendlessUser user;
    public static List<Contact> contacts;

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(), APPLICATION_ID, API_KEY);
    }
}
