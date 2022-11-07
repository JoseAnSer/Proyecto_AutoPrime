package com.example.proyecto_autoprime;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.VideoFondo);
        videoView.setVideoURI(Uri.parse('android.resources//' + getPackageName() + '/'+ R.drawable.Fondo_ );

    }
}