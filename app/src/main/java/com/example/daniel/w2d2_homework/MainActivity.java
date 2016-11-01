package com.example.daniel.w2d2_homework;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

    public ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = (ImageView) findViewById(R.id.small_blue_icon);

        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TransitionActivity.class);

                View view = imgView;
                String transitionName = getString(R.string.square_blue_name);

                ActivityOptions activityTransitionOp = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        view, transitionName);
                startActivity(intent, activityTransitionOp.toBundle());
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    //To use the transitions from res/transitions you need to inflate them using TransitionInflater
    public void setupWindowAnimations(){
        Slide slide = (Slide) TransitionInflater.from(this).inflateTransition(R.transition.activity_slide);
        getWindow().setExitTransition(slide);
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

        Difference between Unbound Service and Bound Service

            Bounded Service

                A service is bound when an application component binds to it by calling bindService().
                A bound service offers a client-server interface that allows components to interact
                with the service, send requests, get results, and even do so across processes with
                interprocess communication (IPC).

                When the last client unbinds from the service, the system destroys the service EXCEPT
                If the service was started by startService

            Unbounded Service or Started

                A service is started when an application component, such as an activity,
                starts it by calling startService(). Once started, a service can run in the background
                indefinitely, even if the component that started it is destroyed.

 */
//----------------------------
/*
    References:
        https://www.tutorialspoint.com/android/android_services.htm
        http://stackoverflow.com/questions/31451476/what-is-the-difference-between-service-intentservice-in-android
        https://github.com/lgvalle/Material-Animations
 */

