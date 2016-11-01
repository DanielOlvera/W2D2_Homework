package com.example.daniel.w2d2_homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

/*
    Homework:
        Research Services
        Differences between Service and IntentService
        Research how to save information on configuration change
        Create an app that doesn’t destroy on rotation change
        Answer 2 stack overflow questions with Android tag
        Get 50 points on HackerRank on the Algorithms domain: 35
 */
//----------------------------
/*
     Theoretical:

        What are services?
            Is component that runs in the background to perform long-running operations without needing to
            interact with the user.

        Differences between Service and IntentService
            Service, the service run inside the UI thread, it requires that you create a working thread to execute its
            work.

            IntentService, is a subclass of Service, that simplifies your work. It works already in a working
            thread, and can receive asynchronous request. So, you don't need to create ir manually, or to
            be worried about synchronization. You can simply extend it and override the method:

                                     onHandleIntent(Intent intent)

            where you can manage all the incoming request.

 */
//----------------------------
/*
    References:
        https://www.tutorialspoint.com/android/android_services.htm
        http://stackoverflow.com/questions/31451476/what-is-the-difference-between-service-intentservice-in-android

 */

