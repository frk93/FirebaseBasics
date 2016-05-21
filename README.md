# FirebaseBasics
Simple Integration of firebase into android.


Add these lines into Project:Gradle


    dependencies {
    
        classpath 'com.android.tools.build:gradle:2.1.0'
        classpath 'com.google.gms:google-services:3.0.0'
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }

Add these into App:Gradle

  dependencies {
   
    compile 'com.google.firebase:firebase-core:9.0.0'
    compile 'com.google.firebase:firebase-database:9.0.0'
 
  }

// ADD THIS AT THE BOTTOM OF YOUR APP GRADLE 

    apply plugin: 'com.google.gms.google-services'

You may refer to this link for other information https://firebase.google.com/docs/
