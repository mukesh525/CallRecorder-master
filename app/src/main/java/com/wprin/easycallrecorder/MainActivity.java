package com.wprin.easycallrecorder;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.io.File;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(this, CallRecorderService.class));

    }
    //sedcond commit
//secondbrach
 //TESTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
}
