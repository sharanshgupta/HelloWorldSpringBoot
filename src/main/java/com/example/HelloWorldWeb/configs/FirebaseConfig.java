package com.example.HelloWorldWeb.configs;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.IOException;

public class FirebaseConfig {

  FirebaseOptions options = FirebaseOptions.builder()
    .setCredentials(GoogleCredentials.getApplicationDefault())
    .setDatabaseUrl("https://userdb.firebaseio.com/")
    .build();

  public FirebaseConfig() throws IOException {
    FirebaseApp.initializeApp(options);
  }
}
